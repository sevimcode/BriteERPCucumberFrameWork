package step_definitions;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.Config_ActivityTypes_Page;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;

public class Config_ActivityTypes_Steps {

    LoginPage loginPage = new LoginPage ();
    HomePage homePage = new HomePage ();
    Config_ActivityTypes_Page config_activityTypes_page=new Config_ActivityTypes_Page();

    @Then("User clicks on activity types under configuration feature")
    public void user_clicks_on_activity_types_under_configuration_feature() {
    config_activityTypes_page.activityTypes.click();
    }

    @Then("User should be ble to see activity types page")
    public void user_should_be_ble_to_see_activity_types_page() {
        String actualTitle="Activity Types - Odoo";
        String expectedTitle= Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);



    }




}




