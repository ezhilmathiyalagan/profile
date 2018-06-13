package com.java.lang;
import com.personal.Dog;
import com.personal.Cat;
public class CloneExamples implements Cloneable {
	Dog dog;
	Cat cat;
	public CloneExamples() {
		cat=new Cat();
		dog=new Dog();
}
public static void main(String[] args) {
	try {
		CloneExamples ceone=new CloneExamples();
		CloneExamples cetwo=(CloneExamples)ceone.clone();
		System.out.println(ceone.hashCode()+"=="+cetwo.hashCode());
		System.out.println(ceone.cat.hashCode()+" cat hascode "+cetwo.cat.hashCode());
		System.out.println(ceone.dog.hashCode()+" dog hascode "+cetwo.dog.hashCode());

	} catch (Exception e) {
		e.printStackTrace();
	}
	
		
	
	
}
}
