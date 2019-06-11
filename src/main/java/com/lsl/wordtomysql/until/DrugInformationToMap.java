package com.lsl.wordtomysql.until;

import com.lsl.wordtomysql.dao.MysqlConnect;
import com.lsl.wordtomysql.pojo.DrugYZ;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName DrugInformationToMap
 * @Description TODO
 * @Author lsl
 * @Date 2019/6/10 17:18
 * @Version 1.0
 **/
public class DrugInformationToMap {
    public void strToMap(String fileValue) {
        Map<String, String> drugYZMap = new HashMap(16);
        String KEY_MATCHING_1 = "\\n";
        String KEY_MATCHING_2 = "\\t";
        String[] strArray = fileValue.trim().split(KEY_MATCHING_1);
        strToMapIncision2(strArray, KEY_MATCHING_2);
        /*for (Map.Entry<String, String> aaa : specificationMap.entrySet()) {
            System.out.println(aaa);
        }*/
    }

    public void strToMapIncision1(String[] strArray, String key_matching_2) {
        DrugYZ drugYZ = new DrugYZ();
        String str ="";
        for (int i = 0; i < strArray.length; i++) {
            String[] split = strArray[i].split(key_matching_2);
            for (int j = 0; j < split.length; j++) {
                try {
                    str = split[j];
                } catch (Exception e) {
                }
                switch (j){
                    case 0:
                        drugYZ.setTradeName(str);
                        break;
                    case 1:
                        drugYZ.setDrugName(str);
                        break;
                    case 2:
                        drugYZ.setEnglishName(str);
                        break;
                    case 3:
                        drugYZ.setApprovalNumber(str);
                        break;
                    case 4:
                        drugYZ.setPreApprovalNumber(str);
                        break;
                    case 5:
                        drugYZ.setStandardCode(str);
                        break;
                    case 6:
                        drugYZ.setStandardCodeDesc(str);
                        break;
                    case 7:
                        drugYZ.setManufacturerName(str);
                        break;
                    case 8:
                        drugYZ.setPlaceOfOrigin(str);
                        break;
                    case 9:
                        drugYZ.setSpecification(str);
                        break;
                    case 10:
                        drugYZ.setDosageForm(str);
                        break;
                    case 11:
                        drugYZ.setType(str);
                        break;
                    case 12:
                        drugYZ.setApprovalDate(str);
                        break;
                    case 13:
                        drugYZ.setHealthCareType(str);
                        break;
                }
            }
            MysqlConnect.addDrugInformation(drugYZ);
        }
    }
    public void strToMapIncision2(String[] strArray, String key_matching_2) {
        DrugYZ drugYZ = new DrugYZ();
        String str ="";
        for (int i = 0; i < strArray.length; i++) {
            String[] split = strArray[i].split(key_matching_2);
            for (int j = 0; j < split.length; j++) {
                try {
                    str = split[j];
                } catch (Exception e) {
                }
                switch (j){
                    case 0:
                        drugYZ.setTradeName(str);
                        break;
                    case 1:
                        drugYZ.setTradeEnglishName(str);
                        break;
                    case 2:
                        drugYZ.setDrugName(str);
                        break;
                    case 3:
                        drugYZ.setEnglishName(str);
                        break;
                    case 4:
                        drugYZ.setManufacturerName(str);
                        break;
                    case 5:
                        drugYZ.setPlaceOfOrigin(str);
                        break;
                    case 6:
                        drugYZ.setProducingCountries(str);
                        break;
                    case 7:
                        drugYZ.setManufacturerEnglishName(str);
                        break;
                    case 8:
                        drugYZ.setPlaceOfOriginEnglish(str);
                        break;
                    case 9:
                        drugYZ.setProducingCountriesEnglish(str);
                        break;
                    case 10:
                        drugYZ.setSpecification(str);
                        break;
                    case 11:
                        drugYZ.setDosageForm(str);
                        break;
                    case 12:
                        drugYZ.setPackingSpecification(str);
                        break;
                    case 13:
                        drugYZ.setSubPackagingCompany(str);
                        break;
                    case 14:
                        drugYZ.setCertificateDate(str);
                        break;
                    case 15:
                        drugYZ.setExpirationDate(str);
                        break;
                    case 16:
                        drugYZ.setStandardCode(str);
                        break;
                    case 17:
                        drugYZ.setType(str);
                        break;
                    case 18:
                        drugYZ.setRegistrationNumber(str);
                        break;
                    case 19:
                        drugYZ.setPreRegistrationNumber(str);
                        break;
                    case 20:
                        drugYZ.setApprovalNumber(str);
                        break;
                }
            }
            MysqlConnect.addDrugInformation(drugYZ);
        }
    }
}
