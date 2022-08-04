package com.globallogic.classTraining;

public class Company {
	
	private String name,headQuarters,ceoName;
	private int noOfEmployees,noOfBranch;
	

	@Override
	public String toString() {
		return "Company [name=" + name + ", headQuarters=" + headQuarters + ", ceoName=" + ceoName + ", noOfEmployees="
				+ noOfEmployees + ", noOfBranch=" + noOfBranch + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHeadQuarters() {
		return headQuarters;
	}


	public void setHeadQuarters(String headQuarters) {
		this.headQuarters = headQuarters;
	}


	public String getCeoName() {
		return ceoName;
	}


	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}


	public int getNoOfEmployees() {
		return noOfEmployees;
	}


	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}


	public int getNoOfBranch() {
		return noOfBranch;
	}


	public void setNoOfBranch(int noOfBranch) {
		this.noOfBranch = noOfBranch;
	}


	public static void main(String[] args) {

		Company com = new Company();
		
		com.setName("Global Logic");
		com.setHeadQuarters("San Jose,California");
		com.setCeoName("Shashank Samant");
		com.setNoOfEmployees(25000);
		com.setNoOfBranch(34);
		
		System.out.println(com);
		System.out.println("Company name is "+com.getName());
		System.out.println("Headquarters is in "+com.getHeadQuarters());
		System.out.println("CEO is "+com.getCeoName());
		System.out.println("Number of employees is "+com.getNoOfEmployees());
		System.out.println("Number of Branch is "+com.getNoOfBranch());
		
	}

}
