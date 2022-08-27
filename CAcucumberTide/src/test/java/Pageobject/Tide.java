package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tide {
public WebDriver ldriver;
	
	public Tide(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	
	
	 @FindBy(xpath="//*[@id=\"site-footer\"]/div[2]/div/div[4]/div[1]/a[4]/picture/img")
	WebElement tide;
	 
	 public void Tidee()
	 {
		 tide.click();
	 }

}
