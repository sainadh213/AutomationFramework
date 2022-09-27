package OurFood;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import GenericLibrary.Constants;
import GenericLibrary.FileUtil;
import GenericLibrary.WebDriverUtil;
import ObjectRepository.OurFoodHomePage;
import junit.framework.Assert;

public class OurFood extends BaseClass{
@Test
public void editDilyUpdates() throws Throwable
{  WebDriverUtil wdu=new WebDriverUtil();
   wdu.waitForElement(20);
	OurFoodHomePage ofh=new OurFoodHomePage(driver);
	ofh.getHistorybtn().click();
	
	ofh.getEditbtn().click();;
	FileUtil fu=new FileUtil();
	String editText = fu.readDataFromExcel(Constants.excel_path,"Ourfood",1,0);
	
	    ofh.getYourPlantb().clear();
		ofh.getYourPlantb().sendKeys(editText);
		ofh.getUpdatebtn().click();
		String text = ofh.getEditedtext().getText();
		System.out.println(editText);
		System.out.println(text);
		Assert.assertEquals(editText, text);
		System.out.println("Edited successfully");
	}
}
