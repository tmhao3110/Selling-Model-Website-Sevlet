/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.DanhMuc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author AhihiDoNgoc
 */
public class DanhMucModel {
    public DanhMucModel() {
    }
    
    public ArrayList getList() {
        ArrayList<DanhMuc> list = new ArrayList<>();
        
        Connection conn = new MyConnect().getConnect();
        
        if(conn == null)
            return null;
        
        try {
            String sql = "SELECT * FROM DANHMUC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                DanhMuc dm = new DanhMuc(rs.getInt(1), rs.getString(2));
                list.add(dm);
            }
            
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
