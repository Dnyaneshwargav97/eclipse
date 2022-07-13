package Sychronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys("d_gavade97");
		driver.findElement(By.name("password")).sendKeys("D1577518");
	    driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[4]")).click();
	    
	    String acttitle = driver.getTitle();
	    if(acttitle.equals("Instagram")){
	    	System.out.println("pass: home page displayed");
	    
	    }
	    else 
	    {
	    	System.out.println("fail:home page will not displyed");
	    }
	    System.out.println(driver.getCurrentUrl());

	}

}
