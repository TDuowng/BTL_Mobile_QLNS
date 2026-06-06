package com.example.btl_mobile_qlns.models;

import java.io.Serializable;

public class ChucVu implements Serializable {
    private String maChucVu;
    private String tenChucVu;
    private double mucLuongCoBan;
    private int trangThai;
    private int soNhanVien;

    public ChucVu() {
    }

    public ChucVu(String maChucVu, String tenChucVu, double mucLuongCoBan, int trangThai) {
        this.maChucVu = maChucVu;
        this.tenChucVu = tenChucVu;
        this.mucLuongCoBan = mucLuongCoBan;
        this.trangThai = trangThai;
    }

    public String getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(String maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }

    public double getMucLuongCoBan() {
        return mucLuongCoBan;
    }

    public void setMucLuongCoBan(double mucLuongCoBan) {
        this.mucLuongCoBan = mucLuongCoBan;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public int getSoNhanVien() {
        return soNhanVien;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }
}