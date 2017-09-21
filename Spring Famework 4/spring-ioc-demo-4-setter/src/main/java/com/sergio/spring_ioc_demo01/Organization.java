package com.sergio.spring_ioc_demo01;

public class Organization {
	
	private String company;
	private int yearOfIncorporation;
	private String postalCode;
	private int employeeCount;
	
	public Organization() {
		
	}
	
	
	public Organization(String company, int yearOfIncorporation) {
		this.company = company;
		this.yearOfIncorporation = yearOfIncorporation;
	}
	




	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public void corporateSlogan() {
		String slogan = "We build the ultimate driving machines!";
		System.out.println(slogan);
	
	}


	@Override
	public String toString() {
		return "Organization [company=" + company + ", yearOfIncorporation=" + yearOfIncorporation + ", postalCode="
				+ postalCode + ", employeeCount=" + employeeCount + "]";
	}



	

}
