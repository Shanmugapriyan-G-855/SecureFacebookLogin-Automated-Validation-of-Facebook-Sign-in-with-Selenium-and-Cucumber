package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbSample extends BaseClass{
	public FbSample() {
		PageFactory.initElements(driver, this);

	}

	
	@FindBy(xpath="//input[@aria-label='Email address or phone number']")
	private WebElement email;
	

	@FindBy(xpath = "//input[@aria-label='Password']")
	private WebElement pass;


	public WebElement getEmail() {
		return email;
	}


	public WebElement getPass() {
		return pass;
	}
	
}
