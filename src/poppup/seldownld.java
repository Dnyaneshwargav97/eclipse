package poppup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seldownld {

	public static void main(String[] args) throws AWTException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
driver.findElement(By.xpath("//a[text()='4.3.0']")).click();


Robot r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_TAB);
r.keyPress(KeyEvent.VK_ENTER);

r.keyRelease(KeyEvent.VK_CONTROL);
r.keyRelease(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_ENTER);

//.keyRelease(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_CONTROL);
.keypress(KeyEvent.VK_TAB);
.keyPress(KeyEvent.VK_TAB);
r.keyPress






	}


	}


