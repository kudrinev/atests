package ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUiTest {



    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/ui/chromedriver117.exe");
        WebDriver driver = new ChromeDriver();
        Configuration.browserSize = "1920x1080";
    }

    @BeforeEach
    public void init() {
        setUp();
    }

    @AfterEach
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }

}
