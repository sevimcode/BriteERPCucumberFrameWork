package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.CRMLandingPage;
import pages.Lead_LostReasons_Page;
import pages.LoginPage;
import utilities.Config;
import utilities.Driver;

import java.security.Key;

public class Lead_LostReasons {

    LoginPage loginPage = new LoginPage();
    CRMLandingPage crmLandingPage = new CRMLandingPage();
    Lead_LostReasons_Page lead_lostReasons_page = new Lead_LostReasons_Page();

//    @Given("User is on Lost Reasons page")
//    public void user_is_on_Lost_Reasons_page() {
//        Driver.getDriver().get(Config.getProperty("BriteERPUrl"));
//        loginPage.usernameInput.sendKeys(Config.getProperty("username"));
//        loginPage.passwordInput.sendKeys(Config.getProperty("password")+ Keys.ENTER);
//        Driver.getDriver().get(Config.getProperty("lostReasonsUrl"));
//    }

    @When("User enters {string} to the Search field")
    public void user_enters_to_the_Search_field(String string) {
        lead_lostReasons_page.searchInput.sendKeys("Too expensive" + Keys.ENTER);
    }

    @Then("User should be able to see {string} button available for click")
    public void user_should_be_able_to_see_button_available_for_click(String string) {
        Assert.assertTrue(lead_lostReasons_page.advancedSearch.isDisplayed());
    }

    @When("User clicks on {string} button")
    public void user_clicks_on_button(String string) {
        lead_lostReasons_page.advancedSearch.click();
    }

    @Then("New buttons {string}, {string} and {string} should appear under the Search field")
    public void new_buttons_and_should_appear_under_the_Search_field(String string, String string2, String string3) {
        Assert.assertTrue(lead_lostReasons_page.buttonsLine.isDisplayed());
    }

    @When("User is on Lost Reasons page")
    public void user_is_on_Lost_Reasons_page() {
    Driver.getDriver().get(Config.getProperty("lostReasonsUrl"));
    }

    @When("User check if {string} button is on the page and clicks")
    public void user_check_if_button_is_on_the_page_and_clicks(String string) {
    Assert.assertTrue(lead_lostReasons_page.actionBtn.isDisplayed());
    lead_lostReasons_page.actionBtn.click();
    }

    @Then("User should be able to see dropdown menu available for click")
    public void user_should_be_able_to_see_dropdown_menu_available_for_click() {
        Assert.assertTrue(lead_lostReasons_page.actionDropdownMenu.getText().contains(Config.getProperty("lostReasonsActionDropdown1")));
        Assert.assertTrue(lead_lostReasons_page.actionDropdownMenu.getText().contains(Config.getProperty("lostReasonsActionDropdown2")));
        Assert.assertTrue(lead_lostReasons_page.actionDropdownMenu.getText().contains(Config.getProperty("lostReasonsActionDropdown3")));
        Assert.assertTrue(lead_lostReasons_page.actionDropdownMenu.getText().contains(Config.getProperty("lostReasonsActionDropdown4")));
    }

    @Then("User finds {string} button and clicks it")
    public void user_finds_button_and_clicks_it(String string) {
    Assert.assertTrue(lead_lostReasons_page.createBtn.isDisplayed());
    lead_lostReasons_page.createBtn.click();
    }

    @Then("User enters any new name in {string} field and clicks Save")
    public void user_enters_any_new_name_in_field_and_clicks_Save(String string) {
    lead_lostReasons_page.nameLine.sendKeys("Sevim abla");
    lead_lostReasons_page.saveBtn.click();
    }

}