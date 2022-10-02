package ui;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import pages.AllDashboardsPage;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class AllDashboardsTests extends BaseTest{

    private static final String DASHBOARD_NAME = "default_name";

    @Test
    public void checkAddNewDashboards(){
        getAllDashboardsPage().addNewDashboardButton.click();
        getAllDashboardsPage().enterDashboardNameInput.sendKeys(DASHBOARD_NAME);
        getAllDashboardsPage().addButton.click();
        getAllDashboardsPage().dashboardsButton.click();
        $(byText(DASHBOARD_NAME)).should(Condition.exist);
    }

}
