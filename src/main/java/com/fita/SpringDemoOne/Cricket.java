package com.fita.SpringDemoOne;

public class Cricket implements Sports{

	MedicalService medicalService;
	
	public Cricket() {
		
	}
	
	public Cricket(MedicalService medicalService){
		this.medicalService = medicalService;
	}
	
	@Override
	public String provideInfo() {
		return "Played between two teams of 11 Players";
	}

	@Override
	public String getFirstAidInfo() {
		return medicalService.assist();
	}

}
