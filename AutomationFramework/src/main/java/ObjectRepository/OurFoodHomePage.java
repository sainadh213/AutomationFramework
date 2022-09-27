package ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

public class OurFoodHomePage {
	WebDriver driver;
	public OurFoodHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath ="//span[text()='Start Day']")private WebElement startdaybtn;
	@FindBy(xpath ="//span[@class='ng-star-inserted']")private WebElement startthedaybtn;
	@FindBy(xpath ="//span[text()='End Day']")private WebElement enddaybtn;
	@FindBy(xpath ="//span[text()='History']")private WebElement historybtn;
	@FindBy(xpath ="//i[@class='icon-analysis-2']")private WebElement dashboardbtn;
	@FindBy(xpath ="//i[@class='icon-profile']")private WebElement reportingmanagerbtn;
	@FindBy(xpath ="//i[@class='tss-user-group-1']")private WebElement myteambtn;
	@FindBy(xpath ="//i[@class='icon-users-2']")private WebElement leadsmodbtn;
	@FindBy(xpath ="//label[text()='REQUEST']")private WebElement requestbtn;
	@FindBy(xpath ="//label[text()='TEAM UPDATES']")private WebElement teamupdatebtn;
	@FindBy(xpath ="//label[text()='LEADS']")private WebElement leadsbtn;
	@FindBy(xpath ="//span[text()='Add']")private WebElement addbtn;
	@FindBy(xpath ="//span[text()='Edit']")private WebElement editbtn;
	@FindBy(xpath ="//span[text()='Filter']")private WebElement filterbtn;
	@FindBy(xpath ="//button[@title='Apply']")private WebElement applybtn;
	@FindBy(id="btnSubmit")private WebElement updatebtn;
	@FindBy(xpath="//span[text()='×']")private WebElement cancelbtn;
	@FindBy(xpath = "//textarea[@id='start_desc']")private WebElement yourPlantb;
	@FindBy(id="userdroupdown")private WebElement userdd;
	@FindBy(id="logout")private WebElement logoutbtn;
	@FindBy(xpath = "(//label[text()='Planned '])[1]/ancestor::div[@class='zc-card-item col-12 p-0  zc-two-line-ellipses']/descendant::span")private WebElement editedtext;
	@FindBy(id="description")private WebElement requesttb;
	@FindBy(xpath ="//button[@title='Raise a request']")private WebElement raiseareqbtn;
	@FindBy(xpath ="//span[contains(text(),'REQ-')]")private List<WebElement>  reqid;
	@FindBy(xpath ="//button[text()='Load More']")private WebElement loadmorebtn;
	@FindBy(xpath ="//label[text()='SUBORDINATES REQUESTS']")private WebElement  subreqbtn;
	@FindBy(xpath ="//strong[text()='Operations']")private WebElement optbtn;
	@FindBy(xpath ="//strong[text()='Business Development']")private WebElement bussinesdevbtn;
	@FindBy(xpath ="//strong[text()='Communications']")private WebElement communicationsbtn;
	@FindBy(xpath ="//strong[text()='Sales']")private WebElement salesbtn;
	@FindBy(xpath ="//strong[text()='Warehousing']")private WebElement warehousesbtn;
	public WebElement getOptbtn() {
		return optbtn;
	}
	public WebElement getBussinesdevbtn() {
		return bussinesdevbtn;
	}
	public WebElement getCommunicationsbtn() {
		return communicationsbtn;
	}
	public WebElement getSalesbtn() {
		return salesbtn;
	}
	public WebElement getWarehousesbtn() {
		return warehousesbtn;
	}
	public WebElement getSubreqbtn() {
		return subreqbtn;
	}
	public List<WebElement> getReqid() {
		return  reqid;
	}
	public WebElement getLoadmorebtn() {
		return loadmorebtn;
	}
	public WebElement getStartthedaybtn() {
		return startthedaybtn;
	}
	public WebElement getRaiseareqbtn() {
		return raiseareqbtn;
	}

	public WebElement getRequesttb() {
		return requesttb;
	}

	public WebElement getEditedtext() {
		return editedtext;
	}

	public WebElement getUserdd() {
		return userdd;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	public WebElement getUpdatebtn() {
		return updatebtn;
	}
	
	public WebElement getYourPlantb() {
		return yourPlantb;
	}
	
	public WebElement getStartdaybtn() {
		return startdaybtn;
	}
	public WebElement getEnddaybtn() {
		return enddaybtn;
	}
	public WebElement getHistorybtn() {
		return historybtn;
	}
	public WebElement getDashboardbtn() {
		return dashboardbtn;
	}
	public WebElement getReportingmanagerbtn() {
		return reportingmanagerbtn;
	}
	public WebElement getMyteambtn() {
		return myteambtn;
	}
	public WebElement getLeadsmodbtn() {
		return leadsmodbtn;
	}
	public WebElement getRequestbtn() {
		return requestbtn;
	}
	public WebElement getTeamupdatebtn() {
		return teamupdatebtn;
	}
	public WebElement getLeadsbtn() {
		return leadsbtn;
	}
	public WebElement getAddbtn() {
		return addbtn;
	}
	public WebElement getEditbtn() {
		return editbtn;
	}
	public WebElement getFilterbtn() {
		return filterbtn;
	}
	public WebElement getApplybtn() {
		return applybtn;
	}
	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	public void logoutToOurFood() throws InterruptedException
	{
		Thread.sleep(2000);
		getUserdd().click();
		getLogoutbtn().click();
	}
	

}
