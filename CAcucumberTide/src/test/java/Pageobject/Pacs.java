package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pacs {
public WebDriver ldriver;
	
	public Pacs(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	
	
	 @FindBy(xpath="//*[@id=\"site-footer\"]/div[2]/div/div[1]/div/div[2]/div/div[2]/div[1]/a/span")
	WebElement Pac;
	 
	 public void pac()
	 {
		 Pac.click();
		 
	 }

}
