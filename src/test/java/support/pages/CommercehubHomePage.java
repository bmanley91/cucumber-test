package support.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by bmanley on 06/11/15.
 */
public class CommercehubHomePage extends BrowserPage {

    public CommercehubHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public CommercehubAboutPage clickCompanyLink() {
        // Click "Company" link
        driver.findElement(By.xpath("(//li[@id='menu-item-247']/a/span[2])[2]")).click();

        // Return About page
        return new CommercehubAboutPage(driver);
    }
}
