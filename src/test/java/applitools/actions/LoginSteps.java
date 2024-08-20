package applitools.actions;

import applitools.pageobjects.LoginForm;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.screenplay.ensure.Ensure;

public class LoginSteps extends UIInteractionSteps {

    @Step("User logins")
    public void login() {
        find(LoginForm.USERNAME_INPUT).sendKeys("testuser");
        find(LoginForm.PASSWORD_INPUT).sendKeys("testpassword");
        find(LoginForm.LOGIN_BUTTON).click();
    }

    @Step("User got redirected")
    public void redirect() {
        Ensure.thatTheCurrentPage().currentUrl().isEqualTo("https://demo.applitools.com/hackathonAppV2.html");
    }

}
