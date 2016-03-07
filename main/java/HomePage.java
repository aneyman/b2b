import org.openqa.selenium.WebDriver;

/**
 * Инкапсуляция главой страницы "Page Object"
 */
public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        if (!driver.getCurrentUrl().equals("https://credito.igniteoutsourcing.com/#/get-loan")) {
            throw new IllegalStateException("Это не домашняя страница");
        }
    }

    public HomePage manageProfile() {
        // Инкапсуляция класса для работы с учетной записью пользователя
        return new HomePage(driver);
    }

        /*Другие методы, которые используются для
 описания функционала главной страницы для зарегестрированных пользователей. Такие методы
 в свою очередь тоже могут возвращать другие "Page Objects". Например клик на кнопку
 "Написать email", может возвращать объект
 класса ComposeMail (для написания email)
 */

}