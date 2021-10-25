package co.com.sofka.stepdefinition.addentitlements;

import co.com.sofka.question.login.ValidationLoginSuccesful;
import co.com.sofka.stepdefinition.setup.SetUp;
import co.com.sofka.task.addentitlements.FillFormAddLeaveEntitlements;
import co.com.sofka.task.addentitlements.OpenAddEntitlements;
import co.com.sofka.task.login.DoLogin;
import co.com.sofka.task.login.OpenLandingPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddEntitlementsStepDefinition extends SetUp {

    private static final String ACTOR = "Tester";
    private DataTable dataTableUse;

    @Given("el automatizador inicia sesión se dirige al modulo leave")
    public void elAutomatizadorIniciaSesionSeDirigeAlModuloLeave(io.cucumber.datatable.DataTable dataTable) {
        dataTableUse = dataTable;
        actorSetupTheBrowser(ACTOR);
        theActorInTheSpotlight().attemptsTo(
                new OpenLandingPage(),
                new DoLogin()
                        .usingUsername(dataTable.row(0).get(1))
                        .usingPassword(dataTable.row(1).get(1))
        );

        theActorInTheSpotlight().should(
                seeThat(
                        new ValidationLoginSuccesful()
                )
        );
    }

    @Then("el usuario diligencia el formulario para la programación de las vacaciones")
    public void elUsuarioDiligenciaElFormularioParaLaProgramacionDeLasVacaciones(io.cucumber.datatable.DataTable dataTable) {
        dataTableUse = dataTable;
        theActorInTheSpotlight().attemptsTo(
                new OpenAddEntitlements(),
                new FillFormAddLeaveEntitlements()
                        .usingEmployee(dataTable.row(0).get(1))
                        .usingEntitlement(dataTable.row(1).get(1))
        );
    }

    @When("el sistema arroja que se ha agregado el empleado al periodo de vacaciones")
    public void elSistemaArrojaQueSeHaAgregadoElEmpleadoAlPeriodoDeVacaciones() {

    }

}
