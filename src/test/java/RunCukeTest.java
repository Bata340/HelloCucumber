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
    @Given("^we are a user$")
    public void we_are_a_user(){
        System.out.println("Soy usuario");
    }

    @When("^we want to know the result of two plus two$")
    public void we_want_to_know_the_result_of_two_plus_two(){
        System.out.println("Quiero saber el resultado de 2+2");
    }

    @Then("^the result is 4")
    public void the_result_is_4(){
        Assert.assertEquals(4,2+2);
    }

    @When("^we want to know the result of three plus three$")
    public void we_want_to_know_the_result_of_three_plus_three(){
        System.out.println("Quiero saber el resultado de 3+3");
    }

    @Then("^the result is 6")
    public void the_result_is_6(){
        Assert.assertEquals(6,3+3);
    }

    @When("^we want to know the result of four plus four$")
    public void we_want_to_know_the_result_of_four_plus_four(){
        System.out.println("Quiero saber el resultado de 4+4");
    }

    @Then("^the result is 8")
    public void the_result_is_8(){
        Assert.assertEquals(8,4+4);
    }
}
