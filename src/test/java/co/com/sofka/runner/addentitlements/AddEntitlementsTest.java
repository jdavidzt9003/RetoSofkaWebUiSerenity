package co.com.sofka.runner.addentitlements;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = {"src/test/resources/features/AddLeaveEntitlement.feature"},
        glue = {"co.com.sofka.stepdefinition.addentitlements"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AddEntitlementsTest {
}
