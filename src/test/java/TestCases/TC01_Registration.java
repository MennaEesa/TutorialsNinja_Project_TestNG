package TestCases;

import Pages.P01_Registration;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.Utilities;

@Epic("Register Feature")
@Story("Register")
public class TC01_Registration extends TestBase{

    public static String firstName = faker.name().firstName();
    public static String lastName = faker.name().lastName();
    public static String phoneNumber = faker.number().digits(10);
    public static String USERNAME=Utilities.getData(System.getProperty("user.dir")+"/src/test/resources/data/logindata.json","username");
    public static String PASSWORD=Utilities.getData(System.getProperty("user.dir")+"/src/test/resources/data/logindata.json","password");


    @Test(priority = 1,description = "Register with valid data")
    @Description("Register with valid data")
    @Severity(SeverityLevel.CRITICAL)
    public void registerNewUser_P() throws InterruptedException {
        new P01_Registration(driver).clickMyAccount().openRegisterPage().enterFirstName(firstName).enterLastName(lastName)
                .enterPhone(phoneNumber).enterUsername(USERNAME).enterPassword(PASSWORD).enterConfirmPassword(PASSWORD).clickPolicy().clickRegisterButton();
        Utilities.captureScreenShot(driver,"Registration_P");
        //Assert on success message
        Assert.assertTrue(new P01_Registration(driver).checkSuccessMessage());
    }
}
