package OurFood;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import ObjectRepository.OurfoodInHouseProcessingPage;
import ObjectRepository.OurfoodLoginPage;

public class CreateInhouseWithDci extends BaseClass {
	@Test
	public void createInHouseProcess() throws Throwable
	{
	OurfoodLoginPage ofl=new OurfoodLoginPage(driver);
	
	ofl.loginToOurfood("username","password");
	OurfoodInHouseProcessingPage oih=new OurfoodInHouseProcessingPage(driver);
	oih.createInHouseDci("100000", "8941", "200");
}

}
