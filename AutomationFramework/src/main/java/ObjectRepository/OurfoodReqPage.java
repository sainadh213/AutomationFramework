package ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericLibrary.Constants;
import GenericLibrary.FileUtil;

public class OurfoodReqPage {
	WebDriver driver;
	FileUtil fu = new FileUtil();
	String requestId;

	OurFoodHomePage ofh = new OurFoodHomePage(driver);

	public OurfoodReqPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[text()='REQUEST']")
	private WebElement requestbtn;
	@FindBy(xpath = "//button[@title='Raise a request']")
	private WebElement raiseareqbtn;
	@FindBy(id = "description")
	private WebElement requesttb;
	@FindBy(xpath = "//span[text()='Add']")
	private WebElement addbtn;
	@FindBy(xpath = "//span[text()='Respond']")
	private WebElement respondbtn;
	@FindBy(xpath = "//span[text()='Reopen']")
	private WebElement reopenbtn;
	@FindBy(xpath = "//span[contains(text(),'REQ-')]")
	private WebElement reqid;
	@FindBy(xpath = "//span[text()='Filter']")
	private WebElement filterbtn;
	@FindBy(xpath = "//button[@title='Apply']")
	private WebElement applybtn;
	@FindBy(xpath = "//textarea[@id='response']")
	private WebElement commentstb;
	@FindBy(id = "btnSubmit")
	private WebElement submitresbtn;
	@FindBy(id = "description")
	private WebElement reoepnreqtb;
	@FindBy(xpath = "//span[text()='Reopen Request']")
	private WebElement reopenreqbtn;
	@FindBy(xpath = "//strong[text()='Operations']")
	private WebElement optbtn;
	@FindBy(xpath = "//strong[text()='Business Development']")
	private WebElement bussinesdevbtn;
	@FindBy(xpath = "//strong[text()='Communications']")
	private WebElement communicationsbtn;
	@FindBy(xpath = "//strong[text()='Sales']")
	private WebElement salesbtn;
	@FindBy(xpath = "//strong[text()='Warehousing']")
	private WebElement warehousesbtn;
	@FindBy(xpath = "//label[text()='Material Request']")
	private WebElement requesttypedd;
	@FindBy(xpath = "//span[text()='Material Request']")
	private WebElement materialReqOpt;
	@FindBy(xpath = "//span[text()='Maintenance Request']")
	private WebElement maintenancReqOpt;
	@FindBy(xpath = "//span[text()='Service Request']")
	private WebElement serviceReqOpt;
	@FindBy(xpath = "//span[text()='Resource Request']")
	private WebElement resourceReqOpt;
	@FindBy(xpath = "//label[text()='Req Id']/following-sibling::span[contains(text(),REQ-)]")
	private WebElement createdreqid;
	@FindBy(id="data_filter")private WebElement filterSreachbtn;
	@FindBy(xpath ="//span[text()='Apply'")private WebElement reqApplybtn;

	public WebElement getReqApplybtn() {
		return reqApplybtn;
	}

	public WebElement getFilterSreachbtn() {
		return filterSreachbtn;
	}

	public WebElement getRequesttypedd() {
		return requesttypedd;
	}

	public WebElement getCreatedreqid() {
		return createdreqid;
	}

	public WebElement getMaterialReqOpt() {
		return materialReqOpt;
	}

	public WebElement getMaintenancReqOpt() {
		return maintenancReqOpt;
	}

	public WebElement getServiceReqOpt() {
		return serviceReqOpt;
	}

	public WebElement getResourceReqOpt() {
		return resourceReqOpt;
	}

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

	public WebElement getCommentstb() {
		return commentstb;
	}

	public WebElement getReoepnreqtb() {
		return reoepnreqtb;
	}

	public WebElement getReopenreqbtn() {
		return reopenreqbtn;
	}

	public WebElement getSubmitresbtn() {
		return submitresbtn;
	}

	public WebElement getReqid() {
		return reqid;
	}

	public WebElement getFilterbtn() {
		return filterbtn;
	}

	public WebElement getApplybtn() {
		return applybtn;
	}

	public WebElement getRespondbtn() {
		return respondbtn;
	}

	public WebElement getRequestbtn() {
		return requestbtn;
	}

	public WebElement getRaiseareqbtn() {
		return raiseareqbtn;
	}

	public WebElement getRequesttb() {
		return requesttb;
	}

	public WebElement getAddbtn() {
		return addbtn;
	}

	public WebElement getReopenbtn() {
		return reopenbtn;
	}

	public void raiseReq(WebElement dept, WebElement reqType) throws Throwable {
		dept.click();
		getRequestbtn().click();
		getAddbtn().click();
		String reqData = fu.readDataFromExcel(Constants.excel_path, "RequestCreation", 0, 0);
		getRequesttypedd().click();
		Thread.sleep(3000);
		reqType.click();
		getRequesttb().sendKeys(reqData);
		 getRaiseareqbtn().click();
		// String requestId = getReqid().getText();
		 //requestId = getCreatedreqid().getText();
	}

	public void respondReq(WebElement dept) throws Throwable {

		dept.click();
		getRequestbtn().click();
		//getRequesttypedd().click();
		// getFilterbtn().click();
		//filterSreachbtn.sendKeys(requestId);
		//reqApplybtn.click();
		
		getRespondbtn().click();
		String responcetext = fu.readDataFromExcel(Constants.excel_path, "RespondReq", 0, 0);
		getCommentstb().sendKeys(responcetext);
		 getSubmitresbtn().click();
	}

	public void reopenReq(WebElement dept) throws Throwable {
		dept.click();
		getRequestbtn().click();
		getReopenbtn().click();
		String reqData = fu.readDataFromExcel(Constants.excel_path, "ReopenReq", 0, 0);
		getReoepnreqtb().clear();
		getReoepnreqtb().sendKeys(reqData);
		 getReopenreqbtn().click();
	}

}