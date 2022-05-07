package stepDefinitions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.Command;
import pageObjects.HomePage;

public class UserJournetSteps extends CommonFunctions {
    HomePage homePage = new HomePage(driver);
    @Given("I am on home page {string}")
    public void i_am_on_home_page(String url) {
        driver.get(url);
    }
    @When("I enter search term {string}")
    public void i_enter_search_term(String searchterm) {
        homePage.enterSearchTerm(searchterm);
    }
    @When("I click on search button")
    public void i_click_on_search_button() {
        homePage.clickSearchButton();
    }

    @When("I click on printed dress Image")
    public void i_click_on_printed_dress_image() {
        homePage.clickOnImg();
    }

}
