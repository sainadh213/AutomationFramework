package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApolloHomePage {
	WebDriver driver;
	public ApolloHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//i[@class='icon-cog']")private WebElement mastersbtn;
	@FindBy(xpath = "//span[text()='Location']")private WebElement locationbtn;
	@FindBy(xpath = "//span[text()='Cluster']")private WebElement clusterbtn;
	
	public WebElement getLocationbtn() {
		return locationbtn;
	}
	
	public WebElement getMastersbtn() {
		return mastersbtn;
	}

	public WebElement getClusterbtn() {
		return clusterbtn;
	}
	
	

}
