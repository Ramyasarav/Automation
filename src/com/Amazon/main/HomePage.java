package com.Amazon.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HomePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	public static void validSearch() {
		WebDriver driver = new FirefoxDriver();
		// System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		WebElement input = driver.findElement(By.id("twotabsearchtextbox"));
		input.sendKeys("todays deal");
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();

		// driver.navigate().back();
		// driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("http://www.amazon.com/gift-cards/b/ref=nav_cs_gc?ie=UTF8&node=2238192011");

	}

}
