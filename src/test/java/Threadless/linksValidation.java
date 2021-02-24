package Threadless;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.Objects;
import resources.Base;

public class linksValidation extends Base {
	Properties prop = new Properties();
	SoftAssert softAssert = new SoftAssert();

	@BeforeTest
	public void openBrowser() throws IOException {
		FileInputStream fis = new FileInputStream("src/main/java/resources/data.properties");
		prop.load(fis);
		String baseURL = prop.getProperty("BaseURL");
		driver = initializeDriver();
		driver.get(baseURL);
	}

	@Test
	public void bottomShopLinks() throws MalformedURLException, IOException {
		Objects lpObjects = new Objects(driver);

		for (WebElement link : lpObjects.bottomShopLinks()) {
			String url = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();

			if (respCode > 400) {
				softAssert.assertTrue(respCode < 400,
						"The link with Text" + link.getText() + " is broken with code" + respCode);
			}
		}

	}

	@Test
	public void bottomCommunityLinks() throws MalformedURLException, IOException {
		Objects lpObjects = new Objects(driver);

		for (WebElement link : lpObjects.bottomCommunityLinks()) {
			String url = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();

			if (respCode > 400) {
				softAssert.assertTrue(respCode < 400,
						"The link with Text" + link.getText() + " is broken with code" + respCode);
			}
		}

	}

	@Test
	public void bottomInfoLinks() throws MalformedURLException, IOException {
		Objects lpObjects = new Objects(driver);

		for (WebElement link : lpObjects.bottomInfoLinks()) {
			String url = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();

			if (respCode > 400) {
				softAssert.assertTrue(respCode < 400,
						"The link with Text" + link.getText() + " is broken with code" + respCode);
			}
		}

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
