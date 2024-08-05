package org.example;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SelenideElements {
    SelenideElement element = $x("(//span[@role='text']/b)[1]");

    static final String SELENIUM_VALUE = "Selenium";
    static final String YANDEX_URL = "https://ya.ru/";
    static final SelenideElement SELENIDE_ELEMENT = $x("//input[@name='text']");
}
