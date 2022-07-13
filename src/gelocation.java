import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gelocation {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement loc = driver.findElement(By.name("q"));
		Point loca =loc.getLocation();
		int x = loca.getX();
		System.out.println(x+"x coordinates");
	
	int y = loca.getY();
	System.out.println(y+"y coordinates");
	
	driver.close();
	

	}

}
