package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CRMLandingPage;
import pages.HomePage;
import pages.Lead_LeadTag_Page;
import pages.LoginPage;
import utilities.Config;
import utilities.Driver;
import utilities.SeleniumUtils;

public class Lead_LeadTags_Steps{

    LoginPage loginPage = new LoginPage ();
    CRMLandingPage crmLandingPage = new CRMLandingPage ();
    Lead_LeadTag_Page leadLeadTagPage = new Lead_LeadTag_Page ();

    @When("User is on BriteERP loginpage")
    public void user_is_on_BriteERP_loginpage() {

        Driver.getDriver ().get (Config.getProperty ("briteERPUrl"));
    }

    @When("User input {string} in username box")
    public void user_input_in_username_box( String string ) {
       loginPage.usernameInput.sendKeys (Config.getProperty("username"));
    }

    @When("User input {string} in password box")
    public void user_input_in_password_box( String string ) {
        loginPage.passwordInput.sendKeys (Config.getProperty("password"));
    }

    @Then("User should be able to login")
    public void user_should_be_able_to_login() {
        Assert.assertEquals (Driver.getDriver ().getTitle (),"Odoo");
    }

    @When("User should be click login button")
    public void user_should_be_click_login_button() {
       loginPage.loginButton.click ();
    }

    @Then("User should be able to see message")
    public void user_should_be_able_to_see_message() {
        SeleniumUtils.pause(2);
        Assert.assertTrue (loginPage.errorMessage.isDisplayed ());
    }


    @And("User input wrongPassword in password box")
    public void userInputWrongPasswordInPasswordBox() {
        loginPage.passwordInput.sendKeys (Config.getProperty ("wrongPassword") + Keys.ENTER);
    }


    @And("Click on Lead Oportunities")
    public void clickOnLeadOportunities() {
        crmLandingPage.LeadOportunities.click ();

    }

    @And("Click on Lead Tags")
    public void clickOnLeadTags() {
        crmLandingPage.LeadOpotunitiesLeadTags.click ();
    }

    @Then("User should be able to search on lead tags")
    public void userShouldBeAbleToSeeCreateButton() {
        Assert.assertTrue (leadLeadTagPage.searchBox.isDisplayed ());
        Assert.assertTrue (leadLeadTagPage.searchButton.isDisplayed ());

    }
}


