package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends Utility {
    By quantity = By.xpath("//input[contains(@name, 'quantity')]");
    By update = By.xpath("//button[contains(@data-original-title, 'Update')]");

    public void changeQuantity(String text) {
        WebElement qty = getElement(quantity);
        qty.clear();
        sendTextToElement(quantity, text);
    }

    private WebElement getElement(By quantity) {
        return null;
    }

    public void clickOnUpdate() {
        clickOnElement(update);
    }

}
