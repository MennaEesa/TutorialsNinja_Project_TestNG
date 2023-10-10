package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class P01_Registration {

    WebDriver driver;

    public P01_Registration(WebDriver driver)
    {
        this.driver=driver;
    }

    private final By myAccount = By.xpath("//a[@title=\"My Account\"]");
    private final By registerPage =By.xpath("//a[text() =\"Register\"]");
    private final By firstName = By.id("input-firstname");
    private final By lastName = By.id("input-lastname");
    private final By Phone = By.id("input-telephone");
    private final By email = By.id("input-email");
    private final By password = By.id("input-password");
    private final By confirmPassword = By.id("input-confirm");
    private final By Policy = By.name("agree");
    private final By registerButton = By.xpath("//input[@value=\"Continue\"]");
    private final By successMessage = By.xpath("//div[@class=\"col-sm-9\"]/h1");

    public P01_Registration clickMyAccount() {
        driver.findElement(myAccount).click();
        return this;
    }
    public P01_Registration openRegisterPage() {
        driver.findElement(registerPage).click();
        return this;
    }

    public P01_Registration enterFirstName(String firstName) {
        driver.findElement(this.firstName).sendKeys(firstName);
        return this;
    }

    public P01_Registration enterLastName(String lastName) {
        driver.findElement(this.lastName).sendKeys(lastName);
        return this;
    }

    public P01_Registration enterPhone(String phone) {
        driver.findElement(this.Phone).sendKeys(phone);
        return this;
    }


    public P01_Registration enterUsername(String username) {
        driver.findElement(this.email).sendKeys(username);
        return this;
    }

    public P01_Registration enterPassword(String password) {
        driver.findElement(this.password).sendKeys(password);
        return this;
    }

    public P01_Registration enterConfirmPassword(String confirmPassword) {
        driver.findElement(this.confirmPassword).sendKeys(confirmPassword);
        return this;
    }

    public P01_Registration clickPolicy() {
        driver.findElement(Policy).click();
        return this;
    }

    public By clickRegisterButton() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(registerButton).click();
        return registerButton;
    }

    public boolean checkSuccessMessage()
    {
        return driver.findElement(successMessage).getText().equals("Your Account Has Been Created!");
    }

}
