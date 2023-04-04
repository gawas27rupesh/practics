package com.gawas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long eid;
	private String ename;
	private Float esal;
	private int eage;
	private String ecity;
	
	public Employee(long eid, String ename, Float esal, int eage, String ecity) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.eage = eage;
		this.ecity = ecity;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getEid() {
		return eid;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Float getEsal() {
		return esal;
	}
	public void setEsal(Float esal) {
		this.esal = esal;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
	
}
