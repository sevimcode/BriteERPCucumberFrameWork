package step_definitions;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.CRMLandingPage;
import utilities.SeleniumUtils;

public class CRMLandingPage_Steps{
    CRMLandingPage crmLandingPage = new CRMLandingPage ();

    @Then("User should be able to see Pipeline_Pipeline on the menu")
    public void userShouldBeAbleToSeePipeline_PipelineOnTheMenu() {
        SeleniumUtils.pause (3);
       Assert.assertTrue (crmLandingPage.PipelinePipeline.isDisplayed ());

    }

    @Then("User should be able to see Pipeline_Quotation on the menu")
    public void userShouldBeAbleToSeePipeline_QuotationOnTheMenu() {
        SeleniumUtils.pause (3);
        Assert.assertTrue (crmLandingPage.PipelineQuotations.isDisplayed ());
    }

    @Then("User should be able to see Config Activity Types on the menu")
    public void userShouldBeAbleToSeeConfigActivityTypesOnTheMenu() {
        SeleniumUtils.pause (3);
        Assert.assertTrue (crmLandingPage.ConfigActivitytypes.isDisplayed ());
    }

    @Then("User should be able to see Config Sale Channels on the menu")
    public void userShouldBeAbleToSeeConfigSaleChannelsOnTheMenu() {
        SeleniumUtils.pause (3);
        Assert.assertTrue (crmLandingPage.ConfigSaleChannels.isDisplayed ());
    }

    @Then("User should be able to see Lead Oportunities on the menu")
    public void userShouldBeAbleToSeeLeadOportunitiesOnTheMenu() {
        SeleniumUtils.pause (3);
        Assert.assertTrue (crmLandingPage.LeadOportunities.isDisplayed ());
    }

    @Then("User should be able to see Lead Tags on the menu")
    public void userShouldBeAbleToSeeLeadTagsOnTheMenu() {
        SeleniumUtils.pause (3);
        crmLandingPage.LeadOportunities.click ();
        Assert.assertTrue (crmLandingPage.LeadOpotunitiesLeadTags.isDisplayed ());
    }

//    @Then("User should be able to see Lost Reasons on the menu")
//    public void userShouldBeAbleToSeeLostReasonsOnTheMenu() {
//      SeleniumUtils.pause (3);
//        Assert.assertTrue (crmLandingPage.LeadOpotunitiesLostReasons.isDisplayed ());
//    }

    @Then("User should be able to see Report Pipeline on the menu")
    public void userShouldBeAbleToSeeReportPipelineOnTheMenu() {
        SeleniumUtils.pause (3);
        Assert.assertTrue (crmLandingPage.reportingPipeline.isDisplayed ());
    }

    @Then("User should be able to see Report Activity on the menu")
    public void userShouldBeAbleToSeeReportActivityOnTheMenu() {
        SeleniumUtils.pause (3);
        Assert.assertTrue (crmLandingPage.reportingActivities.isDisplayed ());
    }

    @Then("User should be able to see Report Sale Channels on the menu")
    public void userShouldBeAbleToSeeReportSaleChannelsOnTheMenu() {
        SeleniumUtils.pause (3);
        Assert.assertTrue (crmLandingPage.reportingSaleChannels.isDisplayed ());
    }
}

