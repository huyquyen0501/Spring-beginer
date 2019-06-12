package com.huy.entity;


public class Nhanvien {
	String tennhanvien;
	String diachi;
	int tuoi;
	GiamDoc doc;
	
	
	public Nhanvien() {
		
	}
	public void init() {
		System.out.println("Hello init");
	}
	public void destroy() {
		System.out.println("Hello destroy");
	}
	public void getThongBao() {
		System.out.println("Day la thong bao cua nhan vien:"+tennhanvien);
	}
	public String getTennhanvien() {
		return tennhanvien;
	}
	public void setTennhanvien(String tennhanvien) {
		this.tennhanvien = tennhanvien;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public static Nhanvien createNhanvien() {
		Nhanvien nv=new Nhanvien();
	nv.setTennhanvien("Huydeptrai");
		return nv;
	}
	public Nhanvien(GiamDoc doc) {
		this.doc=doc;
	}
	public GiamDoc getDoc() {
		return doc;
	}
	public void setDoc(GiamDoc doc) {
		this.doc = doc;
	}
}
