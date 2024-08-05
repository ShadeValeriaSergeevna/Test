package org.example;

import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static org.example.SelenideElements.*;

public class SelenideTests {
    SelenideElements selenideElements = new SelenideElements();

    @Test
    public void doSmth() {
        Selenide.open(YANDEX_URL);
        SELENIDE_ELEMENT.setValue(SELENIUM_VALUE).pressEnter();

        selenideElements.element.shouldHave(text(SELENIUM_VALUE));
    }
}
