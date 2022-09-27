package OurFood;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import ObjectRepository.OurfoodLoginPage;
import ObjectRepository.OurfoodReqPage;

public class RequestChecking extends BaseClass {
	@Test
	public void requestChecking() throws Throwable {
		OurfoodLoginPage ofl = new OurfoodLoginPage(driver);
		ofl.loginToOurfood("un1", "password");
		OurfoodReqPage ofr = new OurfoodReqPage(driver);
		ofr.raiseReq(ofr.getSalesbtn(), ofr.getMaterialReqOpt());
		logout();
		Thread.sleep(120000);
		ofl.loginToOurfood("un2", "password");
		ofr.respondReq(ofr.getSalesbtn());
		logout();
		Thread.sleep(90000);
		ofl.loginToOurfood("un1", "password");
		ofr.reopenReq(ofr.getSalesbtn());
		logout();
		driver.quit();
	}

}
