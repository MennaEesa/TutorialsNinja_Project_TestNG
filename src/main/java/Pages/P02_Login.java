package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_Login {
    //WebDriver
    //Constructor to initialize webdriver
    //Define locators using by
    //Define action methods

    WebDriver driver;

    public P02_Login(WebDriver driver)
    {
        this.driver=driver;
    }

    final private By USERNAME = By.xpath("");
    final private By PASSWORD = By.xpath("");
    final private By LOGIN_BUTTON = By.xpath("");

    public P02_Login addUserName(String username)
    {
        driver.findElement(this.USERNAME).sendKeys(username);
        return this;
    }
    public P02_Login addPassword(String password)
    {
        driver.findElement(this.PASSWORD).sendKeys(password);
        return this;
    }
    public P02_Login clickLoginButton()
    {
        driver.findElement(LOGIN_BUTTON).click();
        return this;
    }
}
