package com.abc.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	WebDriver driver = null;
	By myacct = By.linkText("My Account");
	public Home(WebDriver driver)
	{
		this.driver = driver;
	}
	public void clickOnMyAcct()
	{
		driver.findElement(myacct).click();
	}
}
