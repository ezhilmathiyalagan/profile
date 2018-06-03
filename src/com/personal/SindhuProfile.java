package com.personal;

public class SindhuProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstant.FIRST_NAME+"sindhu");
		System.out.println(ProfileConstant.LAST_NAME+"mathi");
		System.out.println("Age:26");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void myHobbies() {
		System.out.println("Watching Tv");
		// TODO Auto-generated method stub
		
	}

}
