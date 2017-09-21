package com.sergio.springdemo.serviceimpl;

import java.util.Random;

import com.sergio.springdemo.service.RecruitmentService;

public class RefferalRecruitmentServiceImpl implements RecruitmentService {
	

	public String recruitEmployees(String companyName, String department, int numberOfRecruitments) {
		Random random = new Random();
		
		String hiringFacts = "\n " + companyName + " 's " + department + " hired " + 
		random.nextInt(numberOfRecruitments) + " employees " +
				" which were reffered to the company by employees. ";
		
		return hiringFacts;
	}

}
