package co.com.sofka.stepdefinition.setup;


import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class SetUp {

    @Managed()
    protected WebDriver driver;

    protected void setupBrowser(WebDriver driver){
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    protected void setupUser(String name, WebDriver driver){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(name).can(BrowseTheWeb.with(driver));
    }

    protected void actorSetupTheBrowser(String actorName){
        setupBrowser(driver);
        setupUser(actorName, driver);
    }
}
