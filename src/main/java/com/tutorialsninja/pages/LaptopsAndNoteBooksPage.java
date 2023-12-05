package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopsAndNoteBooksPage extends Utility {
    By sortOption = By.id("input-sort");
    By macbook = By.linkText("MacBook");


    public void selectSorting(String text) {
        selectByVisibleTextFromDropDown(sortOption, text);
    }

    public void clickOnMacbook() {
        clickOnElement(macbook);
    }
}
