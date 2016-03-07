
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.concurrent.TimeUnit;

/**
 * Инкапсуляция страницы входа "Page Object"
 */
public class LoginPage {

    WebDriver driver;

   WebElement loginField = driver.findElement(By.xpath((".//*[@id='email']")));
    WebElement passwordField = driver.findElement(By.xpath((".//*[@id='password']")));
   WebElement loginButton = driver.findElement(By.xpath(".//*[@id='login']/form/div[3]/button"));

   String loginPageUrl = "https://credito.igniteoutsourcing.com/";

    public LoginPage( WebDriver driver) {
        this.driver = driver;
        if(!driver.getTitle().equals("Sign in page")) {
            throw new IllegalStateException("Это не страница входа");
        }
    }

    /**
//     * Войти как пользователь системы
//     *
//     * @param userName
//     * @param password
//     * @return HomePage object
//     */
    public HomePage loginValidUser(User user) {

        driver.get(loginPageUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement((By) loginField).sendKeys(user.login);
        driver.findElement((By) passwordField).sendKeys(user.password);
        driver.findElement((By) loginButton).click();
        return new HomePage(driver);
    }


}