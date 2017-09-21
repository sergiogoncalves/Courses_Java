package com.sergio.springdemo.serviceimpl;

import java.util.Random;

import com.sergio.springdemo.service.RecruitmentService;

public class AgencyRecruitmentServiceImpl implements RecruitmentService {

	public String recruitEmployees(String companyName, String department, int numberOfRecruitments) {
		Random random = new Random();
		
		String hiringFacts = "\n " + companyName + " 's " + department + " hired " + 
		random.nextInt(numberOfRecruitments) + " employees " +
				" using various hiring agencies ";
		
		return hiringFacts;
	}

}
