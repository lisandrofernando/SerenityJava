package tests;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import pages.InventoryPage;
import pages.LogginSteps;
import pages.ProductDetailPage;
import pages.ProductListPageObject;
import resources.User;
import static org.assertj.core.api.Assertions.assertThat;
@RunWith(SerenityRunner.class)
public class WhenViewingHighlightedProducts {
	
	
	@Managed
	WebDriver driver;
	
	@Steps
	LogginSteps login;
	
	InventoryPage inventory;
	
	ProductListPageObject products;
	
	ProductDetailPage detail;
	
	//@Test
	public void ShouldDisplayHighLightedElements(){
		login.as(User.STANDARD_USER);
		List<String> productsOnDisplay = products.titles();
		
		assertThat(productsOnDisplay).hasSize(6).contains("Sauce Labs Onesie");
	}
	
	@Test
	public void ShouldDisplayCorrectDetailPage() {
		login.as(User.STANDARD_USER);
		String firstItemName = products.titles().get(0);
		products.openProductDetails(firstItemName);
		assertThat(detail.productName()).isEqualTo(firstItemName);
	}

}
