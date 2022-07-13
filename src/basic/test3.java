package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
//minimize
driver.manage().window().minimize();
driver.get("https://www.facebook.com/");
driver.navigate().to("https://www.naukri.com/mnjuser/profile?id=&altresid");

//fullscreeen
Thread.sleep(300);
driver.manage().window().fullscreen();
//maximize
driver.manage().window().maximize();
driver.navigate().to("https://www.facebook.com/");
	}

}
