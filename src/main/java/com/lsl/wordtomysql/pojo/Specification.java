package com.lsl.wordtomysql.pojo;

/**
 * @ClassName Specification
 * @Description bean类
 * @Author lsl
 * @Version 1.0
 **/
public class Specification {
    private String id;
    //产品名称
    private String name;
    //商品名称
    private String genericName;
    //英文名称
    private String pinyinName;
    //汉语拼音
    private String EnglishName;
    //主要成分
    private String bases;
    //成分
    private String ingredient;
    //性状
    private String character;
    //作用类别
    private String functionCategory;
    //功能主治
    private String majorFunction;
    //规格
    private String specification;
    //包装
    private String packaging;
    //用法用量
    private String usageAndDosage;
    //不良反应
    private String adverseReaction;
    //禁忌
    private String taboo;
    //注意事项
    private String mattersNeedAttention;
    //孕妇及哺乳期妇女用药
    private String womenMedicine;
    //儿童用药
    private String childrenMedicine;
    //老年用药
    private String geriatricMedicine;
    //药物的相互作用
    private String drugInteractions;
    //药物过量
    private String overdose;
    //药物作用
    private String drugEffect;
    //药代动力学
    private String pharmacokinetics;
    //贮藏
    private String reposit;
    //有效期
    private String periodOfValidity;
    //执行标准
    private String executiveStandard;
    //批准文号
    private String approvalNumber;
    //剂型
    private String dosage;
    //生产企业
    private String manufacturingEnterprise;
    //产地
    private String placeOfOrigin;
    //说明书修订日期
    private String revisionDate;
    //产品性能结构及组成
    private String structureAndComposition;
    //生产方式
    private String productionMode;
    //性能
    private String performance;
    //用途
    private String use;
    //适用范围
    private String scopeOfApplication;
    //浓度
    private String concentration;
    //运输
    private String transportation;
    //配件清单
    private String partsList;
    //产品注册码编号
    private String registrationNumber;
    //产品技术要求
    private String technicalRequirements;
    //企业器械许可证号
    private String licenseKey ;
    //保健功能
    private String healthcareFunction;
    //功效成份及含量
    private String compositionAndContent;
    //适宜人群
    private String commendedUser ;
    //不适宜人群
    private String disCommendedUser ;
    //生产许可证号
    private String productionLicense ;
    //卫生许可证号
    private String sanitaryPermitNumber ;
    //经销商
    private String dealer;

