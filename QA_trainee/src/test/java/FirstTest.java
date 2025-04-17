import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class FirstTest {
    private static WebDriver driver;
    private static WebDriverWait wait;
    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }
    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    // поменять название
    @Test
    public void testclickOnGameImageByAltTest() {
        try {
            // Локаторы
            By imageLocator = By.cssSelector("img[alt='Tarisland']");
            By h2Locator = By.xpath("//h2[contains(@class, 'ant-typography')]");

            // 1. Открываем сайт
            driver.navigate().to("https://makarovartem.github.io/frontend-avito-tech-test-assignment/");

            // 2. Ищем изображение с alt="Tarisland" и кликаем по нему
            WebElement image = wait.until(ExpectedConditions.elementToBeClickable(imageLocator));
            image.click();

            // 3. Ждём появления заголовка h2 в карточке игры
            WebElement gameTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(h2Locator));
            var expectedResult = "Tarisland";

            // 4. Проверка
            Assert.assertEquals("Заголовок в карточке не найден", expectedResult, gameTitle.getText());
            System.out.println("Заголовок карточки игры: " + gameTitle.getText());

        } catch (TimeoutException e) {
            Assert.fail("Элемент не найден или не кликабелен в течение 5 секунд: " + e.getMessage());
        } catch (Exception e) {
            Assert.fail("Ошибка во время теста: " + e.getMessage());
        }
    }

    @Test
    public void gameCardCountShouldBe10() {
        // Открываем сайт
        driver.get("https://makarovartem.github.io/frontend-avito-tech-test-assignment/");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("li.ant-list-item")));
        // Ищем только li-элементы с классом ant-list-item (это и есть карточки)
        var gameCards = driver.findElements(By.cssSelector("li.ant-list-item"));

        // Выводим количество карточек в консоль
        System.out.println("Количество карточек: " + gameCards.size());

        // Проверяем, что их 10
        Assert.assertEquals("Ожидалось 10 карточек на странице", 10, gameCards.size());
    }
}
