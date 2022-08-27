package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PGbrands {
public WebDriver ldriver;
	
	public PGbrands(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	
	
	 @FindBy(xpath="//*[@id=\"site-footer\"]/div[2]/div/div[3]/div/div[1]/a")
	WebElement PG;
	 
	 public void pg()
	 {
		 PG.click();
		 
	 }

}
