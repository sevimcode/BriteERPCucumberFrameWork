package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Config_SaleChannels_Page{

    public Config_SaleChannels_Page(){
        PageFactory.initElements (Driver.getDriver (), this);

    }
    @FindBy(id = "")
    public WebElement searchBox;

    @FindBy (xpath = "")
    public WebElement searchButton;

}


