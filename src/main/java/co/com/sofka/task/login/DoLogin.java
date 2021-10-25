package co.com.sofka.task.login;

import co.com.sofka.userinterfaces.login.LoginUserInterfaces;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static co.com.sofka.userinterfaces.login.LoginUserInterfaces.*;

public class DoLogin implements Task {
    private String username;
    private String password;

    public DoLogin usingUsername(String username) {
        this.username = username;
        return this;
    }

    public DoLogin usingPassword(String password) {
        this.password = password;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Scroll.to(USERNAME),
                Enter.theValue(username).into(USERNAME),

                Scroll.to(PASSWORD),
                Enter.theValue(password).into(PASSWORD),

                Scroll.to(BTN_LOGIN),
                Click.on(BTN_LOGIN)
        );

    }
}
