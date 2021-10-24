package co.com.sofka.question.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.sofka.userinterfaces.login.LoginUserInterfaces.MSJ_CREDENTIAL_INVALID;
import static co.com.sofka.util.ValidationMessages.CREDENTIAL_INVALID;

public class MessageValidationCredentialInvalid implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return (MSJ_CREDENTIAL_INVALID.resolveFor(actor).containsOnlyText(CREDENTIAL_INVALID.getValue()));
    }
}
