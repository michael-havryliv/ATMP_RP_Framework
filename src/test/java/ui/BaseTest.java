package ui;

import config.EnvConfig;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import pages.DashboardsPage;
import pages.LoginPage;
import webdriver.Browser;

import java.util.logging.Logger;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    @BeforeClass
    public void openDashboards(){
        open(EnvConfig.DEMO_REPORT_PORTAL_URL);
        LoginPage loginPage = page(LoginPage.class);
        loginPage.loginButton.click();
        DashboardsPage dashboardsPage = page(DashboardsPage.class);
        dashboardsPage.dashboardsButton.click();
    }

    @AfterClass
    public void quit(){
        Browser.closeDriver();
    }

}
