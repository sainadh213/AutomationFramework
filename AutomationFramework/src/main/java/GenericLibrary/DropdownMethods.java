package GenericLibrary;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownMethods {
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
}
