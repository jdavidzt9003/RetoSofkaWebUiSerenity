package co.com.sofka.task.project;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.projects.ProjectsUserInterfaces.*;

public class AddProjects implements Task {

    private String nameCustomer;
    private String descriptionCustomer;
    private String projectName;
    private String projectAdmin;
    private String projectAdmin2;
    private String descriptionProject;
    private String projectNameCopy;

    public AddProjects usingNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
        return this;
    }

    public AddProjects usingDescriptionCustomer(String descriptionCustomer) {
        this.descriptionCustomer = descriptionCustomer;
        return this;
    }

    public AddProjects usingProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public AddProjects usingProjectAdmin(String projectAdmin) {
        this.projectAdmin = projectAdmin;
        return this;
    }

    public AddProjects usingProjectAdmin2(String projectAdmin2) {
        this.projectAdmin2 = projectAdmin2;
        return this;
    }

    public AddProjects usingDescriptionProject(String descriptionProject) {
        this.descriptionProject = descriptionProject;
        return this;
    }

    public AddProjects usingProjectNameCopy(String projectNameCopy){
        this.projectNameCopy = projectNameCopy;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ADD),
                Click.on(ADD_CUSTOMER),

                Scroll.to(NAME_CUSTOMER),
                Enter.theValue(nameCustomer).into(NAME_CUSTOMER),

                Scroll.to(DESCRIPTION_CUSTOMER),
                Enter.theValue(descriptionCustomer).into(DESCRIPTION_CUSTOMER),

                Click.on(SAVE_ADD_CUSTOMER),

                Scroll.to(PROJECT_NAME),
                Enter.theValue(projectName).into(PROJECT_NAME),

                Scroll.to(PROJECT_ADMIN),
                Enter.theValue(projectAdmin).into(PROJECT_ADMIN),

                Click.on(ADD_ANOTHER),

                Scroll.to(PROJECT_ADMIN2),
                Enter.theValue(projectAdmin2).into(PROJECT_ADMIN2),

                Scroll.to(DESCRIPTION_PROJECT),
                Enter.theValue(descriptionProject).into(DESCRIPTION_PROJECT),

                Click.on(SAVE),

                Click.on(COPY),

                Enter.theValue(projectNameCopy).into(PROJECT_NAME_COPY),

                Click.on(COPY_ACTIVITY)
        );
    }
}
