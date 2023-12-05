package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    By desktop = By.linkText("Desktops");
    By laptopsAndNotebooks = By.linkText("Laptops & Notebooks");
    By components = By.linkText("Components");
    By currency = By.xpath("//span[contains(text(),'Currency')]");
    By pound = By.xpath("//button[normalize-space()='£Pound Sterling']");
    By myAccount = By.xpath("//span[contains(text(),'My Account')]");


    public void mouseHoverOnDesktopAndClick() {
        mouseHoverToElementAndClick(desktop);
    }

    public void mouseHoverOnLaptopsAndClick() {
        mouseHoverToElementAndClick(laptopsAndNotebooks);
    }

    public void mouseHoverOnComponentsAndClick() {
        mouseHoverToElementAndClick(components);
    }

    public void selectMenu(String menu) {
        List<WebElement> topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = getListOfElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }

    private List<WebElement> getListOfElements(By xpath) {
        return null;
    }

    public void selectCurrency() {
        clickOnElement(currency);
        clickOnElement(pound);
    }

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }
    }

    public void clickOnMyAccount() {
        clickOnElement(myAccount);
    }


}
