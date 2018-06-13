package com.java.lang;
//import java.io.IOException;
public class RunTime {
public static  void main(String[] args) {
	long start=System.currentTimeMillis();
	long startNano=System.nanoTime();
	Runtime runtime=Runtime.getRuntime();
	runtime.addShutdownHook(new Thread() {
		public void run() {
			System.out.println("JVM is shutting down");
		}
	});
	
int cores = Runtime.getRuntime().availableProcessors();
System.out.println(cores);
long end=System.currentTimeMillis();
long endNano=System.nanoTime();
System.out.println(end-start);
System.out.println(endNano-startNano);
System.out.println(System.getenv());
int one[]={18,62,67,26,9};
int two[]=new int[one.length];
for(int i=0;i<one.length-2;i++) {
two[i]=one[i];
System.arraycopy(one, 0, two, 0, one.length);
System.out.println(one[i]+"");
}
/*tr

Process process=runtime.exec("notepad");
process.waitFor();
 } catch (Exception e) {
	e.printStackTrace();
}*/

}



}
                                           