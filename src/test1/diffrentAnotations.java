package test1;

import org.testng.annotations.Test;

public class diffrentAnotations {

	 {

		 

		 //Set timeout in testing
		 
		// @Test(timeOut=500)
		// public void test() {
		  
		  
		 }
		 
		 //Invocation count--
		 //If we want to run same test multiple times with same data
		 
		 @Test(invocationCount = 10)
		 public void test2() {
		  
		  System.out.println("hello");
		 }
		 
		 
		}
	
	
	
	
	
	

