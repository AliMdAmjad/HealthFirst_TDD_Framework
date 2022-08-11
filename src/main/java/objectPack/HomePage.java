package objectPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPack.CommonActn;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[text()='Login'])[1]")
	WebElement logInBtn;

	@FindBy(linkText = "Member Portal")
	WebElement memberPortal;

	public void logInBtnAction(CommonActn ca) {
		ca.clicking(logInBtn);
	}

	public void memberPortalAction(CommonActn ca) {
		ca.clicking(memberPortal);
	}

}
