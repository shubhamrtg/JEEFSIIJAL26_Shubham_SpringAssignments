package com.cg.lab2;

public class SBU {

	private int sbuId;
	private String sbuName;
	private String sbuHead;
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int subId) {
		this.sbuId = subId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String subName) {
		this.sbuName = subName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String subHead) {
		this.sbuHead = subHead;
	}
	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	
}
