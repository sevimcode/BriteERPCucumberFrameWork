package step_definitions;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import pages.Reports_Page;
import utilities.SeleniumUtils;

public class Reports_Steps{
    HomePage homePage = new HomePage();
    Reports_Page reportsPage = new Reports_Page();

    @Then("Click on CRM module")
    public void click_on_CRM_module() {
        SeleniumUtils.pause(2);
        homePage.CRMmodule.click();
    }

    @Then("Click on Pipeline under Reporting section")
    public void click_on_Pipeline_under_Reporting_section() {
        reportsPage.reportingPipeline.click();
    }

    @Then("User should see pipeline report or message that report is not available")
    public void user_should_see_pipeline_report_or_message_that_report_is_not_available() {
        Assert.assertTrue(reportsPage.pipelineContent.isDisplayed());

    }

    @Then("Click on Activities under Reporting section")
    public void click_on_Activities_under_Reporting_section() {
        reportsPage.reportingActivities.click();
    }

    @Then("User should see activities report or message that report is not available")
    public void user_should_see_activities_report_or_message_that_report_is_not_available() {
        Assert.assertTrue(reportsPage.activitiesContent.isDisplayed());

    }

    @Then("Click on Sales Channels under Reporting section")
    public void click_on_Sales_Channels_under_Reporting_section() {
       reportsPage.reportingSaleChannels.click();
    }

    @Then("User should see sales channels report or message that report is not available")
    public void user_should_see_sales_channels_report_or_message_that_report_is_not_available() {
        Assert.assertTrue(reportsPage.salesChannelsContent.isDisplayed());
    }


}


