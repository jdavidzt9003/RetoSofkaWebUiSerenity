package co.com.sofka.stepdefinition.projects;

import co.com.sofka.question.login.ValidationLoginSuccesful;
import co.com.sofka.stepdefinition.setup.SetUp;
import co.com.sofka.task.login.DoLogin;
import co.com.sofka.task.login.OpenLandingPage;
import co.com.sofka.task.project.AddProjects;
import co.com.sofka.task.project.OpenProjects;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ProjectsStepDefinition extends SetUp {

    private static final String ACTOR = "Tester";
    private DataTable dataTableUse;

    @Given("el usuario esta en la página OrangeHRM modulo time project info")
    public void elUsuarioEstaEnLaPaginaOrangeHRMModuloTimeProjectInfo(io.cucumber.datatable.DataTable dataTable) {
        dataTableUse = dataTable;
        actorSetupTheBrowser(ACTOR);
        theActorInTheSpotlight().attemptsTo(
                new OpenLandingPage(),
                new DoLogin()
                        .usingUsername(dataTable.row(0).get(1))
                        .usingPassword(dataTable.row(1).get(1)),
                new OpenProjects()
        );

        theActorInTheSpotlight().should(
                seeThat(
                        new ValidationLoginSuccesful()
                )
        );

    }

    @When("agrega un nuevo proyecto haciendo la creación de un cliente e ingresando mínimo dos administradores de proyecto")
    public void agregaUnNuevoProyectoHaciendoLaCreacionDeUnClienteEIngresandoMinimoDosAdministradoresDeProyecto(io.cucumber.datatable.DataTable dataTable) {
    dataTableUse = dataTable;
    theActorInTheSpotlight().attemptsTo(
            new AddProjects()
                    .usingNameCustomer(dataTable.row(0).get(1))
                    .usingDescriptionCustomer(dataTable.row(1).get(1))
                    .usingProjectName(dataTable.row(2).get(1))
                    .usingProjectAdmin(dataTable.row(3).get(1))
                    .usingProjectAdmin2(dataTable.row(4).get(1))
                    .usingDescriptionProject(dataTable.row(5).get(1))
                    .usingProjectNameCopy(dataTable.row(6).get(1))
    );
    }

    @Then("el sistema deberá confirmar la creación del nuevo proyecto")
    public void elSistemaDeberaConfirmarLaCreacionDelNuevoProyecto() {

    }

}
