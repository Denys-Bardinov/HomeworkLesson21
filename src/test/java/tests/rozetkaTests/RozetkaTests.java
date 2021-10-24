package tests.rozetkaTests;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constans.Constant.Urls.ROZETKA_HOME_PAGE;

public class RozetkaTests extends BaseTest {

@Test
    public void checkCartText () {
        basePage.open(ROZETKA_HOME_PAGE);
        rozetkaHomePage.displayCartText();
    }

    @Test
    public void checkPremiumText() {
    basePage.open(ROZETKA_HOME_PAGE);
    rozetkaHomePage.comparePremiumText();
    }

    @Test
    public void checkEmailErrorMessage() {
    basePage.open(ROZETKA_HOME_PAGE);
    rozetkaHomePage.matchEmailErrorMessage();
    }

    @Test
    public void comparePlaceholderTextTest() {
    basePage.open(ROZETKA_HOME_PAGE);
    rozetkaHomePage.comparePlaceholderText();
    }

    @Test
    public void checkPasswordVisibilityTest() {
    basePage.open(ROZETKA_HOME_PAGE);
    rozetkaHomePage.checkPasswordVisibility();
    }

    @Test
    public void calculateCountOfMenuCategoriesItemTest() {
    basePage.open(ROZETKA_HOME_PAGE);
    rozetkaHomePage.calculateCountOfMenuCategoriesItem();
    }

    @Test
    public void matchFirstSearchResultTest() {
    basePage.open(ROZETKA_HOME_PAGE);
    rozetkaHomePage.matchFirstSearchResult();
    }

    @Test
    public void calculateCountOfSocialNetworksTest() {
    basePage.open(ROZETKA_HOME_PAGE);
    rozetkaHomePage.calculateCountOfSocialNetworks();
    }

    @Test
    public void compareTextTest() {
    basePage.open(ROZETKA_HOME_PAGE);
    rozetkaHomePage.compareText();
    }

    @Test
    public void chekHelpCenterTest() {
    basePage.open(ROZETKA_HOME_PAGE);
    rozetkaHomePage.checkHelpCenter();
    }
}
