package test1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterization {

	 @Test
	 @Parameters({"username","password"})
	 public void method1(String A1, String A2) {
	  System.out.println(A1+" "+A2);
	 }
	
	
	
	
}
