package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Config_SaleChannels_Page{

    public Config_SaleChannels_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='/web#menu_id=267&action=242']")
    public WebElement salesChannel;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement create;

    @FindBy(xpath = ("//div[@class='o_checkbox'])[5]"))
    public WebElement europeCheckBox;

    @FindBy(xpath = "(//button[@aria-expanded='false'])[2]")
    public WebElement actions;

    @FindBy(xpath = "//a[contains(text(),'Export')]")
    public WebElement export;

    @FindBy(xpath = "(//button[.='Add'])[2]")
    public WebElement addButton;









}


