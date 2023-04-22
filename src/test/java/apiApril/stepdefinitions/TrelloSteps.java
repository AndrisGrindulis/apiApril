package apiApril.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrelloSteps {

    @Given("The board exists and contains the correct information")
    public void getBoardDataAndCheckInfo(){
        System.out.println("one");
    }

    @When("I change the board title to {string}")
    public void iChangeTheBoardTitleTo(String title) {
        System.out.println("one");
    }

    @And("I check that the board name was updated to {string}")
    public void iCheckThatTheBoardNameWasUpdatedTo(String title) {
        System.out.println("one");
    }

    @Then("I add a list with a name {string} to the board")
    public void iAddAListWithANameToTheBoard(String listName) {
        System.out.println("one");
    }
}
