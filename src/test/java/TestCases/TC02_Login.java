package TestCases;

import Pages.P02_Login;
import org.testng.annotations.Test;
import utility.Utilities;

import static TestCases.TC01_Registration.*;

public class TC02_Login extends TestBase{

    @Test(priority = 1,description = "login with valid data")
    public void loginWithValidData_P() throws Exception {
        new P02_Login(driver).addUserName(USERNAME).addPassword(PASSWORD).clickLoginButton();
        //Capture screenshot
        Utilities.captureScreenShot(driver,"P_login");
        //assert login successfully
    }

}
