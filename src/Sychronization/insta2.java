package Sychronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class insta2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		 WebElement usernametb = driver.findElement(By.name("username"));
		wait.until(ExpectedConditions.visibilityOf(usernametb)).sendKeys("d_gavade97");;
		
		
	    WebElement button = driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[4]"));
	    wait.until(ExpectedConditions.elementToBeClickable(button)).click();
	    
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



