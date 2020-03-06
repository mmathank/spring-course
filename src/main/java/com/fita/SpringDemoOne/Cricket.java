package com.fita.SpringDemoOne;

public class Cricket implements Sports{

	String teamName;
	MedicalService medicalService;
	
	public Cricket() {
		
	}
	
	public Cricket(MedicalService medicalService, String teamName){
		this.medicalService = medicalService;
		this.teamName = teamName;
	}
	
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
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
