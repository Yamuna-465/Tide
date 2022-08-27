package stepdefinitions;


import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobject.Contactus;
import Pageobject.Livechat;
import Pageobject.PGbrands;
import Pageobject.Pacs;
import Pageobject.Search;
import Pageobject.TandC;
import Pageobject.Tide;
import Pageobject.WhatsNew;
import Pageobject.language;
import Pageobject.learn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import utilities.HelperClass;
import utilities.Configure;
import utilities.Excel;


public class steps {

	public WebDriver driver;
	public static Logger logger;
	public Excel excel;
	
	
    public Livechat lv;
    public Contactus cu;
    public language lg;
    public Search se;
    public WhatsNew ws;
    public Pacs pc;
    public Tide te;
    public learn ln;
    public PGbrands pg;
    public TandC tm;
  
    
    
    
    Configure configure = new Configure(); 
	public String baseURL= configure.getURL();
	public  String chrome=configure.getbrowser();
   
    @Given("User Launch Chrome browser")
    public void user_launch_chrome_browser() {
    	
    	 WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    logger=Logger.getLogger("Tide");
		    PropertyConfigurator.configure("Log4j.properties");
		   
		    
		 excel = new Excel();
	     lv= new Livechat(driver);
	     cu= new Contactus(driver);
	     lg= new language(driver);
	     se = new Search(driver);
	     ws =new WhatsNew(driver);
	     pc = new Pacs(driver);
	     te = new Tide(driver);
	     ln = new learn(driver);
	     pg = new PGbrands(driver);
	     tm = new TandC(driver);
	   
	     
       
    }

    @When("User opens URL")
    public void user_opens_url() {
   driver.get(baseURL);
   driver.manage().window().maximize();
   logger.info("Url is open");
       
    }
//livechat
    @And("Click on Livechat")
    public void click_on_livechat() throws Exception {
    	lv.Reward1();
    	logger.info("click on livechat");
    
    	HelperClass.captureScreenshots(driver);
    	Thread.sleep(2000);
   	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
    }
    //contact
    @When("Click on Contact")
    public void click_on_contact() throws Exception {
    	cu.Contact();
    	HelperClass.captureScreenshots(driver);
    	logger.info("click on contact");
    	Thread.sleep(2000);
   	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    //location
    @When("Click on Select location")
    public void click_on_select_location() throws Exception {
    	lg.Location();
    	logger.info("click on location");
    
    	
    	
        
    }
    
    @When("Click on US Spanish")
    public void click_on_us_spanish() throws Exception {
    	lg.US();
    	logger.info("language changed");
    	HelperClass.captureScreenshots(driver);
    	Thread.sleep(2000);
   	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
            }
    //search
    @When("Click on Search")
    public void click_on_search() throws Exception { 
    	se.Search(excel.getStringData(0, 0, 0));
    	logger.info("click on search");
    	HelperClass.captureScreenshots(driver);
    	logger.info("captured");
    	Thread.sleep(2000);
   	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
    }
    
    //WhatsNew
    @When("Click on WhatsNew")
    public void click_on_whats_new() throws Exception {
    	ws.New();
    	logger.info("click on whatsnew");
    	HelperClass.captureScreenshots(driver);
    	Thread.sleep(2000);
   	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
    }
    //pac
    @When("Click on Pacs")
    public void click_on_pacs() throws Exception {
    	pc.pac();
    	logger.info("click on pac");
    	HelperClass.captureScreenshots(driver);
    	Thread.sleep(2000);
   	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
    }
    
    //tide
    @When("Click on Tideimage")
    public void click_on_tideimage() throws Exception {
    	te.Tidee();
    	logger.info("click on image");
    	HelperClass.captureScreenshots(driver);
    	logger.info("Test case passed successfully");
    	Thread.sleep(2000);
   	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
    }
    //learn
    @When("Click on learn")
    public void click_on_learn() throws Exception {
    ln.lean();
    logger.info("click on learn");
    HelperClass.captureScreenshots(driver);
    Thread.sleep(2000);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
    }
     
    //P&G
    @When("Click on PGbrands")
    public void click_on_p_gbrands() throws Exception {
    	pg.pg();
    	 HelperClass.captureScreenshots(driver);
    	 Thread.sleep(2000);
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 logger.info("open p&g branda");
        
    }
    
    //T&C

@When("Click on Terms and condition")
public void click_on_terms_and_condition() throws Exception {
	tm.TC();
    HelperClass.captureScreenshots(driver);
    Thread.sleep(2000);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 logger.info("open terms and condition");
    
}



   





    @And("close browser")
    public void close_browser() {
    	driver.quit();
    	logger.info("close the driver");
    	
    }

}
