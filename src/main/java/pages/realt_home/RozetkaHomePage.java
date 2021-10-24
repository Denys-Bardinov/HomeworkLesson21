package pages.realt_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.base.BasePage;

public class RozetkaHomePage extends BasePage {
    public RozetkaHomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(id = "rooms")
    WebElement countRooms;
    @FindBy(xpath = "//select[@id='rooms']/option[@value='2']")
    WebElement option2rooms;
    @FindBy(xpath = "//div[@id='residentialInputs']//a[text()='Найти']")
    WebElement findBtn;




    public RozetkaHomePage enterCountRooms() {

        countRooms.click();
        option2rooms.click();

        return this;
    }

    public RozetkaHomePage clickToFind() {
        WebElement btnFind = findBtn;
        waitElementIsVisible(btnFind).click();

        return this;
    }
}
