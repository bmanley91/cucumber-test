package support.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by bmanley on 06/11/15.
 */
public class CommercehubCareersPage extends BrowserPage {

    public CommercehubCareersPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Method to verify that the page is correctly displaying job postings
     */
    public void assertJobsPresent() {

    }


    /**
     * Method to verify that a job post is present for the given job title
     *
     * @param jobTitle - the job title to assert on
     */
    public void assertPostPresent(String jobTitle) {
        boolean pass = false;

        driver.findElement(By.linkText(jobTitle));
//        List<WebElement> elements = driver.findElements(By.linkText(jobTitle));
//
//        for (WebElement element : elements) {
//            if (element.getText().equals(jobTitle)) {
//                pass = true;
//            }
//        }
//
//        if (!pass) {
//            Assert.fail("Job Title " + jobTitle + " was not present on the page.");
//        }
    }
}
