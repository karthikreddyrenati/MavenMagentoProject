package com.abc.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {
	WebDriver driver=null;
	By logOut = By.linkText("Log Out");
	public Main(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickOnLogOut()
	{
		driver.findElement(logOut).click();
	}
}
