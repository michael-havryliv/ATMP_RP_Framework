package ui;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SampleUITests extends BaseTest{

    @Test
    public void test(){
        $(".message").shouldHave(text("Hello"));
    }

}
