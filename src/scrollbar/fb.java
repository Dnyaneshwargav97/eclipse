package scrollbar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {

	public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.amazon.in/");
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
 WebElement laptop = driver.findElement(By.xpath("//span[text()='Laptops']"));
 
 Point lap = laptop.getLocation();
int x=lap.getX();
int y=lap.getY();
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("Window.scrollBy("+x+","+y+")");
laptop.click();
 

	}

}
