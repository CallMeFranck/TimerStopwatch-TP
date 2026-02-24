package gui;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/TestScenarios.feature", // Chemin vers ton fichier .feature
        glue = "stepdefinitions", // Package contenant les Step Definitions
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html"} // Génère un rapport HTML des tests
)
public class TestScenarios {
    // Cette classe est utilisée uniquement pour exécuter les tests Cucumber avec JUnit
}