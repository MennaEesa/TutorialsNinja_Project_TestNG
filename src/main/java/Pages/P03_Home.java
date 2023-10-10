package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_Home {
    WebDriver driver;

    public P03_Home(WebDriver driver)
    {
        this.driver=driver;
    }

    final private By USERPROFILE = By.xpath("");


    public boolean checkHomePage()
    {
        return driver.findElement(USERPROFILE).getText().equals("");
    }
}
