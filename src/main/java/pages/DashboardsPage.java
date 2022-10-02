package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DashboardsPage extends BasePage{

    public SelenideElement dashboardsButton = $(byXpath("//span[span[contains(text(),'Dashboards')]]"));

    public DashboardsPage(WebDriver driver) {
        super(driver);
    }


}
