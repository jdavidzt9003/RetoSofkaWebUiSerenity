package co.com.sofka.task.login;

import co.com.sofka.userinterfaces.landingpage.LandingPageUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenLandingPage implements Task {

    LandingPageUserInterfaces landingPageUserInterfaces;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(landingPageUserInterfaces)
        );
    }
}
