package com.huy.entity;

public class GiamDoc extends Nhanvien{
	String chucvu;
	String tennhanvien;
	int tuoi;
	GiamDoc doc;
	public String getChucvu() {
		return chucvu;
	}
	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}
	public String getTennhanvien() {
		return tennhanvien;
	}
	public void setTennhanvien(String tennhanvien) {
		this.tennhanvien = tennhanvien;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public GiamDoc getDoc() {
		return doc;
	}
	public void setDoc(GiamDoc doc) {
		this.doc = doc;
	}
	public GiamDoc(String chucvu, String tennhanvien, int tuoi) {
		super();
		this.chucvu = chucvu;
		this.tennhanvien = tennhanvien;
		this.tuoi = tuoi;
		
	}
	public GiamDoc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GiamDoc(GiamDoc doc) {
		super(doc);
		// TODO Auto-generated constructor stub
	}
	

	
}
