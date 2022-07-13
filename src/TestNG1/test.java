package TestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test {
	
	@Test(priority=2,invocationCount=5)
	public void demo() {
		
		Reporter.log("hello java",true);
		
	}
	@Test(priority =-2,invocationCount=4)
	public void chat() {
		Reporter.log("chat",true);
	}

}
