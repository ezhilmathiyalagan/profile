package com.java.lang;

public class StringExamples {

	 public StringExamples() {
	}
	 public static void main(String[] args) {
		String one="Ezhil";
		String oneobj=new String("Ezhil");
		String two="Ezhil";
		System.out.println(one == two);
		System.out.println(one.equals(two));
		System.out.println(one.equals(oneobj));
		System.out.println(one.hashCode());
		one=one+"mathi";
		System.out.println(one);
		System.out.println(one.hashCode());
		String s="ezhil,mathi,BE,ECE";
		String ss[]=s.split(",");
		for(int i=0;i < ss.length;i++) {
			System.out.println(ss[i]);
		}
	 String a="ezhil";
	 char b=a.charAt(3);
	 System.out.println(b);

} 
}
