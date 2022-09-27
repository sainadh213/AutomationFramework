
package OurFood;


	

	import java.util.ArrayList;

	import org.openqa.selenium.WebElement;
	import org.testng.annotations.Test;

	import GenericLibrary.BaseClass;
	import ObjectRepository.OurFoodHomePage;

	public class WillTry extends BaseClass{
		@Test
		public void matching()
		{
			ArrayList<WebElement> request=new ArrayList<WebElement>();
			//List<WebElement> subrequest;
			ArrayList<WebElement> subrequest=new ArrayList<WebElement>();
			OurFoodHomePage ofh=new OurFoodHomePage(driver);
			ofh.getOptbtn().click();
			ofh.getRequestbtn().click();
		
			while(true)
			{
				try {
					ofh.getLoadmorebtn().click();
					
				} catch (Exception e) {
					 //System.out.println(ofh.getReqid().size()); 
					 request = (ArrayList<WebElement>) ofh.getReqid();
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
					 subrequest = (ArrayList<WebElement>) ofh.getReqid();
					break;
				}
			}
			for (WebElement one : request) {
				request.add(one);
				System.out.println(one.getText());
			}
			System.out.println("==================================");
			for (WebElement one : subrequest) {
				subrequest.add(one);
				//String id = one.getText();
				//request.add(id);
			}
			System.out.println(request+"\n"+subrequest);
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

