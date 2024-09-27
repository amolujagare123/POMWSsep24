import org.testng.annotations.Test;
import pages.Menu;
import util.Do_Login;
import org.testng.annotations.AfterClass;

public class MenuTest extends Do_Login {
    @Test
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
