package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("+919028199796");
		driver.findElement(By.id("pass")).sendKeys("d1312270224");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		

	}

}
