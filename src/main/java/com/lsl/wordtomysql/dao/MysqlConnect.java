package com.lsl.wordtomysql.dao;

import com.lsl.wordtomysql.pojo.Specification;
import com.lsl.wordtomysql.until.DBUntil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 * @ClassName MysqlConnect
 * @Description mysql操作
 * @Author lsl
 * @Version 1.0
 **/
public class MysqlConnect {

    /**
     * @Author  lsl
     * @Description 增加操作
     * @Date 16:37 2019/6/5
     * @Param [specification]
     * @return void
     **/
    public static void addSpecification(Specification specification) {
        //System.out.println(specification.toString());
        Connection conn = DBUntil.connectDB();
        PreparedStatement ps = null;
        /*String sql = "INSERT INTO specification"
                + " VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        */
        String sql = "INSERT INTO specification_copy1"
                + " VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement psmt = null;
        try {
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, specification.getId());
            psmt.setString(2, specification.getName());
            psmt.setString(3, specification.getGenericName());
            psmt.setString(4, specification.getPinyinName());
            psmt.setString(5, specification.getEnglishName());
            psmt.setString(6, specification.getBases());
            psmt.setString(7, specification.getIngredient());
            psmt.setString(8, specification.getCharacter());
            psmt.setString(9, specification.getFunctionCategory());
            psmt.setString(10, specification.getMajorFunction());
            psmt.setString(11, specification.getSpecification());
            psmt.setString(12, specification.getPackaging());
            psmt.setString(13, specification.getUsageAndDosage());
            psmt.setString(14, specification.getAdverseReaction());
            psmt.setString(15, specification.getTaboo());
            psmt.setString(16, specification.getMattersNeedAttention());
            psmt.setString(17, specification.getWomenMedicine());
            psmt.setString(18, specification.getChildrenMedicine());
            psmt.setString(19, specification.getGeriatricMedicine());
            psmt.setString(20, specification.getDrugInteractions());
            psmt.setString(21, specification.getOverdose());
            psmt.setString(22, specification.getDrugEffect());
            psmt.setString(23, specification.getPharmacokinetics());
            psmt.setString(24, specification.getReposit());
            psmt.setString(25, specification.getPeriodOfValidity());
            psmt.setString(26, specification.getExecutiveStandard());
            psmt.setString(27, specification.getApprovalNumber());
            psmt.setString(28, specification.getDosage());
            psmt.setString(29, specification.getManufacturingEnterprise());
            psmt.setString(30, specification.getPlaceOfOrigin());
            psmt.setString(31, specification.getRevisionDate());
            psmt.setString(32, specification.getStructureAndComposition());
            psmt.setString(33, specification.getProductionMode());
            psmt.setString(34, specification.getPerformance());
            psmt.setString(35, specification.getUse());
            psmt.setString(36, specification.getScopeOfApplication());
            psmt.setString(37, specification.getConcentration());
            psmt.setString(38, specification.getTransportation());
            psmt.setString(39, specification.getPartsList());
            psmt.setString(40, specification.getRegistrationNumber());
            psmt.setString(41, specification.getTechnicalRequirements());
            psmt.setString(42, specification.getLicenseKey());
            psmt.setString(43, specification.getHealthcareFunction());
            psmt.setString(44, specification.getCompositionAndContent());
            psmt.setString(45, specification.getCommendedUser());
            psmt.setString(46, specification.getDisCommendedUser());
            psmt.setString(47, specification.getProductionLicense());
            psmt.setString(48, specification.getSanitaryPermitNumber());
            psmt.setString(49, specification.getDealer());
            int a = psmt.executeUpdate();
            if (a > 0) {
                //System.out.println("添加成功");
            } else {
                System.out.println("添加失败");
            }
        } catch (SQLException e) {
            System.out.println("添加失败");
            e.printStackTrace();
        }finally {
            try {
                // 关闭
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }


    }
}
