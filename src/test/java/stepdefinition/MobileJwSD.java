package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.mobilePages.HomeScreen;
import org.testng.Assert;

public class MobileJwSD {

    private HomeScreen homeScreen = new HomeScreen();

    @When("^I tap on continue button")
    public void clickOnContinueButton() throws InterruptedException {
        homeScreen.nextScreen();
    }

    @When("^I tap on menu button$")
    public void clickOnMenuButton() throws InterruptedException {
        Thread.sleep(30000);
        homeScreen.tapOnMenuButton();
    }

    @Then("^I verify sidebar menu is displayed$")
    public void verifySidebarMenu() {
        Assert.assertTrue(homeScreen.isSidebarMenuDisplayed(),"Sidebar menu not displayed");
    }
}
