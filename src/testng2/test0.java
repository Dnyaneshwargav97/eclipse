package testng2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test0 {

	@Test(priority=1,invocationCount=4)
	
	public void demo() {
		Reporter.log("demo",true);
		
	}
	@Test(priority=-1,enabled=false)
	public void demo1() {
		Reporter.log("demo2",true);
	}
}
