package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menu{

    @FindBy(xpath = "//a[text()='Dashboard']")
    WebElement dash;

    @FindBy(xpath = "//a[text()='Sales']")
    WebElement sales;

    @FindBy(xpath = "//a[text()='Customers']")
    WebElement custmenu;

    @FindBy(xpath = "//a[text()='Purchase']")
    WebElement purchase;

    @FindBy(xpath = "//a[text()='Supplier']")
    WebElement supply;

    @FindBy(xpath = "//a[text()='Stocks / Products']")
    WebElement stocks;

    @FindBy(xpath = "//a[text()='Payments / Outstandings']")
    WebElement payment;

    @FindBy(xpath = "//a[text()='Reports']")
    WebElement reports;

    public Menu(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void dashboardMenu()
    {
        dash.click();
    }
    public void salesMenu()
    {
        sales.click();
    }
    public void customerMenu()
    {
        custmenu.click();
    }
    public void purchaseMenu()
    {
        purchase.click();
    }
    public void supplierMenu()
    {
        supply.click();
    }
    public void stocksMenu()
    {
        stocks.click();
    }
    public void paymentMenu()
    {
        payment.click();
    }
    public void reportsMenu()
    {
        reports.click();
    }


}
