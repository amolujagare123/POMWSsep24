import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class LoginTest {

   public WebDriver driver;

    @BeforeClass
    public void pageLoad()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");
    }
    @Test
    public void loginTest()
    {
        Login login = new Login(driver);
        login.setTxtUsername("admin");
        login.setTxtPassword("admin");
        login.clickLogin();
    }
}
