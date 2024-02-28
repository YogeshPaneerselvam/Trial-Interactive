package com.testExecution;

import java.time.Duration;

import org.testng.annotations.Test;

import com.gL.helperClass;
import com.pageActionClass.GL_Login_Page;

public class RunnerClass extends helperClass {

	@Test
	private void testGL() {

		browserLaunch("https://lms-stg-globallearn2.trialinteractive.com/");// launching Global Learn on the browser

		maximize();// maximized the browser window

		// the Implicit Wait function will be applicable as long as the current browser
		// is open
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		GL_Login_Page lP = new GL_Login_Page();

		inputText(lP.getUserName(), "caintz@ti.com");

		buttonClick(lP.getNext());
		
		inputText(lP.getpW(), "Pass@123");

		buttonClick(lP.getLogin());
	}
}
