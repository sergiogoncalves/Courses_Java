package com.sergio.spring_ioc_demo01;

public class Organization {
	
	private String company;
	private int yearOfIncorporation;
	
	public Organization() {
		
	}
	
	
	public Organization(String company, int yearOfIncorporation) {
		this.company = company;
		this.yearOfIncorporation = yearOfIncorporation;
	}
	


	public void corporateSlogan() {
		String slogan = "We build the ultimate driving machines!";
		System.out.println(slogan);
	
	}



	@Override
	public String toString() {
		return "Organization [company=" + company + ", yearOfIncorporation=" + yearOfIncorporation + "]";
	}

}
