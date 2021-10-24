package co.com.sofka.stepdefinition.login;


import co.com.sofka.question.login.MessageValidationCredentialInvalid;
import co.com.sofka.question.login.MessageValidationCredentialEmpty;
import co.com.sofka.question.login.ValidationLoginSuccesful;
import co.com.sofka.stepdefinition.setup.SetUp;
import co.com.sofka.task.login.DoLogin;
import co.com.sofka.task.login.OnlyClick;
import co.com.sofka.task.login.OpenLandingPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LoginStepDefinition extends SetUp {

    private static final String ACTOR = "Tester";
    private DataTable UsingdataTable;

    @Given("el usuario ingresa a la pagina de OrangeHRM sección login")
    public void elUsuarioIngresaALaPaginaDeOrangeHRMSeccionLogin() {
        actorSetupTheBrowser(ACTOR);
        theActorInTheSpotlight().attemptsTo(
                new OpenLandingPage()
        );

    }

    @When("el usuario ingresa los datos de username y password")
    public void elUsuarioIngresaLosDatosDeUsernameYPassword(io.cucumber.datatable.DataTable dataTable) {
        UsingdataTable = dataTable;
        theActorInTheSpotlight().attemptsTo(
                new DoLogin()
                        .usingUsername(dataTable.row(0).get(1))
                        .usingPassword(dataTable.row(1).get(1))
        );
    }

    @Then("el sistema permite el login exitoso")
    public void elSistemaPermiteElLoginExitoso() {
        theActorInTheSpotlight().should(
                seeThat(
                        new ValidationLoginSuccesful()
                )
        );
    }

    @When("el usuario ingresa el username correcto y el password inválido")
    public void elUsuarioIngresaElUsernameCorrectoYElPasswordInvalido(io.cucumber.datatable.DataTable dataTable) {
        UsingdataTable = dataTable;
        theActorInTheSpotlight().attemptsTo(
                new DoLogin()
                        .usingUsername(dataTable.row(0).get(1))
                        .usingPassword(dataTable.row(1).get(1))
        );
    }

    @Then("el sistema no debe permitir el acceso y mostrar el mensaje de credenciales invalidas para password")
    public void elSistemaNoDebePermitirElAccesoYMostrarElMensajeDeCredencialesInvalidasParaPassword() {
        theActorInTheSpotlight().should(
                seeThat(
                        new MessageValidationCredentialInvalid()
                )
        );
    }

    @When("el usuario ingresa el username inválido y el password correcto")
    public void elUsuarioIngresaElUsernameInvalidoYElPasswordCorrecto(io.cucumber.datatable.DataTable dataTable) {
        UsingdataTable = dataTable;
        theActorInTheSpotlight().attemptsTo(
                new DoLogin()
                        .usingUsername(dataTable.row(0).get(1))
                        .usingPassword(dataTable.row(1).get(1))
        );
    }

    @Then("el sistema no debe permitir el acceso y mostrar el mensaje de credenciales invalidas para para usuario")
    public void elSistemaNoDebePermitirElAccesoYMostrarElMensajeDeCredencialesInvalidasParaParaUsuario() {
        theActorInTheSpotlight().should(
                seeThat(
                        new MessageValidationCredentialInvalid()
                )
        );
    }

    @When("el usuario deja los campos username y password vacíos")
    public void elUsuarioDejaLosCamposUsernameYPasswordVacios(io.cucumber.datatable.DataTable dataTable) {
        theActorInTheSpotlight().attemptsTo(
                new OnlyClick()
        );
    }

    @Then("el sistema no debe permitir el ingreso y debe arrojar el mensaje de campo vacío")
    public void elSistemaNoDebePermitirElIngresoYDebeArrojarElMensajeDeCampoVacio() {
        theActorInTheSpotlight().should(
                seeThat(
                        new MessageValidationCredentialEmpty()
                )
        );
    }
}
