package com.tka.eci.entity;

public class ECICandidate {
    private int cid;
	private String name;
	private String assembly;
	private String partyname;
	private String statename;
	private int age;
	private String gender;
	
	public ECICandidate() {
		super();
	}
	public ECICandidate(int cid,String name, String assembly, String partyname, String statename, int age, String gender) {
		super();
		this.cid=cid;
		this.name = name;
		this.assembly = assembly;
		this.partyname = partyname;
		this.statename = statename;
		this.age = age;
		this.gender = gender;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAssembly() {
		return assembly;
	}
	public void setAssembly(String assembly) {
		this.assembly = assembly;
	}
	public String getPartyname() {
		return partyname;
	}
	public void setPartyname(String partyname) {
		this.partyname = partyname;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "ECICandidate [cid=" + cid + ", name=" + name + ", assembly=" + assembly + ", partyname=" + partyname
				+ ", statename=" + statename + ", age=" + age + ", gender=" + gender + "]";
	}
	
	




}

