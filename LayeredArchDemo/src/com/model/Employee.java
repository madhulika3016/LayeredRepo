package com.model;

public class Employee {
	private int eid;
	private String ename;
	private String tech;
	public Employee(int eid, String ename, String tech) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.tech = tech;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", tech=" + tech + "]";
	}

}
