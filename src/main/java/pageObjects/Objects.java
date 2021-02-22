package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Objects {
	public WebDriver driver;

	public Objects(WebDriver driver) {
		this.driver = driver;
	}

	By accesories = By.xpath("/html/body/nav/ul/li[6]");

	public WebElement accesoriesButton() {
		return driver.findElement(accesories);
	}
}
