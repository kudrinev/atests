package ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.springframework.util.Assert;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    private final static String BASE_URL = "https://formy-project.herokuapp.com/";
    private final static String WELCOME_MESSAGE = "Welcome to Formy";

    SelenideElement textWelcomeMessage = $x("//h1[@class='display-3']");


    public MainPage() {
        Selenide.open(BASE_URL);
    }

    public void checkWelcomeMessageIsVisible() {
        Assert.isTrue(textWelcomeMessage.isDisplayed(), "Сообщение не найдено на экране!");

    }

    public void checkWelcomeMessageText() {
       textWelcomeMessage.shouldBe(Condition.text(WELCOME_MESSAGE));
    }
}
