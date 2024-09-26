package util;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;

public class Do_Login extends Open_URL {

    @BeforeClass
    public void doLoginPage()
    {
        Login login = new Login(driver);
        login.setTxtUsername("admin");
        login.setTxtPassword("admin");
        login.clickLogin();

    }
}
