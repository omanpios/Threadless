package Threadless;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.Objects;
import resources.Base;

public class searchBarTest extends Base {
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
	public void searchBar() {
		Objects lpObjects = new Objects(driver);
		lpObjects.search().click();
		lpObjects.search().sendKeys("Cats");
		lpObjects.search().sendKeys(Keys.ENTER);
	}

	@Test
	public void selectItem() throws InterruptedException {
		Objects lpObjects = new Objects(driver);
		lpObjects.firstGridItem().click();
		Thread.sleep(2000);
		Assert.assertTrue(lpObjects.sizeS().isDisplayed());
		lpObjects.sizeS().click();
		Thread.sleep(1500);
		lpObjects.addToCart().click();
		Thread.sleep(2000);
		Assert.assertTrue(lpObjects.cartPopUp().isDisplayed());
		lpObjects.viewCart().click();
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
