package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CRMLandingPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.Config;
import utilities.Driver;

public class Pipeline_Quotations_Steps {
    LoginPage loginPage = new LoginPage ();
    HomePage homePage = new HomePage ();
    CRMLandingPage crmLandingPage = new CRMLandingPage ();

    @When("User is on BriteERP Landing page")
    public void user_is_on_BriteERP_Landing_page() {
            Driver.getDriver ().get (Config.getProperty ("briteERPUrl"));
        }

    @When("User clicks on CRM module")
    public void user_clicks_on_CRM_module() {

    }

    @Then("user should be able to see the CRM module Landing page")
    public void user_should_be_able_to_see_the_CRM_module_Landing_page() {

    }

    @When("User is on CRM landing page")
    public void user_is_on_CRM_landing_page() {

    }

    @When("User clicks on quotations")
    public void user_clicks_on_quotations() {

    }

    @Then("User should be ble to see pipeline quotations page")
    public void user_should_be_ble_to_see_pipeline_quotations_page() {

    }

}


