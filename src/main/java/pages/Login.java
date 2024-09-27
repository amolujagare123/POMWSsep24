package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {

    /*WebDriver driver;
    WebElement element = driver.findElement(By.id("login-username"));*/

    @FindBy (id = "login-username")
    WebElement txtUsername;

    @FindBy (id = "login-password")
    WebElement txtPassword;

    @FindBy (name = "submit")
    WebElement btnLogin;

    public Login(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    public void setTxtUsername(String username)
    {
        txtUsername.sendKeys(username);
    }

    public void setTxtPassword(String password)
    {
        txtPassword.sendKeys(password);
    }

    public void clickLogin()
    {
        btnLogin.click();
    }


}
