package com.fita.SpringDemoOne;

public class BasketBall implements Sports{

	MedicalService medicalService;
	
	public void setMedicalService(MedicalService medicalService) {
		this.medicalService = medicalService;
	}

	@Override
	public String provideInfo() {
		return "Played between two teams of 5 Players";
	}

	@Override
	public String getFirstAidInfo() {
		return medicalService.assist();
	}

}
