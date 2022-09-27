package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurfoodDDPage {
	WebDriver driver;
	public OurfoodDDPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath ="//label[@class='ng-tns-c27-2 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']")private WebElement reqdd;
	public WebElement getReqdd() {
		return reqdd;
	}

}
