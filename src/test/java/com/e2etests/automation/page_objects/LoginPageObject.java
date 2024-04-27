package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageObject {
	public ConfigFileReader configFileReader;
	
//recherche des elements
	@FindBy(how = How.ID, using = "user-name")
	public static WebElement username;

	@FindBy(how = How.ID, using = "password")
	public static WebElement password;

	@FindBy(how = How.ID, using = "login-button")
	public static WebElement login;
	
	@FindBy(how = How.XPATH, using = "//span[@class='title']")
	public static WebElement title;

	@FindBy(how = How.XPATH, using = "//div[@id='login_button_container']//form//h3")
	public static WebElement msgerreur;
	
	
	
	@FindBy(how = How.ID, using = "react-burger-menu-btn")
	public static WebElement menu;
	
	@FindBy(how = How.ID, using = "logout_sidebar_link")
	public static WebElement logoutbtn;
	
	//methodes
	public LoginPageObject() {
		PageFactory.initElements(Setup.getDriver(), this);
		configFileReader= new ConfigFileReader();
	}
	
	public void connectToApp() {
		Setup.getDriver().get(configFileReader.getProperties("url"));
	}
	
	public void saisisUsername(String usr) {
		username.sendKeys(usr);
	}
	
	public void saisisPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void cliqueBouton() {
		login.click();
	}
	  

	public void jeCliqueSurLeMenu() {
		menu.click();
		
	}
	
	public void jeCliqueSurLogout() {
		logoutbtn.click();
	}
	
	public String jeMeDirigeVersLaPageLogin() {
	   return Setup.getDriver().getCurrentUrl();
	}

	public void fillUsername() {
		username.sendKeys(configFileReader.getProperties("username"));
	}
	
	public void fillPassword() {
		password.sendKeys(configFileReader.getProperties("password"));
	}
}
