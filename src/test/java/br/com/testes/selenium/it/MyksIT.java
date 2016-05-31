package br.com.testes.selenium.it;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class MyksIT {

	private WebDriver driver;

	@Before
	public void setUp() {

		driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_38);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@Test
	public void HelloWord() {

		driver.navigate().to("http://localhost:9090/treina");

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	}

	@After
	public void tearDown() {
		
		driver.quit();
			
	}
}
