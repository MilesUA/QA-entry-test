import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class Page {

    WebDriver webDriver;

    public Page(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }


    @FindBy(name="username")
    private WebElement inputLogin;
    @FindBy(name="password")
    private WebElement inputPassword;
    @FindBy(xpath=".//a[@href='/login']")
    private WebElement loginForm;
    @FindBy(xpath=".//*[@type='submit']")
    private WebElement loginButton;



    public void openPage() {
        try {
            webDriver.get("http://the-internet.herokuapp.com/");

        } catch (Exception e) {

            Assert.fail("Can not open Page");
        }
    }

    public void goToLoginForm() {
        try {
            loginForm.click();

        } catch (Exception e) {

            Assert.fail("element is not displayed");
        }
    }

    public void enterTextInToLogin(String login) {
        inputLogin.sendKeys(login);

    }

    public void enterTextInToPass(String password) {
        inputPassword.sendKeys(password);

    }

    public void clickOnButtonLogin() {
        try {
            loginButton.click();

        } catch (Exception e) {

            Assert.fail("Can not work with element");
        }
    }

}

