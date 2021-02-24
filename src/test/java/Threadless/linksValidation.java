package Threadless;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.Objects;
import resources.Base;

public class linksValidation extends Base {
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
	public void bottomShopLinks() throws MalformedURLException, IOException {
		Objects lpObjects = new Objects(driver);

		for (WebElement link : lpObjects.bottomShopLinks()) {
			String url = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			System.out.println(url);

			if (respCode > 400) {
				System.out.println("Link " + link.getText() + " is broken");
				Assert.assertTrue(false);
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
			System.out.println(respCode);
			System.out.println(url);

			if (respCode > 400) {
				System.out.println("Link " + link.getText() + " is broken");
				Assert.assertTrue(false);
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
			System.out.println(respCode);
			System.out.println(url);

			if (respCode > 400) {
				System.out.println("Link " + link.getText() + " is broken");
				Assert.assertTrue(false);
			}
		}

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
