package Hooks;

import BaseDriver.DriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook
{
    @Before
    public void setup() {
        new DriverManager().openBrowser();
    }

    @After
    public void after() {
        new DriverManager().closeBrowser();
    }
}
