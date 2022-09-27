package GenericLibrary;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtil {
public static Select sl;

	
	public void byIndex(WebElement ddadd,int index)
	{
		 sl=new Select(ddadd);
		sl.selectByIndex(index);
	}
	public void byValue(WebElement ddadd,String value)
	{
		sl=new Select(ddadd);
		sl.selectByValue(value);
	}
	public void byText(WebElement ddadd,String text)
	{
		sl=new Select(ddadd);
		sl.selectByVisibleText(text);
	}
	
    public void printAllOptions(WebElement ddadd)
    {
    	sl=new Select(ddadd);
    	List<WebElement> allopt = sl.getOptions();
    	for (WebElement opt : allopt) 
    	{
    		System.out.println(opt.getText());
			
	    }
    
    }
	public void withoutSelectClass(WebElement ddadd,String value) 
	{
		sl=new Select(ddadd);
    	List<WebElement> allopt = sl.getOptions();
    	for (WebElement opt : allopt) 
    	{
    		if(value.equalsIgnoreCase(opt.getText()))
    		{
    			opt.click();
    		}
			
	    }
	}
	public	static Actions ac;
	public void moveToElement(WebElement element_add)
	{
		ac=new Actions(BaseClass.driver);
		ac.moveToElement(element_add).perform();
	}
	public int randomNumber()
	{
		Random rn=new Random();
	int randomNumber = rn.nextInt();
	return randomNumber;
	}
	public void waitForElement(int time)
	{
		BaseClass.driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
	public void waitForElement(int time,WebElement address)
	{
		WebDriverWait wait=new WebDriverWait(BaseClass.driver, time);
				wait.until(ExpectedConditions.elementToBeClickable(address));
	}
	

	
}
