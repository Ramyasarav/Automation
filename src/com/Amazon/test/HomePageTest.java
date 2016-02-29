package com.Amazon.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Amazon.main.HomePage;

public class HomePageTest {
	WebDriver driver;
	
	//*@BeforeClass
	public void openBrowser(){
		 driver= new FirefoxDriver();
		driver.get("http://www.amazon.com/");//		
	}
	
	@Test
	public void testSearch(){
		HomePage hp= new HomePage(driver);
		hp.validSearch();
		WebElement text = driver.findElement(By.id("s-result-count"));
		String str=text.getText();
		System.out.println(str);
		Assert.assertEquals("1-16 of 52,526 results for", str);
				
	}
	
	

}
