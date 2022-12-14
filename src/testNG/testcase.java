package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testcase {

	public WebDriver driver;
	@BeforeMethod
	public void tc() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	}
	
	@Test
	public void tc1()
{
	driver.findElement(By.name("email")).sendKeys("admin");
	driver.findElement(By.name("pass")).sendKeys("manager");
	driver.findElement(By.name("login")).click();
	String title = driver.getTitle();
	
	
    SoftAssert a =new SoftAssert();
    a.assertEquals(title, "facbook");
    
    Reporter.log(title,true);
   
    String url = driver.getCurrentUrl();
     Reporter.log(url,true);
     a.assertAll();
}
	@AfterMethod
	public void closeapp() {
		
		driver.close();
	}
}

