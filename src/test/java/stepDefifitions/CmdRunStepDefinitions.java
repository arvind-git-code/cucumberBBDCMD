package stepDefifitions;

import io.cucumber.java.en.*;

public class CmdRunStepDefinitions {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	}

	@When("user enter valid user id and password")
	public void user_enter_valid_user_id_and_password() {
	}

	@And("click on login button")
	public void click_on_login_button() {
	}

	@Then("user is nevidated to home page")
	public void user_is_nevidated_to_home_page() {
	}

	@When("user enter invalid user id and password")
	public void user_enter_invalid_user_id_and_password() {
	}

	@Then("error message display - invalid crediential")
	public void error_message_display_invalid_crediential() {
	}

// we can make method protected so that it will not create duplicate definition error because i am using same statement in multiple feature file
	
//but if we want to run this from runner file then either method should public or make both runner and stepdefinition file same package
	
	
	
//	By default mvn test will run the files with naming syntax
//	**/Test*.java
//	Test. java
//	**/*TestCase.java
//	
	
	
//	to run test in cmd make sure the runner file must have *test* word and maven in system and path is set 
//	go to cmd go to project path and type default command  "mvn test" or use other options for specific feature, anotation, test , runner file
	
//	mvn test
//	mvn test -Dcucumber.options="Your Options"
//	mvn test -Dcucumber.options="--help"
//	Run specific feature : mvn test -Dcucumber.options="src/test/resources/login1.feature"
//	Run specific feature : mvn test -Dcucumber.options="src/test/resources/login1.feature:9"
	
	//mvn test -Dcucumber.options="-t @smoke"
	
}
