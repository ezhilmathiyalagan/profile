package com.java.java5;

public class XYZ {
	final void demo(){
	      System.out.println("XYZ Class Method");
	   }  
	}  
		     
	class ABC extends XYZ{  
	   void demo(){
	      System.out.println("ABC Class Method");
	   }  
		     
	   public static void main(String args[]){  
	      ABC obj= new ABC();  
	      obj.demo();  
	   }  
}
