package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("9960055013");
		driver.findElement(By.xpath("//input[@type='passward']")).sendKeys("97969796");
		((WebElement) driver.findElements(By.xpath("(//button[@type='submit'][2]"))).click();


	}

}
