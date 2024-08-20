package applitools.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import applitools.actions.FinancialOverviewSteps;
import net.serenitybdd.annotations.Steps;
import applitools.actions.NavigateSteps;
import applitools.actions.LoginSteps;

import static org.assertj.core.api.Assertions.assertThat;

public class FinancialStepDefinitions {

    @Steps
    NavigateSteps navigate;

    @Steps
    LoginSteps login;

    @Steps
    FinancialOverviewSteps financialOverview;

    @Given("^(?:.*) is an user in the application")
    public void open_page() {
        navigate.opensTheHomePage();
    }

    @When("^(?:.*) wants to see his financial overview")
    public void go_to_financial_overview() {
        login.login();
        login.redirect();
    }

    @Then("^(?:.*) should see all the information correctly")
    public void should_see_information_correctly() {
       financialOverview.check_number_of_transactions();
       financialOverview.check_total_balance();
       financialOverview.check_credit_available();
       financialOverview.check_transaction_sign();
    }
}
