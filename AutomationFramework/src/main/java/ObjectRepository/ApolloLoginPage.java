package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibrary.Constants;
import GenericLibrary.FileUtil;
import GenericLibrary.WebDriverUtil;

public class ApolloLoginPage {
	WebDriver driver;
	public ApolloLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	@FindBy(id="appUserName")private WebElement untb;
	@FindBy(id="appPassword")private WebElement pwtb;
	@FindBy(id="loginBtn")private WebElement loginbtn;
	@FindBy(xpath ="//span[@class='icon-adn']")private WebElement cmsbtn;
	public WebElement getCmsbtn() {
		return cmsbtn;
	}
	public WebElement getUntb() {
		return untb;
	}
	public WebElement getPwtb() {
		return pwtb;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public void loginToApollo() throws Throwable 
	  {
		FileUtil fu=new FileUtil();
		WebDriverUtil wdu=new WebDriverUtil();
		String username = fu.readDataFromPropertyFile(Constants.properties_path, "username");
		String password = fu.readDataFromPropertyFile(Constants.properties_path, "password");
		
		wdu.waitForElement(20);
		
		getUntb().sendKeys(username);
		getPwtb().sendKeys(password);
		getLoginbtn().click();
	    getCmsbtn().click();
	  }

}
