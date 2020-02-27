package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage{
    public LoginPage(){
        PageFactory.initElements (Driver.getDriver (), this);

    }
    @FindBy(name = "login")
    public WebElement usernameInput;

    @FindBy (name = "password")
    public WebElement passwordInput;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy (xpath = "//p[contains(text(),'Wrong login/password' )]")

    public WebElement errorMessage;


}
