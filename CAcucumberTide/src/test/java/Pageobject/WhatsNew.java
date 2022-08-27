package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhatsNew {
public WebDriver ldriver;
	
	public WhatsNew(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	
	
	 @FindBy(linkText="What’s New")
	WebElement what;
	 
	 public void New()
	 {
		 what.click();
	 }


}
