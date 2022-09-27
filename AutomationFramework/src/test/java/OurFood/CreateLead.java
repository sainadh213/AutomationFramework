package OurFood;

import org.testng.annotations.Test;

import GenericLibrary.BaseClass;
import ObjectRepository.OurfoodLeadsPage;

public class CreateLead extends BaseClass {
@Test
public void createLead() throws Throwable
{
	OurfoodLeadsPage olp=new OurfoodLeadsPage(driver);
	olp.createLead();
	}
}
