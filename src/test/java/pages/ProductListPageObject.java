package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;


public class ProductListPageObject extends PageObject{

	
	public List<String> titles(){
		
		return  findAll(".inventory_item_name").textContents();
			
	}
	
	public void openProductDetails(String itemName) {
		find(By.linkText(itemName)).click();
	}
	
}
