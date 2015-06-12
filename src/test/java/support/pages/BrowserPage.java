package support.pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by bmanley on 06/11/15.
 */
public class BrowserPage {

    public WebDriver driver;

    public BrowserPage() { }

    public BrowserPage(WebDriver driver) {
        this.driver = driver;
    }
}
