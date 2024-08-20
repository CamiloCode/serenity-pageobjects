package applitools.actions;

import applitools.pageobjects.FinancialOverview;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;

import java.time.Duration;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class FinancialOverviewSteps extends UIInteractionSteps {

    @Step("Verify number of transactions")
    public void check_number_of_transactions() {
        withTimeoutOf(Duration.ofSeconds(10))
                .waitFor(presenceOfElementLocated(FinancialOverview.TRANSACTION_TABLE));
        assertThat(findAll(FinancialOverview.TRANSACTION_ROWS).size(), equalTo(6));
    }

    @Step("Verify total balance")
    public void check_total_balance() {
        withTimeoutOf(Duration.ofSeconds(10))
                .waitFor(presenceOfElementLocated(FinancialOverview.TOTAL_BALANCE));
        assertThat(find(FinancialOverview.TOTAL_BALANCE).getTextContent(), equalTo("$350"));
    }

    @Step("Verify credit available")
    public void check_credit_available() {
        withTimeoutOf(Duration.ofSeconds(10))
                .waitFor(presenceOfElementLocated(FinancialOverview.CREDIT_AVAILABLE));
        assertThat(find(FinancialOverview.CREDIT_AVAILABLE).getText(), equalTo("$17,800"));
    }

    @Step("Verify positive and negative transactions")
    public void check_transaction_sign() {
        withTimeoutOf(Duration.ofSeconds(10))
                .waitFor(presenceOfElementLocated(FinancialOverview.TRANSACTION_TABLE));
        assertThat(findAll(FinancialOverview.GREEN_TRANSACTIONS).stream().allMatch(s -> s.containsText("+")), equalTo(true));
        assertThat(findAll(FinancialOverview.GREEN_TRANSACTIONS).stream().allMatch(s -> s.getCssValue("color").equals("rgba(36, 179, 20, 1)")), equalTo(true));
        assertThat(findAll(FinancialOverview.RED_TRANSACTIONS).stream().allMatch(s -> s.containsText("-")), equalTo(true));
        assertThat(findAll(FinancialOverview.RED_TRANSACTIONS).stream().allMatch(s -> s.getCssValue("color").equals("rgba(230, 82, 82, 1)")), equalTo(true));
    }

}
