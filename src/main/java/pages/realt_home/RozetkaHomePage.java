package pages.realt_home;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;

import java.util.List;

public class RozetkaHomePage extends BasePage {
    public RozetkaHomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//rz-cart/button")
    WebElement cart;
    @FindBy(xpath = "//rz-shopping-cart/div/div//h4")
    WebElement cartText;
    @FindBy(className = "premium-button__label")
    WebElement premiumButtonLabel;
    @FindBy(xpath = "//rz-user//button")
    WebElement loginButton;
    @FindBy(xpath = "//div/input[@type='email']")
    WebElement emailInput;
    @FindBy(xpath = "//div/input[@type='password']")
    WebElement passwordInput;
    @FindBy(xpath = "//div[@class='form__row validation_type_error']/p")
    WebElement validationErrorMessage;
    @FindBy(name = "search")
    WebElement search;
    @FindBy(xpath = "//*[@id=\"auth_pass\"]")
    WebElement passwordVisibilityIcon;
    @FindBy(id = "fat-menu")
    WebElement fatMenu;
    @FindBy(xpath = "//ul [@class='menu-categories ng-star-inserted']/li")
    List<WebElement> categoriesList;
    @FindBy(css = "div input[name='search']")
    WebElement inputSearch;
    @FindBy(css = "a span.goods-tile__title")
    WebElement firstResult;
    @FindBy(xpath = "//ul [@class='socials__list']//a/..")
    List<WebElement> socialNetworks;
    @FindBy(xpath = "/html/body/app-root/div/div/rz-header/header/div/div/rz-mobile-user-menu/button")
    WebElement burgerMenu;
    @FindBy(xpath = "//*[@id='cdk-overlay-0']/nav/div/div[2]/ul[2]/li[3]/rz-service-links/div[3]/div/button")
    WebElement burgerMenuService;
    @FindBy(xpath = "//*[@id='cdk-overlay-3']/nav/div/div[2]/ul[2]/li[3]/rz-service-links/div[3]/ul/li")
    List<WebElement> burgerMenuServicesLinks;
    @FindBy(xpath = "//goods-sections/section[1]/goods-section/button")
    WebElement goodSectionButton;
    @FindBy(xpath = "//section[1]/goods-section/ul/li")
    List<WebElement> goodsList;


    public RozetkaHomePage calculateCountOfSocialNetworks() {
        List<WebElement> listOfSocialNetworks = socialNetworks;
        Assert.assertNotNull(listOfSocialNetworks);
        return this;
    }

    public RozetkaHomePage matchFirstSearchResult() {
        inputSearch.click();
        inputSearch.sendKeys("Телефон");
        inputSearch.sendKeys(Keys.ENTER);
        driver.get("https://rozetka.com.ua/mobile-phones/c80003/#search_text=%D1%82%D0%B5%D0%BB%D0%B5%D1%84%D0%BE%D0%BD");
        String firstResultText = firstResult.getText();
        Assert.assertTrue(firstResultText.contains("телефон"));
        return this;
    }

    public RozetkaHomePage displayCartText() {
        cart.click();
        cartText.getText();
        Assert.assertTrue(cartText.isDisplayed());
        return this;
    }

    public RozetkaHomePage comparePremiumText() {
        String premiumText = premiumButtonLabel.getText();
        Assert.assertTrue(premiumText.equals("Попробуйте"));
        return this;
    }

    public RozetkaHomePage matchEmailErrorMessage() {
        loginButton.click();
        emailInput.sendKeys("A");
        passwordInput.sendKeys("B");
        String failedAuthorizationTextpath = validationErrorMessage.getText();
        Assert.assertTrue(failedAuthorizationTextpath.equals("Введен неверный адрес эл.почты или номер телефона"));
        return this;
    }

    public RozetkaHomePage comparePlaceholderText() {
        String placeholder = search.getAttribute("placeholder");
        Assert.assertTrue(placeholder.equals("Я ищу..."));
        return this;
    }


    public RozetkaHomePage checkPasswordVisibility() {
        loginButton.click();
        String typeName = passwordVisibilityIcon.getAttribute("type");
        Assert.assertTrue(typeName.equals("password"));
        return this;
    }


    public RozetkaHomePage calculateCountOfMenuCategoriesItem() {
        fatMenu.click();
        List<WebElement> elements = categoriesList;
        int elementsSize = elements.size();
        Assert.assertTrue(elementsSize == 19);
        return this;
    }

    public RozetkaHomePage compareText() {
        burgerMenu.click();
        burgerMenuService.click();
        List<WebElement> elements = burgerMenuServicesLinks;
        Assert.assertNotNull(elements);
        return this;
    }


    public RozetkaHomePage checkHelpCenter() {
        goodSectionButton.click();
        List<WebElement> goods = goodsList;
        Assert.assertTrue(goods.size() > 5);
        return this;
    }

}
