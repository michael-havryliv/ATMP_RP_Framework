package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class AllDashboardsPage extends BasePage{

    public SelenideElement dashboardsButton = $(byXpath("//span[span[contains(text(),'Dashboards')]]"));

    public SelenideElement addNewDashboardButton = $(byText("Add New Dashboard"));

    public AllDashboardsPage(WebDriver driver) {
        super(driver);
    }


}
