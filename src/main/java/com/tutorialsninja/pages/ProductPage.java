package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Utility {
    By calendar = By.xpath("//div[@class = 'input-group date']//button");
    By monthAndyear = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");
    By nextIcon = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']");
    By alldates = By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']");
    By quantity = By.name("quantity");
    By addToCart = By.xpath("//button[@id='button-cart']");
    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");

    public void datePicker(String y, String m, String d) {
        String year = y;
        String month = m;
        String date = d;
        clickOnElement(calendar);
        while (true) {
            String monthAndYear = getTextFromElement(monthAndyear);
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(nextIcon);
            }
        }
        List<WebElement> allDates = getListOfElements(alldates);
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

    private List<WebElement> getListOfElements(By alldates) {
        return null;
    }

    public void changeQuantity(){
        WebElement qty = getElement(quantity);
        qty.clear();
        sendTextToElement(quantity,"1");
    }

    private WebElement getElement(By quantity) {
        return null;
    }

    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
    }
}
