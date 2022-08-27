package Pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
public WebDriver ldriver;
	
	public Search(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	
	
	 @FindBy(xpath="//*[@id=\"site-header\"]/div[2]/div/div/div/form/div/input")
	WebElement search;
	 
	 public void Search(String Data)
	 {
		 search.click();
		 search.sendKeys(Data+Keys.ENTER);
		 
	 }

}
