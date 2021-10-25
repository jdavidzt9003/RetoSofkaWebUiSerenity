package co.com.sofka.runner.projects;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = {"src/test/resources/features/Projects.feature"},
        glue = {"co.com.sofka.stepdefinition.projects"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ProjectsTest {
}
