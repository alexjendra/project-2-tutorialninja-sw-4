package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {

        homePage.mouseHoverOnDesktopAndClick();
        homePage.selectMenu("Show AllDesktops");
        verifyTwoStrings("Desktops", By.xpath("//h2[contains(text(),'Desktops')]"));
    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {

        homePage.mouseHoverOnLaptopsAndClick();
        homePage.selectMenu("Show AllLaptops & Notebooks");
        verifyTwoStrings("Laptops & Notebooks", By.xpath("//h2[contains(text(),'Laptops & Notebooks')]"));
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        homePage.mouseHoverOnComponentsAndClick();
        homePage.selectMenu("Show AllComponents");
        verifyTwoStrings("Components",By.xpath("//h2[contains(text(),'Components')]"));
    }
}
