package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import states.timer.*;  // Importation des classes de timer comme IdleTimer, SetTimer, etc.
import states.Context;  // Importation de la classe Context qui gère l'état

public class StepDefinitions {

    private Context c;    // Le contrôleur principal
    private AbstractTimer timer;  // Le timer à tester

    // Initialisation du contrôleur et du timer
    public StepDefinitions() {
        c = new Context();  // Créer une instance du contrôleur
    }

    @Given("the timer is idle")
    public void the_timer_is_idle() {
        timer = IdleTimer.Instance();  // Initialiser le timer à l'état "idle"
        c.left();  // Simule un clic sur le bouton gauche pour l'état "idle"
    }

    @When("I check the button labels")
    public void i_check_the_button_labels() {
        // Met à jour l'interface après l'action en utilisant Context
        c.left();  // Simule une action sur le bouton gauche
    }

    @Then("the labels should be {string}, {string}, {string}")
    public void the_labels_should_be(String button1Text, String button2Text, String button3Text) {
        // Vérifie les textes des boutons
        assertEquals(button1Text, c.getLeftText());
        assertEquals(button2Text, c.getUpText());
        assertEquals(button3Text, c.getRightText());
    }

    @Then("the display text should be {string}")
    public void the_display_text_should_be(String expectedText) {
        // Vérifie le texte de l'affichage
        assertEquals(expectedText, c.getDisplayText());
    }

    @Given("the timer is in the Set Timer state")
    public void the_timer_is_in_the_Set_Timer_state() {
        // Simule un passage à l'état "SetTimer"
        c.right();  // Simule un clic sur le bouton droit
    }

    @When("I click the left button and then the up button")
    public void i_click_the_left_button_and_then_the_up_button() {
        c.left();  // Simule un clic sur le bouton gauche
        c.up();    // Simule un clic sur le bouton haut
    }
}