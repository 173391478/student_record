package com.lzlz.student.record.entiy;

public class ProfessCertificate {
	private long sno;
	private String pctype;
	private String pctime;
	private String pcoffice;
	private String pcstate;

	public ProfessCertificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProfessCertificate(long sno, String pctype, String pctime, String pcoffice, String pcstate) {
		super();
		this.sno = sno;
		this.pctype = pctype;
		this.pctime = pctime;
		this.pcoffice = pcoffice;
		this.pcstate = pcstate;
	}

	public long getSno() {
		return sno;
	}

	public void setSno(long sno) {
		this.sno = sno;
	}

	public String getPctype() {
		return pctype;
	}

	public void setPctype(String pctype) {
		this.pctype = pctype;
	}

	public String getPctime() {
		return pctime;
	}

	public void setPctime(String pctime) {
		this.pctime = pctime;
	}

	public String getPcoffice() {
		return pcoffice;
	}

	public void setPcoffice(String pcoffice) {
		this.pcoffice = pcoffice;
	}

	public String getPcstate() {
		return pcstate;
	}

	public void setPcstate(String pcstate) {
		this.pcstate = pcstate;
	}

	@Override
	public String toString() {
		return "ProfessCertificate [sno=" + sno + ", pctype=" + pctype + ", pctime=" + pctime + ", pcoffice=" + pcoffice
				+ ", pcstate=" + pcstate + "]";
	}

}
