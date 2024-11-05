package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import testingbaba_pages.Loginpage;

public class Logintest extends BaseLibrary{
	
	Loginpage obj;
	@BeforeTest
	public void getLaunchUrl_testingbaba()
	{
		 getLaunchUrl("https://testingbaba.com/old/");
		 obj = new Loginpage();
	}
	@Test(priority=1)
	public void getTitle_testingbaba()
	{
		obj.getTitle_testingbaba();
	}
}
