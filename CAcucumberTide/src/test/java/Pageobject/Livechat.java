package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Livechat {
public WebDriver ldriver;
	
	public Livechat(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	
	
	 @FindBy(linkText="Live Chat")
	WebElement Reward;
	 
	 public void Reward1()
	 {
		 Reward.click();
	 }

}
