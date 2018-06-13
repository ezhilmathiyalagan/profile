package com.personal;


public class Encoding {
public static void main(String[] input1) {
		String str=new String("john");
	System.out.println(str.length());
	str.substring(0,1);
	str.substring(1,3);
	str.substring(3,4);
	System.out.println(str.substring(0,1)+" "+str.substring(1,3)+" "+str.substring(3,4));

String str1=new String("Johny");
System.out.println(str1.length());
  str1.substring(0,2);
  str1.substring(2,3);
  str1.substring(3,5);
 System.out.println(str1.substring(0,2)+" "+str1.substring(2,3)+" "+str1.substring(3,5));

String str3=new String("janardhan");
System.out.println(str.length());
  str3.substring(0,3);
  str3.substring(3,6);
  str3.substring(6,9);
System.out.println(str3.substring(0,3)+" "+str3.substring(3,6)+" "+str3.substring(6,9));

System.out.println(str.substring(0,1)+str1.substring(2,3)+str3.substring(6,9));
System.out.println(str.substring(1,3)+str1.substring(3,5)+str3.substring(0,3));
System.out.println(str.substring(3,4)+str1.substring(0,2)+str3.substring(3,6));
String s1=str.substring(3,4)+str1.substring(0,2)+str3.substring(3,6);
char[] charArray = s1.toCharArray();
for(int i=0; i < charArray.length; i++) {
	if( Character.isUpperCase(charArray[i]) ){
        
        charArray[i] = Character.toLowerCase( charArray[i] );
        
    }else if(Character.isLowerCase(charArray[i]) ){
        
        charArray[i] = Character.toUpperCase( charArray[i] );
    }    
    
}


s1= new String(charArray);

System.out.println(s1);
}
}