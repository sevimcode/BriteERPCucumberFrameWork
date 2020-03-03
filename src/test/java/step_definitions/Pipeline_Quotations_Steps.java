package step_definitions;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.LoginPage;
import pages.Pipeline_Quotations_Page;
import utilities.Driver;
import utilities.SeleniumUtils;

public class Pipeline_Quotations_Steps {
    LoginPage loginPage = new LoginPage ();
    HomePage homePage = new HomePage ();
    Pipeline_Quotations_Page pipeline_quotations_page = new Pipeline_Quotations_Page();



    @Then("user should be able to see the CRM module Landing page")
    public void user_should_be_able_to_see_the_CRM_module_Landing_page() {
    String expectedTitle = "Pipeline - Odoo";
       // SeleniumUtils.pause(2);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleIs(expectedTitle));

    String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("User clicks on quotations")
    public void user_clicks_on_quotations() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(pipeline_quotations_page.quotationsLink));
        pipeline_quotations_page.quotationsLink.click();
    }

    @Then("User should be ble to see pipeline quotations page")
    public void user_should_be_ble_to_see_pipeline_quotations_page() {
    String expectedTitle="Quotations - Odoo";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleIs(expectedTitle));
    String actualTitle=Driver.getDriver().getTitle();

    Assert.assertEquals(expectedTitle,actualTitle);
    }

}


