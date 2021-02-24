package pageObjects;

import java.util.List;

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
	By qty = By.className("cart_page_quantity_input");
	By update = By.linkText("Update");
	By searchBar = By.id("search");
	By sizeS = By.cssSelector("a[class='pjax-link size-link']");
	
	By bottomShopLinks = By.cssSelector("li[class='shop'] a");
	By bottomCommunityLinks = By.cssSelector("li[class='community'] a");
	By bottomInfoLinks = By.cssSelector("li[class='info'] a");
	
	public List<WebElement> bottomShopLinks() {
		return driver.findElements(bottomShopLinks);
	}
	
	public List<WebElement> bottomCommunityLinks() {
		return driver.findElements(bottomCommunityLinks);
	}
	
	public List<WebElement> bottomInfoLinks() {
		return driver.findElements(bottomInfoLinks);
	}
	
	
	
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

	public WebElement search() {
		return driver.findElement(searchBar);
	}

	public WebElement sizeS() {
		return driver.findElement(sizeS);
	}
	
}
