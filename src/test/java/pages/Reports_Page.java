package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.io.File;
import java.util.List;

public class Reports_Page{

    public Reports_Page(){
    PageFactory.initElements (Driver.getDriver (), this);

}
    @FindBy (xpath = "//div[@class = 'o_content']")
    public WebElement pipelineContent;

    @FindBy (xpath = "//div[@class = 'oe_view_nocontent']")
    public WebElement activitiesContent;

    @FindBy (xpath = "//div[@class='oe_view_nocontent']")
    public WebElement salesChannelsContent;

    @FindBy (xpath = "//a[@data-menu-xmlid='crm.crm_opportunity_report_menu']")
    public WebElement reportingPipeline;

    @FindBy (xpath = "//a[@data-menu-xmlid='crm.crm_activity_report_menu']")
    public WebElement reportingActivities;

    @FindBy (xpath = "//a[@data-menu-xmlid='crm.sales_team_menu_report_crm']")
    public WebElement reportingSaleChannels;

    @FindBy (xpath = "//button[@class='btn btn-primary btn-sm dropdown-toggle']")
    public WebElement buttonMeasures;

    @FindBy (xpath = "//ul[@class='dropdown-menu o_graph_measures_list']/li")
    public List<WebElement> listOfMeasures;

    @FindBy (xpath = "//button[@data-original-title='Pivot']")
    public WebElement pivotButton;

    @FindBy(xpath = "//button[@class='btn btn-default fa fa-download o_pivot_download']")
    public WebElement downloadButton;

    public static boolean isFileDownloaded(String downloadPath, String fileName) {
        boolean flag = false;
        File dir = new File(downloadPath);
        File[] dir_contents = dir.listFiles();

        for (int i = 0; i < dir_contents.length; i++) {
            if (dir_contents[i].getName().equals(fileName)) {
                System.out.println(dir_contents[i].getName() + " - This file was downloaded and will be automatically deleted");
                dir_contents[i].delete();
                return flag = true;
            }
        }

        return flag;
    }

}