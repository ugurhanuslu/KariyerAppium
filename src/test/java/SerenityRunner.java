import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/",
        glue = {"hooks", "steps"},
        stepNotifications = true,
        tags = "@login,@android,@test,@positive")


public class SerenityRunner {
}
