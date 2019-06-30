package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Gia Pachkhatashvili
 */
public class LoginSD {

    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {

    }

    @When("^I enter (.+) into (username|password|firstname|lastname|mobile number|new password) text fields on home screen$")
    public void enterDataIntoTextFields(String value, String textFields) {

        switch (textFields) {
            case "username":
                //Method enterEmail(value);
                break;
            case "password":
                //Method enterPassword(value);
                break;
            case "firstname":
                //Method enterFirstName(value);
                break;
            case "lastname":
                //Method enterLastName(value);
                break;
            case "mobile number":
                //Method enterMobileNumber(value);
                break;
            case "new password":
                //Method enterNewPassword(value);
                break;
        }
    }

    @When("^I click on (login|submit) button on home screen$")
    public void clickOnLoginButton(String button) {

        switch (button) {
            case "login":
                //Method clickOnLoginButton();
                break;
            case "submit":
                //Implement Create account object
                break;
        }
    }


    @Then("^I verify that i am on invalid login page$")
    public void verifyInvalidLoginPage() {
        //Method Assert.assertEquals();
    }

}
