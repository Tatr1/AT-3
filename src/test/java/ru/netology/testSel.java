//package ru.netology;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class testSel {
//    private WebDriver driver;
//
//
////    @BeforeAll
////    static void setUpAll() {
////        System.setProperty("webdriver.chrome.driver", "driver/win/chromedriver.exe");
////    }
////
////    @BeforeEach
////    void setUp() {
////        driver = new ChromeDriver();
////    }
//
//    @BeforeAll
//    static void setupClass() {
//        WebDriverManager.chromedriver().setup();
//    }    @BeforeEach
//    void setupTest() {
//        driver = new ChromeDriver();
//    }
//
//    @AfterEach
//    void tearDown() {
//        driver.quit();
//        driver = null;
//    }
//
//    @Test
//    void shouldTestS3() {
//        driver.get("http://localhost:9999");
//        driver.findElement(By.cssSelector("[data-test-id=name] input")).sendKeys("Петров-Водкин Кузьма");
//        driver.findElement(By.cssSelector("[data-test-id=phone] input")).sendKeys("+73222332222");
//        driver.findElement(By.cssSelector("[class='checkbox__box']")).click();
//        driver.findElement(By.cssSelector("button")).click();
//        String text = driver.findElement(By.cssSelector(".paragraph")).getText();
//        assertEquals("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.", text.trim());
//    }
//}
