package Threadless;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.Objects;
import resources.Base;

public class accesoriesTest extends Base {
	Properties prop = new Properties();
	Objects lpObjects = new Objects(driver);

	@BeforeTest
	public void openBrowser() throws IOException {
		FileInputStream fis = new FileInputStream("src/main/java/resources/data.properties");
		prop.load(fis);
		String baseURL = prop.getProperty("BaseURL");
		driver = initializeDriver();
		driver.get(baseURL);
	}

	@Test
	public void accesories() throws InterruptedException {
		Objects lpObjects = new Objects(driver);
		lpObjects.accesoriesButton().click();
		lpObjects.hats().click();
		lpObjects.sortByRelevance().click();
		Thread.sleep(2000);
		lpObjects.firstGridItem().click();
		Thread.sleep(2000);
		lpObjects.addToCart().click();
		Thread.sleep(2000);
		Assert.assertTrue(lpObjects.cartPopUp().isDisplayed());
		lpObjects.viewCart().click();
	}
	@Test
	public void cart() {
		Objects lpObjects = new Objects(driver);
		lpObjects.qty().clear();
		lpObjects.qty().sendKeys("3");
		lpObjects.update().click();
	}
}
