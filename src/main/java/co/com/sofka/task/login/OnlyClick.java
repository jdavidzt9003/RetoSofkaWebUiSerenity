package co.com.sofka.task.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.login.LoginUserInterfaces.BTN_LOGIN;

public class OnlyClick implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(
              Scroll.to(BTN_LOGIN),
              Click.on(BTN_LOGIN)
      );
    }
}
