package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibrary.Constants;
import GenericLibrary.FileUtil;
import GenericLibrary.WebDriverUtil;

public class OurfoodLoginPage {
	WebDriver driver;
	public OurfoodLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	@FindBy(id="appUserName")private WebElement untb;
	@FindBy(id="appPassword")private WebElement pwtb;
	@FindBy(id="loginBtn")private WebElement signinbtn;
	
	public WebElement getUntb() {
		return untb;
	}
	public WebElement getPwtb() {
		return pwtb;
	}
	public WebElement getsigninbtn() {
		return signinbtn;
	}
	/*//public void loginToOurfood() throws Throwable {
		
		FileUtil fu=new FileUtil();
		WebDriverUtil wdu=new WebDriverUtil();
		
		String username = fu.readDataFromPropertyFile(Constants.properties_path, "username");
		String password = fu.readDataFromPropertyFile(Constants.properties_path, "password");
		wdu.waitForElement(20);
		
		getUntb().sendKeys(username);
		getPwtb().sendKeys(password);
		getsigninbtn().click();
		
	}*/
public void loginToOurfood(String unkey,String pwdkey) throws Throwable
{
FileUtil fu=new FileUtil();
WebDriverUtil wdu=new WebDriverUtil();

String username = fu.readDataFromPropertyFile(Constants.properties_path, unkey);
String password = fu.readDataFromPropertyFile(Constants.properties_path, pwdkey);
wdu.waitForElement(20);

getUntb().sendKeys(username);
getPwtb().sendKeys(password);
getsigninbtn().click();

}
	}


