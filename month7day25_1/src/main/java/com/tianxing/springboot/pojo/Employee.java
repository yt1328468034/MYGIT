package com.tianxing.springboot.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Employee {
	private String eId;
	private String eName;
	private Float wages;
	private Float bonus;
	private String pName;
	@JSONField(format="yyyy-MM-dd")
	private Date joinTime;
	private Department department;
	public String geteId() {
		return eId;
	}
	public void seteId(String eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public Float getWages() {
		return wages;
	}
	public void setWages(Float wages) {
		this.wages = wages;
	}
	public Float getBonus() {
		return bonus;
	}
	public void setBonus(Float bonus) {
		this.bonus = bonus;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Date getJoinTime() {
		return joinTime;
	}
	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Employee(String eId, String eName, Float wages, Float bonus, String pName, Date joinTime,
			Department department) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.wages = wages;
		this.bonus = bonus;
		this.pName = pName;
		this.joinTime = joinTime;
		this.department = department;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", wages=" + wages + ", bonus=" + bonus + ", pName="
				+ pName + ", joinTime=" + joinTime + ", department=" + department + "]";
	}
	

}
