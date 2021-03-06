package com.lsl.wordtomysql.until;

import com.lsl.wordtomysql.dao.MysqlConnect;
import com.lsl.wordtomysql.pojo.DrugYZ;
import com.lsl.wordtomysql.pojo.Specification;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName TextContent
 * @Description 提取说明书文档的内容并转换
 * @Author lsl
 * @Version 1.0
 **/
public class TextContent {

    private static DrugInformationToMap drugInformationToMap=new DrugInformationToMap();
    /**
     * @Author  lsl
     * @Description 获取文件夹下文件
     * @Date 16:29 2019/6/5
     * @Param [file]
     * @return void
     **/
    public static void func(File file) {
        int i =1;
        File[] fs = file.listFiles();
        System.out.println(fs.length);
        for(File f:fs){
            if (f.isDirectory()) {
                func(f);
            } else if (f.isFile()) {
                if (i >= 1) {
                    String fileValue = TextContent.readContext(f);
                    drugInformationToMap.strToMap(fileValue);
                    /*Map strMap = TextContent.strToMap(fileValue);
                    Map mapToMap = TextContent.mapToMap(strMap);
                    TextContent.toSpecification(mapToMap);*/
                }
                i++;
                System.out.println(i);
            } else { }
        }
    }

    /**
     * @Author  lsl
     * @Description 文件读取成字符串
     * @Date 16:31 2019/6/5
     * @Param [file]
     * @return java.lang.String
     **/
    public static String readContext(File file) {
        String buffer = "";
        //System.out.println(file.getName());
        try {
            if (file.getName().endsWith("doc")) {
                System.out.println(file.getName());
                String id = TextContent.getId(file.getName());
                FileInputStream fis = new FileInputStream(file);
                HWPFDocument doc = new HWPFDocument(fis);
                buffer = doc.getDocumentText()+id;
                //System.out.println(buffer);
                doc.close();
                fis.close();
                /*FileInputStream fis = new FileInputStream(file);
                WordExtractor ex = new WordExtractor(fis);
                buffer = ex.getText();
                ex.close();
                fis.close();*/
            } else if (file.getName().endsWith("docx")) {
                System.out.println(file.getName());
                String id = TextContent.getId(file.getName());
                XWPFDocument xdoc = new XWPFDocument(new FileInputStream(file));
                XWPFWordExtractor extractor = new XWPFWordExtractor(xdoc);
                buffer = extractor.getText()+id;
                extractor.close();
                xdoc.close();
            } else if(file.getName().endsWith("txt")){
                System.out.println(file.getName());
                //String id = TextContent.getId(file.getName());
                StringBuilder result = new StringBuilder();
                InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "utf-8");
                BufferedReader br = new BufferedReader(isr);
                String s = null;
                while((s = br.readLine())!=null){
                    result.append(System.lineSeparator()+s);
                }
                //buffer=result.toString()+id;
                buffer=result.toString();
                br.close();
            }else{
                System.out.println(file.getName()+"文件错误！");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buffer;
    }


    /**
     * @Author  lsl
     * @Description 获取id
     * @Date 16:32 2019/6/5
     * @Param [fileName]
     * @return java.lang.String
     **/
    public static String getId(String fileName){
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(fileName);
        m.find();

        String strId="【id】"+m.group();
        //System.out.println(strId);
        return strId;
    }

    /**
     * @Author  lsl
     * @Description 切分字符串
     * @Date 16:32 2019/6/5
     * @Param [fileValue]
     * @return java.util.Map
     **/
    public static Map strToMap(String fileValue) {
        Map<String, String> specificationMap = new HashMap(16);
        String KEY_MATCHING_1 = "【";
        String KEY_MATCHING_2 = "】";
        String KEY_MATCHING_3 = "[";
        String KEY_MATCHING_4 = "]";
        if (fileValue.indexOf(KEY_MATCHING_1)>=0){
            String[] strArray = fileValue.trim().split(KEY_MATCHING_1);
            Map<String, String> stringStringMap = strToMapIncision(strArray, KEY_MATCHING_2);
            specificationMap.putAll(stringStringMap);
        }else if(fileValue.indexOf(KEY_MATCHING_3)>=0){
            String[] strArray = fileValue.trim().split(KEY_MATCHING_3);
            Map<String, String> stringStringMap = strToMapIncision(strArray, KEY_MATCHING_4);
            specificationMap.putAll(stringStringMap);
        }
        /*for (Map.Entry<String, String> aaa : specificationMap.entrySet()) {
            System.out.println(aaa);
        }*/
        return  specificationMap;
    }

    /**
     * @Author  lsl
     * @Description 提取切割后形成的map
     * @Date 16:47 2019/6/10
     * @Param [strArray, KEY_MATCHING_4]
     * @return java.util.Map<java.lang.String,java.lang.String>
     **/
    public static Map<String, String> strToMapIncision(String[] strArray,String KEY_MATCHING_4){
        Map<String, String> specificationMap = new HashMap(16);
        for (int i = 0; i < strArray.length; i++) {
            if (i == 0) { } else {
                String[] split = strArray[i].split(KEY_MATCHING_4);
                String str="";
                try {
                    str = split[1];
                } catch (Exception e) {
                    System.out.println(e);
                }
                String s = split[0].replaceAll("(?i)[^a-zA-Z0-9\u4E00-\u9FA5]", "");
                Map<String, String> matching = matchingSpecification(s, str);
                specificationMap.putAll(matching);
            }
        }
        return specificationMap;
    }

    /**
     * @Author  lsl
     * @Description 匹配添加至map中
     * @Date 16:15 2019/6/10
     * @Param [s, str]
     * @return java.util.Map<java.lang.String,java.lang.String>
     **/
    public static Map<String, String> matchingSpecification(String s,String str){
        Map<String, String> specificationMap = new HashMap(16);
        switch (s){
            case "id":
                specificationMap.put("id", str);
                break;
            case "药品名称": case "产品名称": case "通用名": case "通用名称":
                specificationMap.put("name",str);
                break;
            case "商品名称": case "商品名":
                specificationMap.put("genericName",str);
                break;
            case "英文名称":
                specificationMap.put("pinyinName",str);
                break;
            case "汉语拼音":
                specificationMap.put("EnglishName",str);
                break;
            case "主要成份":
                specificationMap.put("bases",str);
                break;
            case "成分": case "成份":case "配料":case "主要原料":
                specificationMap.put("ingredient",str);
                break;
            case "性状":
                specificationMap.put("character",str);
                break;
            case "作用类别":
                specificationMap.put("functionCategory",str);
                break;
            case "功能主治": case "适应症": case "适应症/功能主治":
                specificationMap.put("majorFunction",str);
                break;
            case "规格": case "规格型号": case "型号规格":
                specificationMap.put("specification",str);
                break;
            case "包装":case "包装规格":
                specificationMap.put("packaging",str);
                break;
            case "用法用量":case "食用方法及食用量":case "使用方法":
                specificationMap.put("usageAndDosage",str);
                break;
            case "不良反应":
                specificationMap.put("adverseReaction",str);
                break;
            case "禁忌": case "禁忌症":
                specificationMap.put("taboo",str);
                break;
            case "注意事项": case "禁忌症、注意事项":
                specificationMap.put("mattersNeedAttention",str);
                break;
            case "孕妇及哺乳期妇女用药": case "孕妇及妇女":
                specificationMap.put("womenMedicine",str);
                break;
            case "儿童用药":
                specificationMap.put("childrenMedicine",str);
                break;
            case "老年用药": case "老年患者用药": case "老年人用药":
                specificationMap.put("geriatricMedicine",str);
                break;
            case "药物相互作用":
                specificationMap.put("drugInteractions",str);
                break;
            case "药物过量":
                specificationMap.put("overdose",str);
                break;
            case "药理毒理": case "药理作用/药理毒理":
                specificationMap.put("drugEffect",str);
                break;
            case "药代动力学":
                specificationMap.put("pharmacokinetics",str);
                break;
            case "贮藏": case "贮藏条件": case "贮藏方法":
                specificationMap.put("reposit",str);
                break;
            case "有效期": case "保质期": case "使用期限":
                specificationMap.put("periodOfValidity",str);
                break;
            case "执行标准":
                specificationMap.put("executiveStandard",str);
                break;
            case "批准文号":
                specificationMap.put("approvalNumber",str);
                break;
            case "剂型":
                specificationMap.put("dosage",str);
                break;
            case "生产企业": case "生产企业/产地": case "注册人、生产企业、售后服务单位":
                specificationMap.put("manufacturingEnterprise",str);
                break;
            case "产地":
                specificationMap.put("placeOfOrigin",str);
                break;
            case "说明书修订日期":
                specificationMap.put("revisionDate",str);
                break;
            case "产品性能结构及组成":
                specificationMap.put("structureAndComposition",str);
                break;
            case "生产方式":
                specificationMap.put("productionMode",str);
                break;
            case "性能":
                specificationMap.put("performance",str);
                break;
            case "用途":
                specificationMap.put("use",str);
                break;
            case "适用范围":case "使用范围":
                specificationMap.put("scopeOfApplication",str);
            case "浓度":
                specificationMap.put("concentration",str);
                break;
            case "运输":
                specificationMap.put("transportation",str);
                break;
            case "配件清单":
                specificationMap.put("partsList",str);
                break;
            case "注册证编号/备案凭证编号": case "产品注册证编号":
                specificationMap.put("registrationNumber",str);
                break;
            case "技术要求编号":
                specificationMap.put("technicalRequirements",str);
                break;
            case "生产许可证编号/生产备案凭证编号": case "医疗器械生产企业许可证号":
                specificationMap.put("licenseKey",str);
                break;
            case "保健功能":
                specificationMap.put("healthcareFunction",str);
                break;
            case "功效成分及含量": case "功效成份及含量":
                specificationMap.put("compositionAndContent",str);
                break;
            case "适宜人群":
                specificationMap.put("commendedUser",str);
                break;
            case "不适宜人群":
                specificationMap.put("disCommendedUser",str);
                break;
            case "生产许可证号":
                specificationMap.put("productionLicense",str);
                break;
            case "卫生许可证": case "卫生许可证号":
                specificationMap.put("sanitaryPermitNumber",str);
                break;
            case "经销商":
                specificationMap.put("dealer",str);
                break;
            default:
                specificationMap.put("other",str);
                break;
        }
        return specificationMap;
    }

    /**
     * @Author  lsl
     * @Description 二次匹配切割、转换
     * @Date 16:33 2019/6/5
     * @Param [map]
     * @return java.util.Map
     **/
    public static Map mapToMap(Map<String,String> map) {
        String name = "";
        name = map.get("name");
        if (name == null) {
        }else if (name.indexOf("：")>=0) {
            String[] split = name.replaceAll("\\n\\n", "@").replaceAll("\\n", "@").split("@");
            for (int j = 0; j < split.length; j++) {
                if (split[j].indexOf("：")>=0){
                    String[] split1 =null;
                    split1 = split[j].split("：");
                    String s1 = split1[0].replaceAll("(?i)[^a-zA-Z0-9\u4E00-\u9FA5]", "");
                    try {
                        switch (s1) {
                            case "药品名称": case "产品名称": case "通用名": case "通用名称":
                                map.put("name",split1[1]);
                                break;
                            case "商品名称":
                            case "商品名":
                                map.put("genericName", split1[1]);
                                break;
                            case "汉语拼音": case "拼音全码":
                                map.put("pinyinName", split1[1]);
                                break;
                            case "英文名称":
                                map.put("EnglishName", split1[1]);
                                break;
                            default:
                                continue;
                        }
                    }catch (Exception e){
                        String demo="";
                        switch (s1) {
                            case "药品名称": case "产品名称": case "通用名": case "通用名称":
                                map.put("name",demo);
                                break;
                            case "商品名称":
                            case "商品名":
                                map.put("genericName", demo);
                                break;
                            case "汉语拼音": case "拼音全码":
                                map.put("pinyinName", demo);
                                break;
                            case "英文名称":
                                map.put("EnglishName", demo);
                                break;
                            default:
                                continue;
                        }
                    }
                }else {
                    if(j==0){
                        map.put("name", split[j]);
                    }
                }
            }
        }
        /*for (Object o : map.entrySet()) {
            System.out.println(o);
        }*/
        return map;
    }



    /**
     * @Author  lsl
     * @Description 转换为Specification类
     * @Date 16:33 2019/6/5
     * @Param [specificationMap]
     * @return void
     **/
    public static void toSpecification(Map<String,String> specificationMap){
        Specification specification = new Specification();
        for (String key : specificationMap.keySet()) {
            //System.out.println(key);
            String fieldsValue = specificationMap.get(key);
            key = key.replaceAll(" ", "");
            //System.out.println(fieldsValue);
            switch (key) {
                case "id":
                    specification.setId(fieldsValue);
                    break;
                case "name":
                    specification.setName(fieldsValue);
                    break;
                case "genericName":
                    specification.setGenericName(fieldsValue);
                    break;
                case "pinyinName":
                    specification.setPinyinName(fieldsValue);
                    break;
                case "EnglishName":
                    specification.setEnglishName(fieldsValue);
                    break;
                case "bases":
                    specification.setBases(fieldsValue);
                    break;
                case "ingredient":
                    specification.setIngredient(fieldsValue);
                    break;
                case "character":
                    specification.setCharacter(fieldsValue);
                    break;
                case "functionCategory":
                    specification.setFunctionCategory(fieldsValue);
                    break;
                case "majorFunction":
                    specification.setMajorFunction(fieldsValue);
                    break;
                case "specification":
                    specification.setSpecification(fieldsValue);
                    break;
                case "packaging":
                    specification.setPackaging(fieldsValue);
                    break;
                case "usageAndDosage":
                    specification.setUsageAndDosage(fieldsValue);
                    break;
                case "adverseReaction":
                    specification.setAdverseReaction(fieldsValue);
                    break;
                case "taboo":
                    specification.setTaboo(fieldsValue);
                    break;
                case "mattersNeedAttention":
                    specification.setMattersNeedAttention(fieldsValue);
                    break;
                case "womenMedicine":
                    specification.setWomenMedicine(fieldsValue);
                    break;
                case "childrenMedicine":
                    specification.setChildrenMedicine(fieldsValue);
                    break;
                case "geriatricMedicine":
                    specification.setGeriatricMedicine(fieldsValue);
                    break;
                case "drugInteractions":
                    specification.setDrugInteractions(fieldsValue);
                    break;
                case "overdose":
                    specification.setOverdose(fieldsValue);
                    break;
                case "drugEffect":
                    specification.setDrugEffect(fieldsValue);
                    break;
                case "pharmacokinetics":
                    specification.setPharmacokinetics(fieldsValue);
                    break;
                case "reposit":
                    specification.setReposit(fieldsValue);
                    break;
                case "periodOfValidity":
                    specification.setPeriodOfValidity(fieldsValue);
                    break;
                case "executiveStandard":
                    specification.setExecutiveStandard(fieldsValue);
                    break;
                case "approvalNumber":
                    specification.setApprovalNumber(fieldsValue);
                    break;
                case "dosage":
                    specification.setDosage(fieldsValue);
                    break;
                case "manufacturingEnterprise":
                    specification.setManufacturingEnterprise(fieldsValue);
                    break;
                case "placeOfOrigin":
                    specification.setPlaceOfOrigin(fieldsValue);
                    break;
                case "revisionDate":
                    specification.setRevisionDate(fieldsValue);
                    break;
                case "structureAndComposition":
                    specification.setStructureAndComposition(fieldsValue);
                    break;
                case "productionMode":
                    specification.setProductionMode(fieldsValue);
                    break;
                case "performance":
                    specification.setPerformance(fieldsValue);
                    break;
                case "use":
                    specification.setUse(fieldsValue);
                    break;
                case "scopeOfApplication":
                    specification.setScopeOfApplication(fieldsValue);
                    break;
                case "concentration":
                    specification.setConcentration(fieldsValue);
                    break;
                case "transportation":
                    specification.setTransportation(fieldsValue);
                    break;
                case "partsList":
                    specification.setPartsList(fieldsValue);
                    break;
                case "registrationNumber":
                    specification.setRegistrationNumber(fieldsValue);
                    break;
                case "technicalRequirements":
                    specification.setTechnicalRequirements(fieldsValue);
                    break;
                case "licenseKey":
                    specification.setLicenseKey(fieldsValue);
                    break;
                case "healthcareFunction":
                    specification.setHealthcareFunction(fieldsValue);
                    break;
                case "compositionAndContent":
                    specification.setCompositionAndContent(fieldsValue);
                    break;
                case "commendedUser":
                    specification.setCommendedUser(fieldsValue);
                    break;
                case "disCommendedUser":
                    specification.setDisCommendedUser(fieldsValue);
                    break;
                case "productionLicense":
                    specification.setProductionLicense(fieldsValue);
                    break;
                case "sanitaryPermitNumber":
                    specification.setSanitaryPermitNumber(fieldsValue);
                    break;
                case "dealer":
                    specification.setDealer(fieldsValue);
                    break;
                default:
                    //System.out.println("未识别字段为   "+fieldsKey+"对应内容为  "+fieldsValue);
            }
        }
        //System.out.println(specification);
        MysqlConnect.addSpecification(specification);
    }

}
