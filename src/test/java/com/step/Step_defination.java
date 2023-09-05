package com.step;

import com.Base.Baseclass;
import com.pom.Login_page;
import com.pom.T_shirt;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Step_defination extends Baseclass {
	
	Login_page IP = new Login_page(driver);
	T_shirt VK = new T_shirt(driver);
	
	@Given("Launch url\"https:\\/\\/www.limeroad.com\\/\";")
	public void launch_url_https_www_limeroad_com() {
		url("https://www.limeroad.com/");
	}

	@When("User clicks on shop men")
	public void user_clicks_on_shop_men() throws Exception {
		
	//	IP.getShopmen().click();
		Thread.sleep(3000);
	click(IP.getShopmen());
	
	}
	
	@When("User clicks on the T-shirt")
	public void user_clicks_on_the_t_shirt() throws Exception {
	Thread.sleep(3000);
	    click(VK.getTshrit());
	}
	
	@When("User Select brand of Kanikacrystal")
	public void user_select_brand_of_kanikacrystal() throws Exception {
	Thread.sleep(3000);
		click(VK.getKanika());
	}
	
	@When("User Select tshirt color purple")
	public void user_select_tshirt_color_purple() throws Exception {
	Thread.sleep(3000);
	click(VK.getPurpletshirt());
	
	}
	@When("User Select size 2XL")
	public void user_select_size_2xl() throws Exception {
		Thread.sleep(3000);
		click(VK.getSize());  
	}
	@When("User add the tshirt to the Cart")
	public void user_add_the_tshirt_to_the_cart() throws Exception {
	Thread.sleep(3000);
		click(VK.getCart());
	}
		
	}
