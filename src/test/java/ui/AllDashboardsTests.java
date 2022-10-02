package ui;

import org.testng.annotations.Test;
import pages.AllDashboardsPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class AllDashboardsTests extends BaseTest{

    @Test
    public void checkAddNewDashboards(){
        getAllDashboardsPage().addNewDashboardButton.click();
    }

}
