package step_definitions;

import implementation.Checkout;
import cucumber.api.java.en.*;
import cucumber.api.PendingException;

public class CheckoutSteps {

	Checkout checkout;
	int bananaPrice;

	@Given("^the price of a \"(.*?)\" is (\\d+)c$")
	public void thePriceOfAIsC(String item, int price) throws Throwable {
		bananaPrice = price;
	}	

	@When("^I checkout (\\d+) \"(.*?)\"$")
	public void iCheckout(int arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the total price should be (\\d+)c$")
	public void theTotalPriceShouldBeC(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}