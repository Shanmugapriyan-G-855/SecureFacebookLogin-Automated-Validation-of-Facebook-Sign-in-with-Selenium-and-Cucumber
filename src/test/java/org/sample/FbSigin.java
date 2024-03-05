package org.sample;

import java.util.List;
import java.util.Map;

import org.sample.BaseClass;
import org.sample.FbSample;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbSigin extends BaseClass {

	@Given("To laucnch the firefox browser and maximize the window")
	public void to_laucnch_the_firefox_browser_and_maximize_the_window() {
		launchBrowser("firefox");
		windowMaximize();
	}

	@When("To launch the url of Facebook application")
	public void to_launch_the_url_of_facebook_application() {
		launchUrl("https://www.facebook.com/login/");
	}

	@When("To pass valid Email or mobile phone number in text box")
	public void to_pass_valid_email_or_mobile_phone_number_in_text_box(DataTable d)
			throws InterruptedException {
		FbSample fb = new FbSample();
		List<Map<String, String>> m = d.asMaps();
		Thread.sleep(3000);
		sendKeys(m.get(1).get("A"), fb.getEmail());

	}

	@When("To pass valid password in Password text box")
	public void to_pass_valid_password_in_password_text_box(DataTable d) throws InterruptedException {
		FbSample fb = new FbSample();
		Map<String, String> m = d.asMap(String.class, String.class);
		Thread.sleep(3000);
		sendKeys(m.get("password1"), fb.getPass());

	}
	@When("To check whether navigate the homepage or not")
	public void to_check_whether_navigate_the_homepage_or_not() {
	  System.out.println("check your url credentials");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	    closeEntireBrowser();
	}
}
