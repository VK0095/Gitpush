package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	public WebDriver driver;

	@FindBy(xpath = "//span[text()='SHOP MEN']")
	private WebElement shopmen;

	public WebElement getShopmen() {
		return shopmen;
	}

	public Login_page(WebDriver driv) {
		driver = driv;
		PageFactory.initElements(driver, this);
	}

}
