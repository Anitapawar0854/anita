package test1;

import org.junit.AfterClass;
import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


			public class demo1 {
			 
			  
			 @Test
			 public void test1method1() {
			  
			  System.out.println("test1method1");
			 }
			 
			 @BeforeSuite
			 public void test1method2() {

			  System.out.println("test1method2BeforeSuite");
			 }
			 
			 @AfterSuite
			 public void test1method3() {

			  System.out.println("test1method3AfterSuite");
			 }
			 
			 
			 @BeforeTest
			 public void test1method4() {

			  System.out.println("test1method4BeforeTest");
			 }
			 
			 @AfterTest
			 public void test1method5() {

			  System.out.println("test1method5AfterTest");
			 }

			 
			 @AfterClass
			 public void test1method6() {

			  System.out.println("test1method6AfterClass");
			 }

			 
			 @BeforeClass
			 public void test1method7() {

			  System.out.println("test1method7BeforeClass");
			 }
			 
			 

			 @BeforeMethod
			 public void test1method8() {

			  System.out.println("test1method8BeforeMethod");
			 }

			 
			 @AfterMethod
			 public void test1method9() {

			  System.out.println("test1method9AfterMethod");
			 }@Test
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
			 
			 
			 
			 
			 
			}
	
	
	
	
	
	
	
	
	

