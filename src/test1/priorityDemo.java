package test1;

import org.testng.annotations.Test;

public class  priorityDemo {

	
	 
	 
	    @Test(priority=-1)
	 public void method1() {
	  
	  System.out.println("method1");
	 }

	    
	    @Test
	    public void method2() {
	     
	     System.out.println("method2");
	    }

	    
	    @Test(priority=2)
	    public void method3() {
	     
	     System.out.println("method3");
	    }

	    
	    @Test
	    public void amethod4() {
	     
	     System.out.println("method4");
	    }

	
}	