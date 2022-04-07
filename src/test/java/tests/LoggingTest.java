package tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import pages.InventoryPage;
import pages.LogginSteps;
import resources.User;
import net.serenitybdd.core.SerenityReports;
import net.serenitybdd.junit.runners.SerenityRunner;


@RunWith(SerenityRunner.class)
public class LoggingTest {

	@Managed
	WebDriver driver;
	
	@Steps
	LogginSteps login;
	
	InventoryPage inventory;
	
	
	@Test
	public void logIn() {
		login.as(User.STANDARD_USER);
		 Serenity.reportThat("The inventory page should be displayed with correct title", ()-> assertThat((inventory.getHeading()).equalsIgnoreCase("Products")));
	
	}
}
