package ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurfoofMaterialRequestPage {
	WebDriver driver;

	public OurfoofMaterialRequestPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//strong[text()='ODP Admin']")private WebElement odpadminbtn;
	@FindBy(xpath = "//li[@class='ui-dropdown-item ui-corner-all']")private List<WebElement>allcun;
	public List<WebElement> getAllcun() {
		return allcun;
	}
	@FindBy(xpath = "//label[text()='Material Requests']")
	private WebElement materialreqbtn;
	@FindBy(xpath = "//span[text()='Add']")
	private WebElement addbtn;
	// @FindBy(xpath = "//span[text()='Inward']")
	@FindBy(xpath = "//input[@id='formly_11_radio_type_0_0']")
	private WebElement inwardrb;
	@FindBy(xpath = "//span[text()='Inward']")
	private WebElement outwardrb;
	@FindBy(xpath = "//span[text()='Add request']")
	private WebElement addreqbtn;
	@FindBy(xpath = "//span[text()='Accept Request']")
	private WebElement acceptReqbtn;

	public WebElement getAcceptReqbtn() {
		return acceptReqbtn;
	}

	@FindBy(xpath = "//label[text()='Select variety']")
	private WebElement varietydd;

	@FindBy(xpath = "(//span[@class='ng-star-inserted'])[4]")
	private WebElement varietyddoptn;
	@FindBy(xpath = "//label[text()='Select grade']")
	private WebElement gradedd;

	@FindBy(xpath = "//li[@aria-label='A']")
	private WebElement grade_A_opt;
	@FindBy(xpath = "//li[@aria-label='B']")
	private WebElement grade_B_opt;
	@FindBy(xpath = "//li[@aria-label='C']")
	private WebElement grade_C_opt;
	@FindBy(xpath = "//li[@aria-label='D']")
	private WebElement grade_D_opt;
	@FindBy(xpath = "//li[@aria-label='Raw']")
	private WebElement grade_Raw_opt;
	@FindBy(id = "quantity")
	private WebElement quantitytb;
	@FindBy(id = "price_per_unit")
	private WebElement unitpricetb;
	@FindBy(xpath = "//span[text()='In Process']")
	private WebElement inProcess;
	@FindBy(xpath = "//button[@title='Take action']")
	private WebElement takeactbtn;
	@FindBy(xpath = "//span[text()='Forward']")
	private WebElement forwardbtn;
	@FindBy(xpath = "//span[text()='Accept']")
	private WebElement acceptbtn;
	@FindBy(xpath = "//span[text()='Ship']")
	private WebElement shipbtn;
	

	public WebElement getShipbtn() {
		return shipbtn;
		
	}

	@FindBy(xpath = "//span[text()='Update Vehicle Info']")
	private WebElement vehicleInfobtn;

	@FindBy(xpath = "//span[text()='In Transit']")
	private WebElement inTransitbtn;

	public WebElement getInTransitbtn() {
		return inTransitbtn;
	}

	@FindBy(xpath = "//span[text()='Accepted']")
	private WebElement acceptedbtn;
	@FindBy(id = "comments")
	private WebElement commentstb;
	@FindBy(xpath = "//span[text()='Forward Request']")
	private WebElement forwardreqbtn;
	@FindBy(xpath = "//span[text()='Update Request']")
	private WebElement updatereqbtn;
	@FindBy(xpath = "//label[text()='Select operational units']")
	private WebElement operationalunitdd;
	@FindBy(xpath = "(//li[@class='ui-dropdown-item ui-corner-all'])[2]")
	private WebElement operationunitopt;
	@FindBy(id = "pickup_vehicle_no")
	private WebElement vehiclenotb;
	@FindBy(xpath = "//label[text()='Select stock grade']")
	private WebElement stockGradedd;
	@FindBy(xpath = "//label[text()='Select pickup grade']")
	private WebElement pickupGradedd;
	@FindBy(id = "price")
	private WebElement pricetb;
	@FindBy(id = "btnSave")
	private WebElement savebtn;

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getVehiclenotb() {
		return vehiclenotb;
	}

	public WebElement getAcceptedbtn() {
		return acceptedbtn;
	}

	public WebElement getAcceptbtn() {
		return acceptbtn;
	}

	public WebElement getOperationalunitdd() {
		return operationalunitdd;
	}

	public WebElement getOperationunitopt() {
		return operationunitopt;
	}

	public WebElement getMaterialreqbtn() {
		return materialreqbtn;
	}

	public WebElement getGradedd() {
		return gradedd;
	}

	public WebElement getUpdatereqbtn() {
		return updatereqbtn;
	}

	public WebElement getInwardrb() {
		return inwardrb;
	}

	public WebElement getOutwardrb() {
		return outwardrb;
	}

	public WebElement getAddreqbtn() {
		return addreqbtn;
	}

	public WebElement getVarietyddoptn() {
		return varietyddoptn;
	}

	public WebElement getVarietydd() {
		return varietydd;
	}

	public WebElement getGrade_A_opt() {
		return grade_A_opt;
	}

	public WebElement getGrade_B_opt() {
		return grade_B_opt;
	}

	public WebElement getGrade_C_opt() {
		return grade_C_opt;
	}

	public WebElement getStockGradedd() {
		return stockGradedd;
	}

	public WebElement getPickupGradedd() {
		return pickupGradedd;
	}

	public WebElement getGrade_D_opt() {
		return grade_D_opt;
	}

	public WebElement getGrade_Raw_opt() {
		return grade_Raw_opt;
	}

	public WebElement getQuantitytb() {
		return quantitytb;
	}

	public WebElement getUnitpricetb() {
		return unitpricetb;
	}

	public WebElement getAddbtn() {
		return addbtn;
	}

	public WebElement getInProcess() {
		return inProcess;
	}

	public WebElement getTakeactbtn() {
		return takeactbtn;
	}

	public WebElement getForwardbtn() {
		return forwardbtn;
	}

	public WebElement getCommentstb() {
		return commentstb;
	}

	public WebElement getForwardreqbtn() {
		return forwardreqbtn;
	}

	public WebElement getVehicleInfobtn() {
		return vehicleInfobtn;
	}

	public WebElement getPricetb() {
		return pricetb;
	}

	public void oi_inward_creation(String qty, String price) throws Throwable {
		getMaterialreqbtn().click();
		getAddbtn().click();
		Thread.sleep(2000);
		getInwardrb().click();
		getVarietydd().click();
		getVarietyddoptn().click();
		getGradedd().click();
		getGrade_A_opt().click();
		getQuantitytb().sendKeys(qty);
		getUnitpricetb().sendKeys(price);
		// getAddreqbtn().click();
		getInProcess().click();
		getTakeactbtn().click();
		getForwardbtn().click();
		getCommentstb().sendKeys("Forwarded");
		getForwardreqbtn().click();

	}

	public void pciAccept() {
		getMaterialreqbtn().click();
		getForwardbtn().click();
		getTakeactbtn().click();
		getAcceptbtn().click();
		getOperationalunitdd().click();
		getOperationunitopt().click();
		getCommentstb().sendKeys("Accepted");
		getAcceptReqbtn().click();

	}

	public void loiUpdate(String vehicleNo) {
		getMaterialreqbtn().click();
		getAcceptedbtn().click();
		getTakeactbtn().click();
		getVehicleInfobtn().click();
		getVehiclenotb().sendKeys(vehicleNo);
		getCommentstb().sendKeys("Vehicle number is " + vehicleNo);
		getUpdatereqbtn().click();

	}

	public void dciShip(String price, String lotno, String units) {
		getMaterialreqbtn().click();
		getAcceptedbtn().click();
		getTakeactbtn().click();
		getShipbtn().click();
		getAddbtn().click();
		OurfoofMaterialRequestPage ofmr = new OurfoofMaterialRequestPage(driver);
		getStockGradedd().click();
		ofmr.getGrade_A_opt().click();
		getPickupGradedd().click();
		ofmr.getGrade_A_opt().click();
		getPricetb().sendKeys(price);
		OurfoodInHouseProcessingPage ofih = new OurfoodInHouseProcessingPage(driver);
		ofih.getOpt50kg().click();
		ofih.getUnitstb().sendKeys(units);
		ofih.getAddinhouse().click();
		ofih.getLotnotb().sendKeys(lotno);
		getCommentstb().sendKeys("Material Shipped");
		getSavebtn().click();
	}

	public void oiReceive() {
		getMaterialreqbtn().click();
		getInTransitbtn().click();
	}

}
