package applitools.pageobjects;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.applitools.com/hackathonV2.html")
public class LoginForm extends PageObject {
    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON =  By.id("log-in");
}
