package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.CRMLandingPage;
import pages.HomePage;
import pages.LoginPage;
import pages.Pipeline_Pipeline_Page;

public class Pipeline_Pipeline_Steps {


    CRMLandingPage crmLandingPage = new CRMLandingPage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    Pipeline_Pipeline_Page pipeline_pipeline_page = new Pipeline_Pipeline_Page();

    @Given("User  on BriteERP  page")
    public void user_on_BriteERP_page() {

    }

    @When("User clicks on Crm module")
    public void user_clicks_on_Crm_module() {

    }

    @Then("User should be able to see create button")
    public void user_should_be_able_to_see_create_button() {
        Assert.assertTrue(pipeline_pipeline_page.createButton.isDisplayed());
    }

    @Given("User on CRM page")
    public void user_on_CRM_page() {

    }

    @When("Click on Create button")
    public void click_on_Create_button() {
        pipeline_pipeline_page.createButton.click();
    }

    @When("User fills all input boxes")
    public void user_fills_all_input_boxes() {

        pipeline_pipeline_page.opportunityTitleInputBox.sendKeys("abc");



    }

    @When("User clicks on create button")
    public void user_clicks_on_create_button() {
        pipeline_pipeline_page.createButtonWindowPage.click();
    }

    @Then("User should be able to see deal information under New column")
    public void user_should_be_able_to_see_deal_information_under_New_column() {
        Assert.assertTrue(pipeline_pipeline_page.createdDeal.isDisplayed());
    }

    @Then("User should be able to see searchBox")
    public void user_should_be_able_to_see_searchBox() {
        Assert.assertTrue(pipeline_pipeline_page.searchBox.isDisplayed());
    }

    @Then("User should be able to see myPipeline filter")
    public void user_should_be_able_to_see_myPipeline_filter() {
        Assert.assertTrue(pipeline_pipeline_page.pipelineFilter.isDisplayed());
    }

    @When("User navigates on search box")
    public void user_navigates_on_search_box() {



    }

    @When("User input {string} in search box")
    public void user_input_in_search_box(String string) {

        pipeline_pipeline_page.searchBox.sendKeys("ABC");
    }

    @When("User clicks on search button")
    public void user_clicks_on_search_button() {
        pipeline_pipeline_page.searchBox.click();
    }

    @Then("User should be able to see {string} information")
    public void user_should_be_able_to_see_information(String string) {

        Assert.assertTrue(pipeline_pipeline_page.serchBoxResult.isDisplayed());
    }






}


