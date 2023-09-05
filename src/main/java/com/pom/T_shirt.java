package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T_shirt {
public WebDriver driver;

@FindBy (xpath = "//div[@class='loaderCat viptshirtLdr dIb mA pA r0   h80 b4 l0 t0 ']")
private WebElement Tshrit;

public WebElement getTshrit() {
	return Tshrit;
}


	public T_shirt(WebDriver driv) {
	driver = driv;
	PageFactory.initElements(driver, this);
	
}

@FindBy(xpath = "//span[@class=' h321  dB vT pR bgF wp100']")
private WebElement Kanika;

public WebElement getKanika() {
	return Kanika;
}

@FindBy(xpath = "//img[@class='dB h412 w310 mA pR prdI gtm-p an-ll o0']")
private WebElement Purpletshirt;

public WebElement getPurpletshirt() {
	return Purpletshirt;
}

@FindBy(xpath = "//span[@id='size_30274873']")
private WebElement	Size;

public WebElement getSize() {
	return Size;
}

@FindBy(xpath = "//div[@class='h48 bs avail  bgL br4 p12 cF taC fwB gtm-atc bxs hbxs']")
private WebElement Cart;

public WebElement getCart() {
	return Cart;
}

}
