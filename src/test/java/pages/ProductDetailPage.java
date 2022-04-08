package pages;

import net.serenitybdd.core.pages.PageObject;

public class ProductDetailPage extends PageObject {

	public String productName() {
		
		return $(".inventory_details_name").getText();
	}
}
