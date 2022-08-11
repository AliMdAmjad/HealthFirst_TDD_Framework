package commonPack;

import org.openqa.selenium.WebElement;

public class CommonActn {

	public void clicking(WebElement element) {
		element.click();

	}

	public void enterText(WebElement element, String value) {
		element.sendKeys(value);

	}

}
