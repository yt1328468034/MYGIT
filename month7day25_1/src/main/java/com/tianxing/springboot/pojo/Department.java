package com.tianxing.springboot.pojo;

public class Department {
	private String dId;//部门编号
	private String dName;//部门名称
	private String dAddress;//部门地址
	
	public String getdId() {
		return dId;
	}

	public void setdId(String dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdAddress() {
		return dAddress;
	}

	public void setdAddress(String dAddress) {
		this.dAddress = dAddress;
	}

	public Department(String dId, String dName, String dAddress) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.dAddress = dAddress;
	}

	public Department() {
		super();
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + ", dAddress=" + dAddress + "]";
	}
	

}
