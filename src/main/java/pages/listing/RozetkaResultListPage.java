package pages.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.base.BasePage;
import pages.realt_home.RozetkaHomePage;

import java.util.ArrayList;
import java.util.List;

public class RozetkaResultListPage extends BasePage {
    public RozetkaResultListPage(WebDriver driver) {
        super(driver);
    }

//    private final By card  = By.xpath("/html/body/div[2]/div[7]/div/div/div[1]/div/div/div[5]/div/div[1]");
@FindBy(xpath = "/html/body/div[2]/div[7]/div/div/div[1]/div/div/div[5]/div/div[1]")
WebElement card;

    public RozetkaResultListPage checkCountCards () {
        WebElement titleCard = card;
        Assert.assertTrue(card.isDisplayed());
        return this;

    }

}