    public Specification(String name, String genericName, String pinyinName, String ingredient, String character, String majorFunction, String specification, String usageAndDosage, String adverseReaction, String taboo, String mattersNeedAttention, String drugInteractions, String reposit, String packaging, String periodOfValidity, String executiveStandard, String approvalNumber, String manufacturingEnterprise) {
        this.name = name;
        this.genericName = genericName;
        this.pinyinName = pinyinName;
        this.ingredient = ingredient;
        this.character = character;
        this.majorFunction = majorFunction;
        this.specification = specification;
        this.usageAndDosage = usageAndDosage;
        this.adverseReaction = adverseReaction;
        this.taboo = taboo;
        this.mattersNeedAttention = mattersNeedAttention;
        this.drugInteractions = drugInteractions;
        this.reposit = reposit;
        this.packaging = packaging;
        this.periodOfValidity = periodOfValidity;
        this.executiveStandard = executiveStandard;
        this.approvalNumber = approvalNumber;
        this.manufacturingEnterprise = manufacturingEnterprise;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStructureAndComposition() {
        return structureAndComposition;
    }

    public void setStructureAndComposition(String structureAndComposition) {
        this.structureAndComposition = structureAndComposition;
    }

    public String getCompositionAndContent() {
        return compositionAndContent;
    }

    public void setCompositionAndContent(String compositionAndContent) {
        this.compositionAndContent = compositionAndContent;
    }

    public String getProductionMode() {
        return productionMode;
    }

    public void setProductionMode(String productionMode) {
        this.productionMode = productionMode;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public String getHealthcareFunction() {
        return healthcareFunction;
    }

    public void setHealthcareFunction(String healthcareFunction) {
        this.healthcareFunction = healthcareFunction;
    }

    public String getScopeOfApplication() {
        return scopeOfApplication;
    }

    public void setScopeOfApplication(String scopeOfApplication) {
        this.scopeOfApplication = scopeOfApplication;
    }

    public String getConcentration() {
        return concentration;
    }

    public void setConcentration(String concentration) {
        this.concentration = concentration;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public String getPartsList() {
        return partsList;
    }

    public void setPartsList(String partsList) {
        this.partsList = partsList;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getTechnicalRequirements() {
        return technicalRequirements;
    }

    public void setTechnicalRequirements(String technicalRequirements) {
        this.technicalRequirements = technicalRequirements;
    }

    public String getLicenseKey() {
        return licenseKey;
    }

    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    public String getDealer() {
        return dealer;
    }

    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

    public String getCommendedUser() {
        return commendedUser;
    }

    public void setCommendedUser(String commendedUser) {
        this.commendedUser = commendedUser;
    }

    public String getDisCommendedUser() {
        return disCommendedUser;
    }

    public void setDisCommendedUser(String disCommendedUser) {
        this.disCommendedUser = disCommendedUser;
    }

    public String getProductionLicense() {
        return productionLicense;
    }

    public void setProductionLicense(String productionLicense) {
        this.productionLicense = productionLicense;
    }

    public String getSanitaryPermitNumber() {
        return sanitaryPermitNumber;
    }

    public void setSanitaryPermitNumber(String sanitaryPermitNumber) {
        this.sanitaryPermitNumber = sanitaryPermitNumber;
    }

    public String getBases() {
        return bases;
    }

    public void setBases(String bases) {
        this.bases = bases;
    }

    public String getFunctionCategory() {
        return functionCategory;
    }

    public void setFunctionCategory(String functionCategory) {
        this.functionCategory = functionCategory;
    }

    public String getOverdose() {
        return overdose;
    }

    public void setOverdose(String overdose) {
        this.overdose = overdose;
    }

    public String getDrugEffect() {
        return drugEffect;
    }

    public void setDrugEffect(String drugEffect) {
        this.drugEffect = drugEffect;
    }

    public String getPharmacokinetics() {
        return pharmacokinetics;
    }

    public void setPharmacokinetics(String pharmacokinetics) {
        this.pharmacokinetics = pharmacokinetics;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(String revisionDate) {
        this.revisionDate = revisionDate;
    }

    public Specification() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenericName() {
        return genericName;
    }

    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }

    public String getPinyinName() {
        return pinyinName;
    }

    public void setPinyinName(String pinyinName) {
        this.pinyinName = pinyinName;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getMajorFunction() {
        return majorFunction;
    }

    public void setMajorFunction(String majorFunction) {
        this.majorFunction = majorFunction;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getUsageAndDosage() {
        return usageAndDosage;
    }

    public void setUsageAndDosage(String usageAndDosage) {
        this.usageAndDosage = usageAndDosage;
    }

    public String getAdverseReaction() {
        return adverseReaction;
    }

    public void setAdverseReaction(String adverseReaction) {
        this.adverseReaction = adverseReaction;
    }

    public String getTaboo() {
        return taboo;
    }

    public void setTaboo(String taboo) {
        this.taboo = taboo;
    }

    public String getMattersNeedAttention() {
        return mattersNeedAttention;
    }

    public void setMattersNeedAttention(String mattersNeedAttention) {
        this.mattersNeedAttention = mattersNeedAttention;
    }

    public String getDrugInteractions() {
        return drugInteractions;
    }

    public void setDrugInteractions(String drugInteractions) {
        this.drugInteractions = drugInteractions;
    }

    public String getReposit() {
        return reposit;
    }

    public void setReposit(String reposit) {
        this.reposit = reposit;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public String getPeriodOfValidity() {
        return periodOfValidity;
    }

    public void setPeriodOfValidity(String periodOfValidity) {
        this.periodOfValidity = periodOfValidity;
    }

    public String getExecutiveStandard() {
        return executiveStandard;
    }

    public void setExecutiveStandard(String executiveStandard) {
        this.executiveStandard = executiveStandard;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public String getManufacturingEnterprise() {
        return manufacturingEnterprise;
    }

    public void setManufacturingEnterprise(String manufacturingEnterprise) {
        this.manufacturingEnterprise = manufacturingEnterprise;
    }

    public String getEnglishName() {
        return EnglishName;
    }

    public void setEnglishName(String englishName) {
        EnglishName = englishName;
    }

    public String getWomenMedicine() {
        return womenMedicine;
    }

    public void setWomenMedicine(String womenMedicine) {
        this.womenMedicine = womenMedicine;
    }

    public String getChildrenMedicine() {
        return childrenMedicine;
    }

    public void setChildrenMedicine(String childrenMedicine) {
        this.childrenMedicine = childrenMedicine;
    }

    public String getGeriatricMedicine() {
        return geriatricMedicine;
    }

    public void setGeriatricMedicine(String geriatricMedicine) {
        this.geriatricMedicine = geriatricMedicine;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genericName='" + genericName + '\'' +
                ", pinyinName='" + pinyinName + '\'' +
                ", EnglishName='" + EnglishName + '\'' +
                ", bases='" + bases + '\'' +
                ", ingredient='" + ingredient + '\'' +
                ", compositionAndContent='" + compositionAndContent + '\'' +
                ", character='" + character + '\'' +
                ", productionMode='" + productionMode + '\'' +
                ", performance='" + performance + '\'' +
                ", use='" + use + '\'' +
                ", functionCategory='" + functionCategory + '\'' +
                ", majorFunction='" + majorFunction + '\'' +
                ", healthcareFunction='" + healthcareFunction + '\'' +
                ", specification='" + specification + '\'' +
                ", scopeOfApplication='" + scopeOfApplication + '\'' +
                ", usageAndDosage='" + usageAndDosage + '\'' +
                ", adverseReaction='" + adverseReaction + '\'' +
                ", taboo='" + taboo + '\'' +
                ", mattersNeedAttention='" + mattersNeedAttention + '\'' +
                ", concentration='" + concentration + '\'' +
                ", womenMedicine='" + womenMedicine + '\'' +
                ", childrenMedicine='" + childrenMedicine + '\'' +
                ", geriatricMedicine='" + geriatricMedicine + '\'' +
                ", drugInteractions='" + drugInteractions + '\'' +
                ", overdose='" + overdose + '\'' +
                ", structureAndComposition='" + structureAndComposition + '\'' +
                ", drugEffect='" + drugEffect + '\'' +
                ", pharmacokinetics='" + pharmacokinetics + '\'' +
                ", reposit='" + reposit + '\'' +
                ", transportation='" + transportation + '\'' +
                ", packaging='" + packaging + '\'' +
                ", partsList='" + partsList + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", technicalRequirements='" + technicalRequirements + '\'' +
                ", licenseKey='" + licenseKey + '\'' +
                ", periodOfValidity='" + periodOfValidity + '\'' +
                ", executiveStandard='" + executiveStandard + '\'' +
                ", approvalNumber='" + approvalNumber + '\'' +
                ", dosage='" + dosage + '\'' +
                ", manufacturingEnterprise='" + manufacturingEnterprise + '\'' +
                ", dealer='" + dealer + '\'' +
                ", placeOfOrigin='" + placeOfOrigin + '\'' +
                ", revisionDate='" + revisionDate + '\'' +
                ", commendedUser='" + commendedUser + '\'' +
                ", disCommendedUser='" + disCommendedUser + '\'' +
                ", productionLicense='" + productionLicense + '\'' +
                ", sanitaryPermitNumber='" + sanitaryPermitNumber + '\'' +
                '}';
    }
}
