package co.com.sofka.task.addentitlements;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.userinterfaces.addentitlements.AddEntitlementsUserInterfaces.*;

public class OpenAddEntitlements implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LEAVE),

                Click.on(ENTITLEMENTS),

                Click.on(ADD_ENTITLEMENTS)
        );
    }
}
