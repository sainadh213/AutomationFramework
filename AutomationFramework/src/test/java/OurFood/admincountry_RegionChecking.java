package OurFood;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import ObjectRepository.OurfoodLoginPage;

public class admincountry_RegionChecking extends BaseClass {
	@Test
	public void checking() throws Throwable {
		OurfoodLoginPage ofl = new OurfoodLoginPage(driver);
		ofl.loginToOurfood("adminusername", "adminpassward");
		driver.findElement(By.xpath("//strong[text()='ODP Admin']")).click();

		driver.findElement(By.xpath("//button[@class='btn btn-primary ng-star-inserted']")).click();
	
		for (int i = 200; i <= 237; i++) {
			driver.findElement(By.xpath("//label[text()='Select country']")).click();
			driver.findElement(By.xpath("(//li[@class='ui-dropdown-item ui-corner-all'])["+ i + "]")).click();
			driver.findElement(By.xpath("//label[text()='Select region']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//i[@class='ui-dropdown-clear-icon pi pi-times ng-tns-c18-1 ng-star-inserted']")).click();
			
			
		}

	}
}
