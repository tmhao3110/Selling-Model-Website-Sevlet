/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author AhihiDoNgoc
 */
public class SanPham {

    private int maSP;
    private String tenSP;
    private int gia;
    private int soLuong;
    private String hinh;
    private int maDM;

    public SanPham() {
        this.maSP = 0;
        this.tenSP = "";
        this.gia = 0;
        this.soLuong = 0;
        this.hinh = "";
        this.maDM = 0;
    }

    public SanPham(int maSP, String tenSP, int gia, int soLuong, String hinh, int maDM) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.soLuong = soLuong;
        this.hinh = hinh;
        this.maDM = maDM;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public int getMaDM() {
        return maDM;
    }

    public void setMaDM(int maDM) {
        this.maDM = maDM;
    }

}
