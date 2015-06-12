import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import support.pages.CommercehubAboutPage;
import support.pages.CommercehubCareersPage;
import support.pages.CommercehubHomePage;

/**
 * Created by bmanley on 06/11/15.
 */
public class CommercehubCareersStepDefinitions {

    CommercehubHomePage homePage;
    CommercehubAboutPage aboutPage;
    CommercehubCareersPage careersPage;
    WebDriver driver;

    /*
        Givens
     */

    @Given("^I am at the CommerceHub home page$")
    public void I_am_at_the_CommerceHub_home_page() throws Throwable {
        driver = new FirefoxDriver();

        driver.get("http://www.commercehub.com");
        homePage = new CommercehubHomePage(driver);
    }


    /*
        Whens
     */

    @When("^I click the Company link on the navigation bar$")
    public void i_click_the_Company_link_on_the_navigation_bar() throws Throwable {
        aboutPage = homePage.clickCompanyLink();
    }

    @When("^I click the Careers link$")
    public void i_click_the_Careers_link() throws Throwable {
        careersPage = aboutPage.clickCareersLink();
    }


    /*
        Thens
     */

    @Then("^The Careers link is present on the page$")
    public void the_Careers_link_is_present_on_the_page() throws Throwable {
        aboutPage.assertCareerLinkPresent();
    }

    @Then("^The current job openings are listed$")
    public void the_current_job_openings_are_listed() throws Throwable {
        careersPage.assertJobsPresent();
    }

    @Then("^A post for \"(.*?)\" is present$")
    public void a_post_for_is_present(String job) throws Throwable {
        careersPage.assertPostPresent(job);
    }


    /*
        After
     */

    @After
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
