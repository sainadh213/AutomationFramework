package OurFood;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.Constants;
import GenericLibrary.FileUtil;
import ObjectRepository.OurFoodHomePage;

public class CreateStartDay extends BaseClass{
	@Test
	public void createStartDay() throws Throwable
	{
OurFoodHomePage ofh=new OurFoodHomePage(driver);
ofh.getStartdaybtn().click();
FileUtil fu=new FileUtil();
String data = fu.readDataFromExcel(Constants.excel_path, "StartDay", 0, 0);
ofh.getYourPlantb().sendKeys(data);
Thread.sleep(9000);
ofh.getStartthedaybtn().click();

}
}