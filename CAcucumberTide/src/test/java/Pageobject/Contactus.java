package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactus {
public WebDriver ldriver;
	
	public Contactus(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	
	
	 @FindBy(linkText="Contact Us")
	WebElement contact;
	 
	 public void Contact()
	 {
		 contact.click();
	 }

}
