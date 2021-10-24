package co.com.sofka.userinterfaces.login;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


import static org.openqa.selenium.By.id;


public class LoginUserInterfaces extends PageObject {
    public static final Target USERNAME = Target
            .the("Username")
            .located(id("txtUsername"));

    public static final Target PASSWORD = Target
            .the("Password")
            .located(id("txtPassword"));

    public static final Target BTN_LOGIN = Target
            .the("Boton Login")
            .located(id("btnLogin"));

    //Validation
    public static final Target MSJ_CREDENTIAL_INVALID = Target
            .the("Mensaje Validación credenciales invalidas")
            .located(id("spanMessage"));

    public static final Target VALIDATE_LOGIN_SUCCESFUL = Target
            .the("Login Exitoso")
            .located(id("welcome"));
}
