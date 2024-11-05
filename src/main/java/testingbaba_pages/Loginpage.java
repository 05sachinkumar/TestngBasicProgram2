package testingbaba_pages;

import baselibrary.BaseLibrary;

public class Loginpage extends BaseLibrary{
	
	
	public void getTitle_testingbaba()
	{
		String title = driver.getTitle();
		System.out.println("testingbaba title here:"+title);
	}
}
