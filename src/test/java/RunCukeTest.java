import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        plugin = {
                "pretty",
                "html:target/cucumber",
                "json:target/cucumber.json"
        }
)
public class RunCukeTest {
    private Customer customer;

    @Given("^we are a customer$")
    public void we_are_a_customer(){
        customer = new Customer("username_generico", "password_generico");
    }

    @When("^we want to login with our username and password correctly$")
    public void we_want_to_login_with_our_username_and_password_correctly(){
        customer.login("username_generico", "password_generico");
    }

    @Then("^our password and username are correctly validated")
    public void our_password_and_username_are_correctly_validated(){
        Assert.assertTrue(customer.validate_password());
        Assert.assertTrue(customer.validate_username());
    }

    @When("^we want to login with our username wrongly$")
    public void we_want_to_login_with_our_username_wrongly(){
        customer.login("username_distinto", "password_generico");
    }

    @Then("^our username is not validated correctly")
    public void our_username_is_not_validated_correctly(){
        Assert.assertFalse(customer.validate_username());
    }

    @When("^we want to login with our password wrongly$")
    public void we_want_to_login_with_our_password_wrongly(){
        customer.login("username_generico", "password_distinta");
    }

    @Then("^our password is not validated correctly")
    public void our_password_is_not_validated_correctly(){

        Assert.assertFalse(customer.validate_password());
    }
}
