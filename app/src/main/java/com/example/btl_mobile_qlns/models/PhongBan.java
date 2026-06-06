package com.example.btl_mobile_qlns.models;

public class PhongBan {
    private String maPhongBan;
    private String tenPhongBan;
    private String truongPhong;
    private int trangThai;
    private int soNhanVien;
    private String tenTruongPhong;

    public PhongBan() {
    }

    public PhongBan(String maPhongBan, String tenPhongBan, String truongPhong, int trangThai) {
        this.maPhongBan = maPhongBan;
        this.tenPhongBan = tenPhongBan;
        this.truongPhong = truongPhong;
        this.trangThai = trangThai;
    }

    public String getMaPhongBan() {
        return maPhongBan;
    }

    public void setMaPhongBan(String maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public String getTruongPhong() {
        return truongPhong;
    }

    public void setTruongPhong(String truongPhong) {
        this.truongPhong = truongPhong;
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

    public String getTenTruongPhong() {
        return tenTruongPhong;
    }

    public void setTenTruongPhong(String tenTruongPhong) {
        this.tenTruongPhong = tenTruongPhong;
    }
}
