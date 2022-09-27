package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApolloLogoutPage {
	WebDriver driver;
	public ApolloLogoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	//@FindBy(xpath ="//span[text()='×']")private WebElement crossbtn;
	//@FindBy(xpath ="//div[@class='toast-message ng-star-inserted']")private WebElement crossbtn;
	@FindBy(xpath="//label[text()='Administrator']")private WebElement adminbtn;
	@FindBy(id="logout")private WebElement logoutbtn;
	
	/*public WebElement getCrossbtn() {
		return crossbtn;
	}*/
		public WebElement getAdminbtn() {
		return adminbtn;
	}
	public WebElement getLogoutbtn() {
		return logoutbtn;
	}
	public void logotApollo() throws InterruptedException
	{   Thread.sleep(10000);
		getAdminbtn().click();
		getLogoutbtn().click();
	}

}
