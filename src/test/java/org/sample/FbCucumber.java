package org.sample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class FbCucumber extends BaseClass {
	

		public static void main(String[] args) throws InterruptedException {
			launchBrowser("firefox");
			windowMaximize();
			launchUrl("https://www.facebook.com/login/");
			FbSample fb = new FbSample();
			
			sendKeys("shanmugapriyan2352002@gmail.com", fb.getEmail());
			Thread.sleep(3000);
			sendKeys("shan@9566", fb.getPass());
		

		}

	}


