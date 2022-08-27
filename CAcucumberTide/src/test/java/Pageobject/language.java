package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class language {
public WebDriver ldriver;
	
	public language(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	
	
	 @FindBy(xpath="//*[@id=\"site-header\"]/div[1]/div/div/div/div[2]/button")
	WebElement loc;
	 @FindBy(xpath="/html/body/div[3]/div/div/div/a[2]")
		WebElement us;
	 
	 
	 public void Location()
	 {
		 loc.click();
	 }
	 
	 public void US()
	 {
		 us.click();
	 }

}
