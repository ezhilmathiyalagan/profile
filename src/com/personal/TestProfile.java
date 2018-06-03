package com.personal;

public class TestProfile {
		public static void printprofile(IProfile profile) {
			profile.myBasicInfo();
			profile.myHobbies();
	}
public static void main(String[]arg) {
	IProfile myprofile=new SindhuProfile();
	printprofile(myprofile);

}
}
