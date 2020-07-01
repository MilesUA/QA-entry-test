import org.junit.Test;

public class LoginTest extends MainTest{

    String login = "tomsmith";
    String password = "SuperSecretPassword!";

    @Test
    public void validLogin(){

    page.openPage();
    page.goToLoginForm();
    page.enterTextInToLogin(login);
    page.enterTextInToPass(password);
    page.clickOnButtonLogin();

    }
}
