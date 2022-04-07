package pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

public class InventoryPage extends PageObject {
	@Step("The tittle is {0}")
    public String getHeading(){
        return $(".title").getText();
    }
}
