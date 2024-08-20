package applitools.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class FinancialOverview extends PageObject {
    public static final By TRANSACTION_ROWS = By.cssSelector("tbody tr");
    public static final By TRANSACTION_TABLE = By.id("transactionsTable");
    public static final By CREDIT_AVAILABLE = By.cssSelector("#creditAvailable .balance-value");
    public static final By TOTAL_BALANCE = By.cssSelector("#totalBalance .balance-value span");
    public static final By GREEN_TRANSACTIONS = By.className("text-success");
    public static final By RED_TRANSACTIONS = By.className("text-danger");
}
