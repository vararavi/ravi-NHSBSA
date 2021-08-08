import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Cucumber.class)
@CucumberOptions(tags= "@nhs", plugin = {"pretty", "html:target/reports/html",
        "json:target/cucumber.json", "usage:target/usage.jsonx",
        "junit:target/junit.xml"}, snippets = SnippetType.CAMELCASE)
public class TestRunner {
}

