import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void loginTest()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.scriptinglogic.in/");

        Login login = new Login(driver);
        login.setTxtUsername("admin");
        login.setTxtPassword("admin");
        login.clickLogin();
    }
}
