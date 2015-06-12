package step_definitions;

import implementation.Checkout;

import static org.junit.Assert.*;
import cucumber.api.java.en.*;
import cucumber.api.PendingException;

public class CheckoutSteps {

	Checkout checkout;
	int bananaPrice;

	@Given("^the price of a \"(.*?)\" is (\\d+)c$")
	public void thePriceOfAIsC(String itemName, int price) throws Throwable {
		bananaPrice = price;
	}	

	@When("^I checkout (\\d+) \"(.*?)\"$")
	public void iCheckout(int itemCount, String itemName) throws Throwable {
		checkout = new Checkout();
		checkout.add(itemCount, bananaPrice);
	}

	@Then("^the total price should be (\\d+)c$")
	public void theTotalPriceShouldBeC(int total) throws Throwable {
		assertEquals(total, checkout.total());
	}
}