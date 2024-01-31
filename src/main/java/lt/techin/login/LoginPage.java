package lt.techin.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = "input[name='username']")
    WebElement inputUserName;

    @FindBy(css = "input[name='password']")
    WebElement inputPassword;

    @FindBy(css = ".orangehrm-login-button")
    WebElement inputLogin;

    @FindBy(css = ".oxd-topbar-header-breadcrumb-module")
    WebElement userAccount;

    @FindBy(css = ".oxd-alert-content-text")
    WebElement errorLogin;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setUserName(String username) {
        inputUserName.sendKeys(username);
    }

    public void setPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void clickInputLogin() {
        inputLogin.click();
    }
    public String viewUserAccount() {
        return userAccount.getText();
    }
    public String viewErrorLogin() {
        return errorLogin.getText();
    }
}
