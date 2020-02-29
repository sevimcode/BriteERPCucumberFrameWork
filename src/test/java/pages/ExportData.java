package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ExportData {
    public ExportData(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.= 'Sales Channel']")
    public WebElement availableFieldsSalesChannel;

    @FindBy(xpath = "[class='btn btn-sm btn-default o_add_field']")
    public WebElement addForAvailableSalesChannel;

    @FindBy(xpath = "//span[.='Export To File']")
    public WebElement exportToFile;

    @FindBy(xpath = "(//input[@name=\"o_import_compat_name\"])[1]")
    public WebElement checkExportType;

    @FindBy(xpath = "//input[@value='csv']")
    public WebElement checkExportFormatsCSV;

    @FindBy(xpath = "(//option[.='Sales Channel'])[2]")
    public WebElement fieldsToExportSalesChannelText;



}
