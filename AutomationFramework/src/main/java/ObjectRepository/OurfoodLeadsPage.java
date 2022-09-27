package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibrary.Constants;
import GenericLibrary.FileUtil;

public class OurfoodLeadsPage {
	WebDriver driver;
	public OurfoodLeadsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath ="//label[text()='LEADS']")private WebElement leadsbtn;
	@FindBy(xpath ="//span[text()='Add']")private WebElement addbtn;
	@FindBy(id="name")private WebElement nametb;
	@FindBy(id="phone")private WebElement phonetb;
	@FindBy(xpath = "//label[text()='Select mandal']")private WebElement mandaldd;
	@FindBy(xpath = "//label[text()='Select village']")private WebElement villagedd;
	@FindBy(xpath = "//label[text()='Select crop category']")private WebElement cropcategorydd;
	@FindBy(xpath = "//label[text()='Select crop']")private WebElement cropydd;
	@FindBy(xpath = "//label[text()='Select lead source']")private WebElement leadSourcedd;
	@FindBy(xpath ="//span[text()='Save']")private WebElement savebtn;
	@FindBy(xpath ="//span[text()='Village']/ancestor::formly-field[@class='col-12 ng-star-inserted']/descendant::span[@class='ng-star-inserted']")private WebElement villageddopt;
	@FindBy(xpath = "//span[text()='Oilseeds']")private WebElement cropcatoilseeds;
	@FindBy(xpath = "//span[text()='Plantation Crops']")private WebElement cropcatPlantationCrops;
	@FindBy(xpath = "//span[text()='Pulses Crops']")private WebElement cropcatPulsesCrops;
	@FindBy(xpath = "//span[text()='Spices']")private WebElement cropcatSpices;
	@FindBy(xpath ="//span[text()='Crop']/ancestor::formly-field[@class='col-12 ng-star-inserted']/descendant::span[@class='ng-star-inserted']")private WebElement cropddopt;
	@FindBy(xpath ="//span[text()='Internet']")private WebElement leadSourceInternet;
	@FindBy(xpath ="//span[text()='Newspaper']")private WebElement leadSourceNewspaper;
	@FindBy(xpath ="//span[text()='Friends']")private WebElement leadSourceFriends;
	@FindBy(xpath ="//span[text()='Other']")private WebElement leadSourceOther;
	
	public WebElement getLeadSourceInternet() {
		return leadSourceInternet;
	}
	public WebElement getLeadSourceNewspaper() {
		return leadSourceNewspaper;
	}
	public WebElement getLeadSourceFriends() {
		return leadSourceFriends;
	}
	public WebElement getLeadSourceOther() {
		return leadSourceOther;
	}
	public WebElement getCropddopt() {
		return cropddopt;
	}
	public WebElement getVillageddopt() {
		return villageddopt;
	}
	public WebElement getAddbtn() {
		return addbtn;
	}
	public WebElement getLeadsbtn() {
		return leadsbtn;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getNametb() {
		return nametb;
	}
	public WebElement getPhonetb() {
		return phonetb;
	}
	public WebElement getMandaldd() {
		return mandaldd;
	}
	public WebElement getVillagedd() {
		return villagedd;
	}
	public WebElement getCropcategorydd() {
		return cropcategorydd;
	}
	public WebElement getCropydd() {
		return cropydd;
	}
	public WebElement getLeadSourcedd() {
		return leadSourcedd;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	public WebElement getCropcatoilseeds() {
		return cropcatoilseeds;
	}
	public WebElement getCropcatPlantationCrops() {
		return cropcatPlantationCrops;
	}
	public WebElement getCropcatPulsesCrops() {
		return cropcatPulsesCrops;
	}
	public WebElement getCropcatSpices() {
		return cropcatSpices;
	}
	public void createLead() throws Throwable
	{
		FileUtil fu=new FileUtil();
		
		String name = fu.readDataFromExcel(Constants.excel_path, "Leads",1, 0);
		String phone = fu.readDataFromExcel(Constants.excel_path, "Leads", 1, 1);
		getLeadsbtn().click();
		getAddbtn().click();
		getNametb().sendKeys(name);
		getPhonetb().sendKeys(phone);
		getVillagedd().click();
		getVillageddopt().click();
		getCropcategorydd().click();
		getCropcatoilseeds().click();
		Thread.sleep(2000);
		getCropydd().click();
		getCropddopt().click();
		getLeadSourcedd().click();
		getLeadSourceInternet().click();
		
	}
	
}
