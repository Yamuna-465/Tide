package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class learn {
public WebDriver ldriver;
	
	public learn(WebDriver rdriver) {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver,this);
	}
	
	
	 @FindBy(xpath="//*[@id=\"carousel__1hGWzfOCYOPdzihtXedEWa\"]/div[1]/div/ul[1]/li[3]/div/div[2]/div/div/div/div/div/a")
	WebElement Lern;
	 
	 public void lean()
	 {
		 Lern.click();
	 }

}
