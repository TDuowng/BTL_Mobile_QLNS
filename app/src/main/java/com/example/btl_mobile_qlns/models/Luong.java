package com.example.btl_mobile_qlns.models;

public class Luong {
    private int maLuong;
    private String maNhanVien;
    private String hoTen;
    private String thangNam;
    private double luongCoBan;
    private double phuCap;
    private double soGioLam;
    private int soNgayLam;
    private double soGioTangCa;
    private double luongTangCa;
    private double tongLuong;
    private String trangThai;
    private String ngayTinhLuong;

    public Luong() {
    }

    public Luong(int maLuong, String maNhanVien, String thangNam, double luongCoBan, double phuCap, double soGioLam, double tongLuong, String trangThai) {
        this.maLuong = maLuong;
        this.maNhanVien = maNhanVien;
        this.thangNam = thangNam;
        this.luongCoBan = luongCoBan;
        this.phuCap = phuCap;
        this.soGioLam = soGioLam;
        this.tongLuong = tongLuong;
        this.trangThai = trangThai;
    }

    public int getMaLuong() {
        return maLuong;
    }

    public void setMaLuong(int maLuong) {
        this.maLuong = maLuong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getThangNam() {
        return thangNam;
    }

    public void setThangNam(String thangNam) {
        this.thangNam = thangNam;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public double getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(double soGioLam) {
        this.soGioLam = soGioLam;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public void setSoNgayLam(int soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    public double getSoGioTangCa() {
        return soGioTangCa;
    }

    public void setSoGioTangCa(double soGioTangCa) {
        this.soGioTangCa = soGioTangCa;
    }

    public double getLuongTangCa() {
        return luongTangCa;
    }

    public void setLuongTangCa(double luongTangCa) {
        this.luongTangCa = luongTangCa;
    }

    public double getTongLuong() {
        return tongLuong;
    }

    public void setTongLuong(double tongLuong) {
        this.tongLuong = tongLuong;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getNgayTinhLuong() {
        return ngayTinhLuong;
    }

    public void setNgayTinhLuong(String ngayTinhLuong) {
        this.ngayTinhLuong = ngayTinhLuong;
    }
}
