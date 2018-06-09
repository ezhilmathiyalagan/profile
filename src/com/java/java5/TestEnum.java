package com.java.java5;

public class TestEnum {
public static void main(String[]arg) {
	Level level=Level.LOW;
	System.out.println(level.getClass().getName());
	System.out.println(level.name());
	System.out.println(level.ordinal());
	System.out.println(level.levelcode);
	Level levelone[]=Level.values();
	for(int i=0;i<levelone.length;i++) {
		System.out.println(levelone);
	}
	//System.out.println(level.getClass().getName());
}
}
