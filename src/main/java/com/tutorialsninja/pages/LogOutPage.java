package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LogOutPage extends Utility {
    By logout = By.xpath("//a[contains(text(),'Continue')]");

    public void clickOnLogout() {
        clickOnElement(logout);
    }

}
