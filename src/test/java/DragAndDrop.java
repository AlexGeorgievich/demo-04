

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
    }

    @AfterAll
    static void AfterAll() {
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void dragAndDropTo() {

        open("/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
        $$("#column-a").shouldHave(texts("B"));
        $$("#column-b").shouldHave(texts("A"));

    }
}

