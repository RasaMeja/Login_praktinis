package lt.techin.login;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest{

    LoginPage loginPage;

    @Test
    void userLogin() {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("Admin");
        loginPage.setPassword("admin123");
        loginPage.clickInputLogin();
        Assertions.assertEquals("Dashboard", loginPage.viewUserAccount());
    }

    @Test
    void userLoginNegative() {
        loginPage = new LoginPage(driver);
        loginPage.setUserName("Adminas");
        loginPage.setPassword("admin12345");
        loginPage.clickInputLogin();
        Assertions.assertEquals("Invalid credentials", loginPage.viewErrorLogin());
    }

}
