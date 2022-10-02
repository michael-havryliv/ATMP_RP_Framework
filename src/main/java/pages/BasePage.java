package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    private static WebDriver webDriver;

    public BasePage(WebDriver driver){
        webDriver = driver;
//        PageFactory.initElements(webDriver,this);
    }
}
