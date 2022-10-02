package ui;

import config.EnvConfig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import pages.AllDashboardsPage;
import pages.LoginPage;
import webdriver.Browser;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    @BeforeClass
    public void openDashboards(){
        open(EnvConfig.DEMO_REPORT_PORTAL_URL);
        getLoginPage().loginButton.click();
        getAllDashboardsPage().dashboardsButton.click();
    }

    @AfterClass
    public void quit(){
        Browser.closeDriver();
    }

    public LoginPage getLoginPage(){
        return new LoginPage(Browser.getWebDriver());
    }

    public AllDashboardsPage getAllDashboardsPage(){
        return new AllDashboardsPage(Browser.getWebDriver());
    }

}
