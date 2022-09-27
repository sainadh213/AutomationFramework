package OurFood;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import ObjectRepository.OurfoodLoginPage;
import ObjectRepository.OurfoofMaterialRequestPage;

public class CreatingMaterialReq extends BaseClass{
	@Test
	public void create() throws Throwable {
		OurfoodLoginPage ofl=new OurfoodLoginPage(driver);
		
		ofl.loginToOurfood("oiusername","password");
		OurfoofMaterialRequestPage omr=new OurfoofMaterialRequestPage(driver);
		omr.oi_inward_creation("100000", "10000");
		Thread.sleep(2000);
		logout();
		Thread.sleep(10000);
		ofl.loginToOurfood("pciusername","password");
		omr.pciAccept();
		Thread.sleep(2000);
		logout();
		Thread.sleep(10000);
		ofl.loginToOurfood("loiusername","password");
		omr.loiUpdate("AP 34 CY 8956");
		Thread.sleep(2000);
		logout();
		Thread.sleep(10000);
		ofl.loginToOurfood("dciusername","password");
		omr.dciShip("25000","4532","150");
		Thread.sleep(2000);
		logout();
		Thread.sleep(10000);
		}

}
