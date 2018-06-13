package com.java.lang;

public class ObjectExamples {
	int count;
	String dec;
	public ObjectExamples() {
		
	}
	@Override
	public String toString() {
		return "ObjectExamples [count=" + count + ", dec=" + dec + "]";
	}
	public ObjectExamples(int count,String dec) {
		this.count=count;
		this.dec=dec;
	}
	@Override
	public boolean equals(Object obj) {
	if(obj!=null) {
		if(obj instanceof ObjectExamples) {
			ObjectExamples oe=(ObjectExamples)obj;
			if(count==oe.count && dec.equals(oe.dec)) {
				return true;
			}
		}
	}
	return false;
	}@Override
	public int hashCode() {
		return count +dec.length();
	}
public static void main(String[]arg)
{
	ObjectExamples oe=new ObjectExamples(1000,"ezhil");
	System.out.println(oe);
	System.out.println(oe.hashCode());
	ObjectExamples oeone=new ObjectExamples(1000,"ezhil");
	System.out.println(oe.equals(oeone));
	System.out.println(oe.hashCode()+"=="+oeone.hashCode());

}
}
