package ui;

import org.junit.jupiter.api.Test;

public class MainPageTest {

    @Test
    public void openMainPage() {
        MainPage mainPage = new MainPage();
        mainPage.checkWelcomeMessageIsVisible();
    }

    @Test
    public void checkWelcomeMessage() {
        MainPage mainPage = new MainPage();
        mainPage.checkWelcomeMessageText();
    }

}
