package OurFood;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import ObjectRepository.OurFoodHomePage;

public class MatchingRequestsandSuborinates extends BaseClass{
	@Test
	public void matching()
	{
		List<WebElement> request;
		List<WebElement> subrequest;
		OurFoodHomePage ofh=new OurFoodHomePage(driver);
		ofh.getOptbtn().click();
		ofh.getRequestbtn().click();
	
		while(true)
		{
			try {
				ofh.getLoadmorebtn().click();
				
			} catch (Exception e) {
				 //System.out.println(ofh.getReqid().size()); 
				 request = ofh.getReqid();
				break;
			}
		}
		ofh.getDashboardbtn().click();
		ofh.getSubreqbtn().click();
		while(true)
		{
			try {
				ofh.getLoadmorebtn().click();
				
			} catch (Exception e) {
				 //System.out.println(ofh.getReqid().size()); 
				 subrequest = ofh.getReqid();
				break;
			}
		}
		for (WebElement onereq : request) {
			request.add(onereq);
			System.out.println(onereq.getText());
		}
		System.out.println("==================================");
		for (WebElement onesub : subrequest) {
			subrequest.add(onesub);
			System.out.println(onesub.getText());
		}
		
		boolean result = request.equals(subrequest);
		if(result)
		{
			System.out.println("Requests and SubOrdinateRequest are Same");
		}
		else
		{
			System.out.println("Requests and SubOrdinateRequest are Not Same");
		}
		
	}

}
