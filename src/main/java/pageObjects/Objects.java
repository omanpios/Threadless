package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Objects {
	public WebDriver driver;

	public Objects(WebDriver driver) {
		this.driver = driver;
	}

	By accesories = By.linkText("Accessories");
	By hats = By.cssSelector("article[class='half-width grid_item_2']");
	By sortByRelevance = By.linkText("Relevance");
	By firstGridItem = By.xpath("//*[@id=\"search-results-grid\"]/div[2]/div[1]");
	By addToCart = By.cssSelector("button[class='productPicker-cart']");
	By cartPopUp = By.cssSelector("div[class='modal_container cart-modal']");
	By viewCart = By.id("mpViewCart");
	By qty = By.id("artist_shop_qty_1915297106");
	By update = By.id("qty_update_button_1915297106");

	public WebElement accesoriesButton() {
		return driver.findElement(accesories);
	}

	public WebElement hats() {
		return driver.findElement(hats);
	}

	public WebElement sortByRelevance() {
		return driver.findElement(sortByRelevance);
	}

	public WebElement firstGridItem() {
		return driver.findElement(firstGridItem);
	}

	public WebElement addToCart() {
		return driver.findElement(addToCart);
	}

	public WebElement cartPopUp() {
		return driver.findElement(cartPopUp);
	}

	public WebElement viewCart() {
		return driver.findElement(viewCart);
	}

	public WebElement qty() {
		return driver.findElement(qty);
	}

	public WebElement update() {
		return driver.findElement(update);
	}
}
