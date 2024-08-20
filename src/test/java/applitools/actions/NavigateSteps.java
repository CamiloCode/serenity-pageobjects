package applitools.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import applitools.pageobjects.LoginForm;

public class NavigateSteps extends UIInteractionSteps {

    LoginForm loginForm;

    @Step("User opens the login page")
    public void opensTheHomePage() {
        loginForm.open();
    }
}
