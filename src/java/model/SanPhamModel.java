/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author AhihiDoNgoc
 */
public class SanPhamModel {
    public ArrayList getList() {
        ArrayList<SanPham> list = new ArrayList<>();
        
        Connection conn = new MyConnect().getConnect();
        
        if(conn == null)
            return null;
        
        try {
            String sql = "SELECT * FROM SANPHAM";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
                SanPham sp = new SanPham(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), 
                        rs.getString(5), rs.getInt(6));
                list.add(sp);
            }
            
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public int insertSanPham(SanPham sp) {
        int kq = 0;
        
        Connection conn = new MyConnect().getConnect();
        
        if(conn == null)
            return -1;
        
        try {
            String sql = "INSERT INTO SanPham VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sp.getTenSP());
            ps.setInt(2, sp.getGia());
            ps.setInt(3, sp.getSoLuong());
            ps.setString(4, sp.getHinh());
            ps.setInt(5, sp.getMaDM());
            
            kq = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kq;
    }
}
