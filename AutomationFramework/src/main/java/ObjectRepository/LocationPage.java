package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GenericLibrary.Constants;
import GenericLibrary.FileUtil;
import GenericLibrary.WebDriverUtil;


public class LocationPage {
  WebDriver driver;
 
  public LocationPage(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
  @FindBy(xpath ="//button[@title='Add']")private WebElement addbtn;
  @FindBy(xpath ="//i[@title='Edit']")private WebElement editbtn;
  @FindBy(xpath ="//i[@title='Delete']")private WebElement deletebtn;
  @FindBy(xpath ="//span[text()=' Search']")private WebElement searchbtn;
  @FindBy(xpath = "//label[text()='Select region']")private WebElement regiondd;
  @FindBy(id="name")private WebElement nametb;
  @FindBy(xpath = "//div[@class='radio ng-star-inserted']")private WebElement inactiverb;
  @FindBy(xpath = "//span[text()='Save']")private WebElement savebtn;
  @FindBy(xpath = "//span[text()='Reset']")private WebElement resetbtn;
  @FindBy(xpath ="//li[@aria-label='Hyderabad']")private WebElement hydopt;
  //@FindBy(xpath = "(//span[@title])[2]")private WebElement text;
  @FindBy(xpath ="//input[@placeholder='Search Region/Name/Code/Status']")private WebElement searchtb;

 // @FindBy(xpath = "//span[@title='"+value+"']")private WebElement searchtext;
  @FindBy(xpath = "(//span[@class='ng-star-inserted'])[3]")private WebElement searchtext;

public WebElement getSearchtext() {
	return searchtext;
}
public WebElement getSearchtb() {
	return searchtb;
}
/*public WebElement getText() {
	return text;
}*/
public WebElement getHydopt() {
	return hydopt;
}
public WebElement getAddbtn() {
	return addbtn;
}
public WebElement getEditbtn() {
	return editbtn;
}

public WebElement getDeletebtn() {
	return deletebtn;
}

public WebElement getSearchbtn() {
	return searchbtn;
}

public WebElement getRegiondd() {
	return regiondd;
}

public WebElement getNametb() {
	return nametb;
}

public WebElement getInactiverb() {
	return inactiverb;
}

public WebElement getSavebtn() {
	return savebtn;
}

public WebElement getResetbtn() {
	return resetbtn;
}


  public void createLocation(int row) throws Throwable, Throwable
  {
	  FileUtil fl=new FileUtil();
	  WebDriverUtil wdl=new WebDriverUtil();
	 int number = wdl.randomNumber();
	 // String name = fl.readDataFromExcel(Constants.excel_path,"Location", 1, 0);
	String name = fl.readDataFromExcel(Constants.excel_path, "Location", row, 0);
	wdl.waitForElement(20);
	  addbtn.click();
	  regiondd.click();
	  hydopt.click();
	  String value = name+number;
	   nametb.sendKeys(value);
	  Thread.sleep(2000);
	  savebtn.click();
	  getSearchtb().sendKeys(value);
	  getSearchbtn().click();
	
	  Thread.sleep(5000);
	 String title = getSearchtext().getText();
	  System.out.println(value+"\n"+title);
	   Assert.assertEquals(value, title);
	   System.out.println(value+" location is created");
  }
}
