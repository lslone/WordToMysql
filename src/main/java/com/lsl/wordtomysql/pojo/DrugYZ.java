package com.lsl.wordtomysql.pojo;

/**
 * @ClassName DrugYZ
 * @Description TODO
 * @Author lsl
 * @Date 2019/6/10 14:49
 * @Version 1.0
 **/
public class DrugYZ {
    //商品名
    private String tradeName;
    //商品英文名
    private String tradeEnglishName;
    //药品名称
    private String drugName;
    //药品英文名称
    private String EnglishName;
    //生产厂商中文名
    private String manufacturerName;
    //生产厂商英文名
    private String manufacturerEnglishName;
    //厂商地址
    private String placeOfOrigin;
    //厂商地址英文
    private String placeOfOriginEnglish;
    //厂商国家
    private String producingCountries;
    //厂商国家
    private String producingCountriesEnglish;
    //规格
    private String specification;
    //剂型
    private String dosageForm;
    //包装规格
    private String packingSpecification;
    //分包装企业
    private String subPackagingCompany;
    //发证日期
    private String certificateDate;
    //有效期截止日
    private String expirationDate;
    //批准文号
    private String approvalNumber;
    //原批准文号
    private String preApprovalNumber;
    //药品本位码
    private String standardCode;
    //产品类型
    private String type;
    //注册证号
    private String registrationNumber;
    //原注册证号
    private String preRegistrationNumber;
    //药品本位码备注
    private String standardCodeDesc;
    //批准日期
    private String approvalDate;
    //医保类别
    private String healthCareType;
    //进口药标识
    private String importLabel;

    public String getImportLabel() {
        return importLabel;
    }

    public void setImportLabel(String importLabel) {
        this.importLabel = importLabel;
    }


    public DrugYZ() {
    }

    public DrugYZ(String tradeName, String tradeEnglishName, String drugName, String englishName, String manufacturerName, String manufacturerEnglishName, String placeOfOrigin, String producingCountries, String specification, String dosageForm, String packingSpecification, String subPackagingCompany, String certificateDate, String expirationDate, String approvalNumber, String preApprovalNumber, String standardCode, String type, String registrationNumber, String preRegistrationNumber, String standardCodeDesc, String approvalDate, String healthCareType) {
        this.tradeName = tradeName;
        this.tradeEnglishName = tradeEnglishName;
        this.drugName = drugName;
        EnglishName = englishName;
        this.manufacturerName = manufacturerName;
        this.manufacturerEnglishName = manufacturerEnglishName;
        this.placeOfOrigin = placeOfOrigin;
        this.producingCountries = producingCountries;
        this.specification = specification;
        this.dosageForm = dosageForm;
        this.packingSpecification = packingSpecification;
        this.subPackagingCompany = subPackagingCompany;
        this.certificateDate = certificateDate;
        this.expirationDate = expirationDate;
        this.approvalNumber = approvalNumber;
        this.preApprovalNumber = preApprovalNumber;
        this.standardCode = standardCode;
        this.type = type;
        this.registrationNumber = registrationNumber;
        this.preRegistrationNumber = preRegistrationNumber;
        this.standardCodeDesc = standardCodeDesc;
        this.approvalDate = approvalDate;
        this.healthCareType = healthCareType;
    }

    public String getProducingCountriesEnglish() {
        return producingCountriesEnglish;
    }

    public void setProducingCountriesEnglish(String producingCountriesEnglish) {
        this.producingCountriesEnglish = producingCountriesEnglish;
    }

    public String getPlaceOfOriginEnglish() {
        return placeOfOriginEnglish;
    }

    public void setPlaceOfOriginEnglish(String placeOfOriginEnglish) {
        this.placeOfOriginEnglish = placeOfOriginEnglish;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getTradeEnglishName() {
        return tradeEnglishName;
    }

    public void setTradeEnglishName(String tradeEnglishName) {
        this.tradeEnglishName = tradeEnglishName;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getEnglishName() {
        return EnglishName;
    }

    public void setEnglishName(String englishName) {
        EnglishName = englishName;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerEnglishName() {
        return manufacturerEnglishName;
    }

    public void setManufacturerEnglishName(String manufacturerEnglishName) {
        this.manufacturerEnglishName = manufacturerEnglishName;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getProducingCountries() {
        return producingCountries;
    }

    public void setProducingCountries(String producingCountries) {
        this.producingCountries = producingCountries;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm;
    }

    public String getPackingSpecification() {
        return packingSpecification;
    }

    public void setPackingSpecification(String packingSpecification) {
        this.packingSpecification = packingSpecification;
    }

    public String getSubPackagingCompany() {
        return subPackagingCompany;
    }

    public void setSubPackagingCompany(String subPackagingCompany) {
        this.subPackagingCompany = subPackagingCompany;
    }

    public String getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(String certificateDate) {
        this.certificateDate = certificateDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public String getPreApprovalNumber() {
        return preApprovalNumber;
    }

    public void setPreApprovalNumber(String preApprovalNumber) {
        this.preApprovalNumber = preApprovalNumber;
    }

    public String getStandardCode() {
        return standardCode;
    }

    public void setStandardCode(String standardCode) {
        this.standardCode = standardCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getPreRegistrationNumber() {
        return preRegistrationNumber;
    }

    public void setPreRegistrationNumber(String preRegistrationNumber) {
        this.preRegistrationNumber = preRegistrationNumber;
    }

    public String getStandardCodeDesc() {
        return standardCodeDesc;
    }

    public void setStandardCodeDesc(String standardCodeDesc) {
        this.standardCodeDesc = standardCodeDesc;
    }

    public String getApprovalDate() {
        return approvalDate;
    }

    public void setApprovalDate(String approvalDate) {
        this.approvalDate = approvalDate;
    }

    public String getHealthCareType() {
        return healthCareType;
    }

    public void setHealthCareType(String healthCareType) {
        this.healthCareType = healthCareType;
    }

    @Override
    public String toString() {
        return "DrugYZ{" +
                "tradeName='" + tradeName + '\'' +
                ", tradeEnglishName='" + tradeEnglishName + '\'' +
                ", drugName='" + drugName + '\'' +
                ", EnglishName='" + EnglishName + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", manufacturerEnglishName='" + manufacturerEnglishName + '\'' +
                ", placeOfOrigin='" + placeOfOrigin + '\'' +
                ", producingCountries='" + producingCountries + '\'' +
                ", specification='" + specification + '\'' +
                ", dosageForm='" + dosageForm + '\'' +
                ", packingSpecification='" + packingSpecification + '\'' +
                ", subPackagingCompany='" + subPackagingCompany + '\'' +
                ", certificateDate='" + certificateDate + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", approvalNumber='" + approvalNumber + '\'' +
                ", preApprovalNumber='" + preApprovalNumber + '\'' +
                ", standardCode='" + standardCode + '\'' +
                ", type='" + type + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", preRegistrationNumber='" + preRegistrationNumber + '\'' +
                ", standardCodeDesc='" + standardCodeDesc + '\'' +
                ", approvalDate='" + approvalDate + '\'' +
                ", healthCareType='" + healthCareType + '\'' +
                ", importLabel='" + importLabel + '\'' +
                '}';
    }
}
