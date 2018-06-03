package com.personal;

public class EzhilProfile implements IProfile {

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstant.FIRST_NAME+"ezhil");
		System.out.println(ProfileConstant.LAST_NAME+"mathi");
		System.out.println("Age:20");
	}

	@Override
	public void myHobbies() {
		System.out.println("My Hobbies Are Playing Game");
	}

}
