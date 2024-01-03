package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public String generateEmailID(String firstName, String lastName, String deptName) {
		// TODO Auto-generated method stub
		return firstName+lastName+"."+deptName+"@greatlearning.com";
	}

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";//26
		String lower="abcdefghijklmnopqrstuvwxyz";//26
		String nums="0123456789";//10
		String splchars="!@#$%^&*()";//10
		
		String combined=caps+lower+nums+splchars;//72
		String myPass="";
		Random random=new Random();
		for(int i=1;i<=8;i++)
		{
			myPass=myPass + String.valueOf(combined.charAt(random.nextInt(combined.length())));
			
		}
		return myPass;
	}

	@Override
	public void showEmployeeDetails(Employee e) {
		// TODO Auto-generated method stub
		System.out.println("Employee first Name:" +e.getFirstName());
		System.out.println("Employee last Name:" +e.getLastName());
		System.out.println("Employee email is :" +e.getEmail());
		System.out.println("Employee Password is:" +e.getPassword());
		
	}


}
