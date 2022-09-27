package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurfoodInHouseProcessingPage {
	WebDriver driver;

	public OurfoodInHouseProcessingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[text()='In-House Processing']")
	private WebElement inhousebtn;
	@FindBy(xpath = "//span[text()='Add']")
	private WebElement addbtn;
	@FindBy(id = "lot_no")
	private WebElement lotnotb;
	@FindBy(xpath = "//label[text()='Select unit size']")
	private WebElement unitsizedd;
	@FindBy(xpath = "//span[text()='50 Kgs']")
	private WebElement opt50kg;
	@FindBy(xpath = "//span[text()='25 Kgs']")
	private WebElement opt25kg;
	@FindBy(xpath = "//span[text()='10 Kgs']")
	private WebElement opt10kg;
	@FindBy(id = "no_of_units")
	private WebElement unitstb;
	@FindBy(id = "btnAdd")
	private WebElement addinhousebtn;
	@FindBy(id = "save")
	private WebElement savebtn;
	@FindBy(xpath = "//span[text()='Complete']")
	private WebElement complete;
	@FindBy(xpath = "//a[@title='Add']")
	private WebElement addinhouse;

	@FindBy(id = "formly_11_select_crop_3")
	private WebElement cropdd;
	@FindBy(xpath = "(//li[@class='ui-dropdown-item ui-corner-all'])[4]")
	private WebElement cropddopt;

	@FindBy(xpath = "//p-dropdown[@id='formly_11_select_operation_unit_1']")
	private WebElement sourcedd;
	@FindBy(xpath = "(//span[@class='ng-star-inserted'])[2]")
	private WebElement sourceddopt;
	@FindBy(xpath = "(//span[@class='info'])[3]")
	private WebElement addqtybtn;
	@FindBy(id = "formly_11_select_category_2")
	private WebElement categotydd;
	@FindBy(xpath = "//span[text()='Oilseeds']")
	private WebElement oilseedsopt;
	@FindBy(xpath = "//span[text()='Plantation Crops']")
	private WebElement plantationCropsopt;
	@FindBy(xpath = "//span[text()='Pulses Crops']")
	private WebElement pulsesCropsopt;
	@FindBy(xpath = "//span[text()='Spices']")
	private WebElement spicesopt;

	public WebElement getAddqtybtn() {
		return addqtybtn;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getCropdd() {
		return cropdd;
	}

	public WebElement getCropddopt() {
		return cropddopt;
	}

	public WebElement getSourcedd() {
		return sourcedd;
	}

	public WebElement getSourceddopt() {
		return sourceddopt;
	}

	public WebElement getInhousebtn() {
		return inhousebtn;
	}

	public WebElement getAddbtn() {
		return addbtn;
	}

	public WebElement getLotnotb() {
		return lotnotb;
	}

	public WebElement getUnitsizedd() {
		return unitsizedd;
	}

	public WebElement getOpt50kg() {
		return opt50kg;
	}

	public WebElement getOpt25kg() {
		return opt25kg;
	}

	public WebElement getOpt10kg() {
		return opt10kg;
	}

	public WebElement getUnitstb() {
		return unitstb;
	}

	public WebElement getAddinhousebtn() {
		return addinhousebtn;
	}

	public WebElement getComplete() {
		return complete;
	}

	public WebElement getAddinhouse() {
		return addinhouse;
	}

	public WebElement getCategotydd() {
		return categotydd;
	}

	public WebElement getPlantationCropsopt() {
		return plantationCropsopt;
	}

	public WebElement getPulsesCropsopt() {
		return pulsesCropsopt;
	}

	public WebElement getSpicesopt() {
		return spicesopt;
	}

	public void createInhouseOI(String qty, String lot, String units) throws Throwable {
		getInhousebtn().click();
		getAddbtn().click();
		Thread.sleep(2000);
		OurfoofMaterialRequestPage omr = new OurfoofMaterialRequestPage(driver);
		getSourcedd().click();
		Thread.sleep(2000);
		getSourceddopt().click();
		Thread.sleep(2000);
		getCropdd().click();
		Thread.sleep(2000);
		getCropddopt().click();
		omr.getVarietydd().click();
		omr.getVarietyddoptn().click();
		omr.getGradedd().click();
		omr.getGrade_C_opt().click();
		omr.getQuantitytb().sendKeys(qty);
		getLotnotb().sendKeys(lot);
		Thread.sleep(3000);
		getAddinhouse().click();
		getUnitsizedd().click();
		getOpt50kg().click();
		getUnitstb().sendKeys(units);
		getAddinhousebtn().click();
		Thread.sleep(2000);
		getSavebtn().click();
		Thread.sleep(90000);
		getComplete().click();
		getAddinhouse().click();
		getUnitsizedd().click();
		getOpt50kg().click();
		getUnitstb().sendKeys(units);
		omr.getGradedd().click();
		omr.getGrade_C_opt().click();
		Thread.sleep(5000);
		getAddqtybtn().click();
		getComplete().click();

	}

	public void createInHouseDci(String qty, String lot, String units) throws Throwable {
		OurfoofMaterialRequestPage omr = new OurfoofMaterialRequestPage(driver);
		getInhousebtn().click();
		getAddbtn().click();
		getSourcedd().click();
		Thread.sleep(2000);
		getSourceddopt().click();
		getCategotydd().click();
		getSpicesopt().click();
		getCropdd().click();
		Thread.sleep(2000);
		getCropddopt().click();
		omr.getVarietydd().click();
		omr.getVarietyddoptn().click();
		omr.getGradedd().click();
		omr.getGrade_C_opt().click();
		omr.getQuantitytb().sendKeys(qty);
		getLotnotb().sendKeys(lot);
		Thread.sleep(3000);
		getAddinhouse().click();
		getUnitsizedd().click();
		getOpt50kg().click();
		getUnitstb().sendKeys(units);
		getAddinhousebtn().click();
		Thread.sleep(2000);
		getSavebtn().click();
		Thread.sleep(60000);
		getComplete().click();
		getAddinhouse().click();
		getUnitsizedd().click();
		getOpt50kg().click();
		getUnitstb().sendKeys(units);
		omr.getGradedd().click();
		omr.getGrade_C_opt().click();
		Thread.sleep(5000);
		getAddqtybtn().click();
		getComplete().click();
	}

}
