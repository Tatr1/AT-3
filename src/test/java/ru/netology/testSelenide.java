//package ru.netology;
//
//import com.codeborne.selenide.SelenideElement;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static com.codeborne.selenide.Condition.exactText;
//import static com.codeborne.selenide.Selenide.$;
//import static com.codeborne.selenide.Selenide.open;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class testSelenide {
//    WebDriver driver;
//
//    @BeforeAll
//    static void setupClass() {
//        WebDriverManager.chromedriver().setup();
//    }
//
//    @BeforeEach
//    void setupTest() {
//        driver = new ChromeDriver();
//    }
//
//    @AfterEach
//    void teardown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//
//    @Test
//    void shouldTestSendFormS2() {
//        open("http://localhost:9999");
//        SelenideElement form = $(".form");
//        form.$("[data-test-id=name] input").sendKeys("Петров-Водкин Кузьма");
//        form.$("[data-test-id=phone] input").sendKeys("+73222332222");
//        form.$("[class='checkbox__box']").click();
//        form.$("button").click();
//        $(".paragraph").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
//    }
//
//    @Test
//    void shouldNoValidName() {
//        open("http://localhost:9999");
//        SelenideElement form = $(".form");
//        form.$("[data-test-id=name] input").sendKeys("Foolish Man");
//        form.$("[data-test-id=phone] input").sendKeys("+7322233222");
//        form.$("button").click();
//        $("[data-test-id=name] .input__sub").shouldHave(exactText("Имя и Фамилия указаные неверно. Допустимы только русские буквы, пробелы и дефисы."));
//    }
//
//    @Test
//    void shouldNoValidPhone() {
//        open("http://localhost:9999");
//        SelenideElement form = $(".form");
//        form.$("[data-test-id=name] input").sendKeys("Иванов");
//        form.$("[data-test-id=phone] input").sendKeys("7322233222");
//        form.$("button").click();
//        $("[data-test-id=phone] .input__sub").shouldHave(exactText("Телефон указан неверно. Должно быть 11 цифр, например, +79012345678."));
//    }
//
////    @Test
////    void shouldNoValidCheckbox() {
////        open("http://localhost:9999");
////        SelenideElement form = $(".form");
////        form.$("[data-test-id=name] input").sendKeys("Иванов");
////        form.$("[data-test-id=phone] input").sendKeys("+73222332222");
////        form.$("button").click();
////        System.out.println($("class='checkbox__text'").getCssValue("color"));
////    }
//}
