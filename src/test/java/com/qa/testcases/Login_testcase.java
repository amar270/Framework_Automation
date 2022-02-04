package com.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.BaseClass.BaseClass;
import com.qa.pages.Login_page;
public class Login_testcase {
	
	public class TC_LoginTest_001 extends BaseClass
	{

		@Test
		public void loginTest() throws IOException 
		{
				
			logger.info("URL is opened");
			
			Login_page lp=new Login_page(driver);
			lp.setUserName(username);
			logger.info("Entered username");
			
			lp.setPassword(password);
			logger.info("Entered password");
			
			lp.clickSubmit();
			
			if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
			{
				Assert.assertTrue(true);
				logger.info("Login test passed");
			}
			else
			{
				captureScreen(driver,"loginTest");
				Assert.assertTrue(false);
				logger.info("Login test failed");
			}
		}
	}
}