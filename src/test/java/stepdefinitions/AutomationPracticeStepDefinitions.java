package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.PersonalInformation;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.*;
import utils.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AutomationPracticeStepDefinitions {

    @Before
    public void init() {
        setTheStage(OnlineCast.ofStandardActors());
    }

    @Given("^than ana wants to enter the page new experience$")
    public void thanAnaWantsToEnterThePageNewExperience() {
        theActorCalled("Ana");
        theActorInTheSpotlight().can(BrowseTheWeb.with(WebDriver.chrome()));
    }


    @When("^create account and search the T-shirt in the New Experience$")
    public void theSearchTheTshirtInTheNewExperience(List<PersonalInformation> personalInformation) {
        OnStage.theActorInTheSpotlight().attemptsTo(SingIn.ThePage(), SignUser.The(personalInformation), SearchTShirt.ThePage(), RegisterTShirt.The(), Address.The(),SendDress.The(),Pay.The());
    }

    @Then("^She finds the T-Shirt called Faded Short Sleeve T-shirts$")
    public void sheFindsTheDressCalledFadedShortSleeveTshirts(List<String> message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.tothe(message.get(1))));

    }
}
