package com.sergio.springdamo.domain;

import com.sergio.springdemo.service.BusinessService;

public class Organization {
	
	private String company;
	private int yearOfIncorporation;
	private String postalCode;
	private int employeeCount;
	private String slogan;
	private BusinessService businessService;
	


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


	public String corporateSlogan() {
		return slogan;
	
	}
	
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}

	public String corporateService() {
		
		return businessService.offerService(company);
		
	}

	public String getCompany() {
		return company;
	}

	@Override
	public String toString() {
		return "Organization [company=" + company + ", yearOfIncorporation=" + yearOfIncorporation + ", postalCode="
				+ postalCode + ", employeeCount=" + employeeCount + "]";
	}
}
