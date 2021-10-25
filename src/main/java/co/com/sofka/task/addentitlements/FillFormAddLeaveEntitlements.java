package co.com.sofka.task.addentitlements;

import co.com.sofka.userinterfaces.addentitlements.AddEntitlementsUserInterfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.sofka.userinterfaces.addentitlements.AddEntitlementsUserInterfaces.EMPLOYEE;
import static co.com.sofka.userinterfaces.addentitlements.AddEntitlementsUserInterfaces.ENTITLEMENTS;
import static co.com.sofka.userinterfaces.login.LoginUserInterfaces.*;
import static co.com.sofka.userinterfaces.login.LoginUserInterfaces.BTN_LOGIN;

public class FillFormAddLeaveEntitlements implements Task {
    private String Employee;
    private String Entitlement;


    public FillFormAddLeaveEntitlements usingEmployee(String Employee) {
        this.Employee = Employee;
        return this;
    }

    public FillFormAddLeaveEntitlements usingEntitlement(String Entitlement) {
        this.Entitlement = Entitlement;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(EMPLOYEE),
                Enter.theValue(Employee).into(EMPLOYEE),


                Enter.theValue(Entitlement).into(ENTITLEMENTS)
        );

    }
}
