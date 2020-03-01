package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Pipeline_Quotations_Page{

    public Pipeline_Quotations_Page(){
        PageFactory.initElements (Driver.getDriver (), this);

    }
    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;

    @FindBy (xpath = "//span[@class='o_searchview_more fa fa-search-minus']")
    public WebElement searchButton;

    @FindBy (xpath = "//a[@data-menu-xmlid='sale_crm.sale_order_menu_quotations_crm']")
    public WebElement quotationsLink;

}

