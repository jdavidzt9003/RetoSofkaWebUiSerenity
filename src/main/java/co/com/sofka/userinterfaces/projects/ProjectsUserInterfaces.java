package co.com.sofka.userinterfaces.projects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProjectsUserInterfaces extends PageObject {

    public static final Target TIME = Target
            .the("Time")
            .located(By.id("menu_time_viewTimeModule"));

    public static final Target PROJECT_INFO = Target
            .the("Project Info")
            .located(By.id("menu_admin_ProjectInfo"));

    public static final Target PROJECTS = Target
            .the("Projects")
            .located(By.id("menu_admin_viewProjects"));

    public static final Target ADD = Target
            .the("Add")
            .located(By.id("btnAdd"));

    public static final Target ADD_CUSTOMER = Target
            .the("Add customer")
            .located(By.id("addCustomerLink"));

    public static final Target NAME_CUSTOMER = Target
            .the("Name customer")
            .located(By.id("addCustomer_customerName"));

    public static final Target DESCRIPTION_CUSTOMER = Target
            .the("Customer Description")
            .located(By.id("addCustomer_description"));

    public static final Target SAVE_ADD_CUSTOMER = Target
            .the("Save customer")
            .located(By.id("dialogSave"));

    public static final Target PROJECT_NAME = Target
            .the("Project name")
            .located(By.id("addProject_projectName"));

    public static final Target PROJECT_ADMIN = Target
            .the("Project Admin")
            .located(By.id("addProject_projectAdmin_1"));

    public static final Target ADD_ANOTHER = Target
            .the("Add another")
            .located(By.id("addButton"));

    public static final Target PROJECT_ADMIN2 = Target
            .the("Project Admin2")
            .located(By.id("addProject_projectAdmin_2"));

    public static final Target DESCRIPTION_PROJECT = Target
            .the("Description project")
            .located(By.id("addProject_description"));

    public static final Target SAVE = Target
            .the("Save project")
            .located(By.id("btnSave"));

    public static final Target COPY = Target
            .the("Copy")
            .located(By.id("btnCopy"));


    public static final Target PROJECT_NAME_COPY = Target
            .the("Project name copy")
            .located(By.xpath("//*[@id=\"projectName\"]"));

    public static final Target COPY_ACTIVITY = Target
            .the("Project name copy activity")
            .located(By.id("btnCopyDig"));

}
