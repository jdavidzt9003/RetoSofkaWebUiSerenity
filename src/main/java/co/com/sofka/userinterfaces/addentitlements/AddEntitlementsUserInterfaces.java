package co.com.sofka.userinterfaces.addentitlements;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddEntitlementsUserInterfaces extends PageObject {
    public static final Target LEAVE = Target
            .the("Leave")
            .located(By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]"));

    public static final Target ENTITLEMENTS = Target
            .the("Entitlements")
            .located(By.id("menu_leave_Entitlements"));

    public static final Target ADD_ENTITLEMENTS = Target
            .the("Add Entitlements")
            .located(By.xpath("//*[@id=\"menu_leave_addLeaveEntitlement\"]"));

    public static final Target EMPLOYEE = Target
            .the("Employee")
            .located(By.xpath("//*[@id=\"entitlements_employee_empName\"]"));

}
