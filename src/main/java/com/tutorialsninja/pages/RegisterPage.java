package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By telephone = By.id("input-telephone");
    By password = By.id("input-password");
    By confirmPassword = By.id("input-confirm");
    By radioYes = By.xpath("//label[normalize-space()='Yes']");
    By policy = By.xpath("//div[@class = 'buttons']//input[@name='agree']");
    By continueButton = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");

    public void enterFirstName(String text){
        sendTextToElement(firstName,text + getAlphaNumericString(4));
    }

    private String getAlphaNumericString(int i) {
        return null;
    }

    public void enterLastName(String text){
        sendTextToElement(lastName,text + getAlphaNumericString(4));
    }
    public void enterEmail(String text){
        sendTextToElement(email,text + getAlphaNumericString(4) + "@gmail.com");
    }
    public void enterTelephone(String text){
        sendTextToElement(telephone,text);
    }
    public void enterPassword(String text){
        sendTextToElement(password,text);
    }
    public void enterConfirmPassword(String text){
        sendTextToElement(confirmPassword,text);
    }
    public void clickOnSubscribe(){
        clickOnElement(radioYes);
    }
    public void clickOnPolicy(){
        clickOnElement(policy);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }
}
