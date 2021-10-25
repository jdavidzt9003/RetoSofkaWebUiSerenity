package co.com.sofka.task.project;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sofka.userinterfaces.projects.ProjectsUserInterfaces.*;


public class OpenProjects implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TIME),
                Click.on(PROJECT_INFO),
                Click.on(PROJECTS)
        );
    }
}
