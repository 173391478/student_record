package com.lzlz.student.record.entiy;

public class ClassRoom {
	private int crno;
	private String craddress;
	private String sstate;

	public ClassRoom() {
		super();
	}

	public ClassRoom(int crno, String craddress, String sstate) {
		super();
		this.crno = crno;
		this.craddress = craddress;
		this.sstate = sstate;
	}

	public int getCrno() {
		return crno;
	}

	public void setCrno(int crno) {
		this.crno = crno;
	}

	public String getCraddress() {
		return craddress;
	}

	public void setCraddress(String craddress) {
		this.craddress = craddress;
	}

	public String getSstate() {
		return sstate;
	}

	public void setSstate(String sstate) {
		this.sstate = sstate;
	}

	@Override
	public String toString() {
		return "Classroom [crno=" + crno + ", craddress=" + craddress + ", sstate=" + sstate + "]";
	}

}
