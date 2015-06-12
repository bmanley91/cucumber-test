package support.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by bmanley on 06/11/15.
 */
public class CommercehubAboutPage extends BrowserPage {

    public CommercehubAboutPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Method to navigate from the About page to the Careers page
     *
     * @return CommercehubCareersPage
     */
    public CommercehubCareersPage clickCareersLink() {
        driver.findElement(By.linkText("Careers")).click();

        return new CommercehubCareersPage(driver);
    }


    /**
     * Method to verify that the "Careers" link is present on the page
     */
    public void assertCareerLinkPresent() {
        boolean pass = driver.findElements(By.linkText("Careers")).size() == 1;

        if (!pass) {
            Assert.fail("Careers link was not on page.");
        }
    }
}
