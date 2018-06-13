package com.java.java5;

public class Demo {
	final int MAX_VALUE;
	 
	 public Demo(){
		 MAX_VALUE=100;
	 }
	     
	   
	   void myMethod(){  
	      System.out.println(MAX_VALUE);
	   }  
	   public static void main(String args[]){  
	      Demo obj=new  Demo();  
	      obj.myMethod();  
	   }  
}
