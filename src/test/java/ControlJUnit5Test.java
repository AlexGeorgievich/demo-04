package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ControlJUnit5Test {

    @BeforeAll
    static void beforeAllTest() {
        Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
    }

    @AfterAll
    static void AfterAllTest() {
        Configuration.holdBrowserOpen = true;
    }
    @Test
    void FindSoftAssertionsTest() {
        open("/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-box").$(withText("more pages")).click();
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $(".markdown-body").$(byText("Using JUnit5 extend test class:"));

    }
}