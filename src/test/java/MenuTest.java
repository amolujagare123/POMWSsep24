
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class MenuTest extends LoginTest{

    @AfterClass

    public void menuSelection()
    {

        Menu menu=new Menu(driver);
        menu.dashboardMenu();
        menu.salesMenu();
        menu.customerMenu();
        menu.purchaseMenu();
        menu.supplierMenu();
        menu.stocksMenu();
        menu.paymentMenu();
        menu.reportsMenu();
    }
}
