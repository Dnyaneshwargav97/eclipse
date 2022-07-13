package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebook {
	@FindBy(id="email")
	private WebElement usernametb;
	
	@FindBy(name="pass")
	private WebElement passwordtb;
	
	@FindBy (name="login")
	private WebElement loginbtn;
	
	public facebook(WebDriver driver)  {
		PageFactory.initElements(driver,this);
	}
		public void usertextbox(String user)
		{
			usernametb.sendKeys(user);
		}
		public void passwordtextbox(String pass) {
			passwordtb.sendKeys(pass);
			
		}
		public void loginbutton() {
			loginbtn.click();

		}}


