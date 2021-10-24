package co.com.sofka.question.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.login.LoginUserInterfaces.VALIDATE_LOGIN_SUCCESFUL;
import static co.com.sofka.util.ValidationMessages.LOGIN_OK;

public class ValidationLoginSuccesful implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return (VALIDATE_LOGIN_SUCCESFUL.resolveFor(actor).containsText(LOGIN_OK.getValue()));
    }
}
