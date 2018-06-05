package com.personal;

public  abstract class Test implements Travel {
public static void main(String[]ags) {
	Travel travelone=new Bus();
	Travel traveltwo=new Cats();
	System.out.println(travelone instanceof Bus);
	System.out.println(traveltwo instanceof Cats);
	
}
}
