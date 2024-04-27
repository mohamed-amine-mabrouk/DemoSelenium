package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.LoginPageObject;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
 
	private LoginPageObject loginPageObject;
	
	public LoginStepDefinition() {
		loginPageObject=new LoginPageObject();
	}
	
	@Given("je me connecte sur lapplication SWAGLABS")
	public void jeMeConnecteSurLapplicationSWAGLABS() {
	  loginPageObject.connectToApp();
	}
	@When("je saisis le username {string}")
	public void jeSaisisLeUsername(String usr) {
	    loginPageObject.saisisUsername(usr);
	}
	@When("je saisis le mot de passe {string}")
	public void jeSaisisLeMotDePasse(String pwd) {
	   loginPageObject.saisisPassword(pwd);
	}
	@When("je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
	   loginPageObject.cliqueBouton();
	}
	@Then("je me dirige vers la page daccueil {string}")
	public void jeMeDirifeVersLaPageDaccueil(String attendu) {
	   String obtenu=LoginPageObject.title.getText();
	   Assert.assertEquals(obtenu, attendu);
	}

	@Then("un message derreur saffiche {string}")
	public void unMessageDerreurSaffiche(String msgAttendu) {
		String msgObtenu=LoginPageObject.msgerreur.getText();
		Assert.assertEquals(msgObtenu, msgAttendu);
	}
	
	@When("je clique sur le menu")
	public void jeCliqueSurLeMenu() {
		loginPageObject.jeCliqueSurLeMenu();
	}
	@When("je clique sur logout")
	public void jeCliqueSurLogout() {
		loginPageObject.jeCliqueSurLogout();
	}
	
	@Then("je me dirige vers la page login")
	public void jeMeDirigeVersLaPageLogin() {
	String URL=loginPageObject.jeMeDirigeVersLaPageLogin();
	Assert.assertEquals(URL, "https://www.saucedemo.com/");
	}

	@When("je saisis le username")
	public void jeSaisisLeUsername() {
    loginPageObject.fillUsername();
	   
	}
	@When("je saisis le mot de passe")
	public void jeSaisisLeMotDePasse() {
	loginPageObject.fillPassword();
	   
	}




}
