package tests.searchapartment;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constans.Constant.Urls.ROZETKA_HOME_PAGE;

public class SearchApartmentTest extends BaseTest {
@Test
    public void checkIsRedirectToListing () {
        basePage.open(ROZETKA_HOME_PAGE);
        rozetkaHomePage.enterCountRooms().clickToFind();

        rosetkaResultListPage.checkCountCards();
    }

}
