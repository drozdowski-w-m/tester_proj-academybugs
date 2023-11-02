package TestyBdd.StepDefinitions;

import TestyBdd.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

    @Before
    public void beforeScenario(){
        DriverManager.startDriver();
    }
    @After
    public void afterScernario(){
        DriverManager.stopDriver();
    }
}
