package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ebay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement dropDown = driver.findElement(By.id("gh-cat"));
		
		 Select s = new Select(dropDown);
		 
		 s.selectByIndex(4);
		 //s.selectByValue("625");
		 //s.deselectByVisibleText("Baby");
		 
		// Thread.sleep(300);
		 s.deselectAll();
		 List<WebElement> Alloptions = s.getOptions();
		 System.out.println(Alloptions.size());
		 driver.close();
		
	}

}
