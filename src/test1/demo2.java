package test1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo2 {

	public void test2method1() {
		  
		  System.out.println("test2method1");
		 }
		 
		 @Test
		 public void test2method2() {

		  System.out.println("test2method2");
		 }
		 
		 
		 @BeforeClass
		 public void test2method3() {

		  System.out.println("test2method3beforeclass");
		 }
		 
		 @AfterClass
		 public void test2method4() {

		  System.out.println("test2method4Afterclass");
		 }
		 
		 
		 
		 @BeforeMethod
		 public void test2method5() {

		  System.out.println("test2method5BeforeMethod");
		 }

		 
		 @AfterMethod
		 public void test2method6() {

		  System.out.println("test2method6AfterMethod");
		 }
		}
	
	
	

