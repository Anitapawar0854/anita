package test1;

import org.testng.annotations.Test;

public class dependsOnDemo {
	

	 
	 @Test(dependsOnMethods="method2")
	 public void method1() {
	  System.out.println("method1");
	 }
	 
	 @Test
	 public void method2() {
	  System.out.println("method2");

	 }
	}
	
	
	
	
	
	
	
	

