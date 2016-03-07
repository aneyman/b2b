import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/***
 * Тест функциональности для входа в систему
 */
public class TestLogin {

    @Test
    public void testLogin() {
        WebDriver driver = new FirefoxDriver();
        LoginPage loginPage = new LoginPage(driver);
        User user = new User("111222999", "111111");
        HomePage homePage = loginPage.loginValidUser(user);
//        Assert.assertTrue(driver.e("compose button"),
//                "Войти не удалось");
    }
}