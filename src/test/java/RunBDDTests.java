import io.cucumber.junit.*;
import org.junit.jupiter.api.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/features",
        plugin = {"pretty", "html:target/cucumber.html"}, monochrome = true,
        glue="",dryRun = false)
public class RunBDDTests {

    @Test
    public void Run(){ new RunBDDTests(); }

}
