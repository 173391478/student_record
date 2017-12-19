package com.lzlz.student.record.entiy;

public class GeneralCertificate {
	private long sno;
	private String gctype;
	private String gctime;
	private float gcgrade;

	public GeneralCertificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GeneralCertificate(long sno, String gctype, String gctime, float gcgrade) {
		super();
		this.sno = sno;
		this.gctype = gctype;
		this.gctime = gctime;
		this.gcgrade = gcgrade;
	}

	public long getSno() {
		return sno;
	}

	public void setSno(long sno) {
		this.sno = sno;
	}

	public String getGctype() {
		return gctype;
	}

	public void setGctype(String gctype) {
		this.gctype = gctype;
	}

	public String getGctime() {
		return gctime;
	}

	public void setGctime(String gctime) {
		this.gctime = gctime;
	}

	public float getGcgrade() {
		return gcgrade;
	}

	public void setGcgrade(float gcgrade) {
		this.gcgrade = gcgrade;
	}

	@Override
	public String toString() {
		return "GeneralCertificate [sno=" + sno + ", gctype=" + gctype + ", gctime=" + gctime + ", gcgrade=" + gcgrade
				+ "]";
	}

}
