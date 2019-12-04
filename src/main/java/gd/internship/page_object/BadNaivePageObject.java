package gd.internship.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BadNaivePageObject {
    @FindBy(id = "testId")
    WebElement testElementOne;

    @FindBy(id = "testId2")
    WebElement testElementTwo;

    public boolean testMethodOne() {
        return testElementOne.isDisplayed();
    }

    public void testMethodTwo(String testLogin) {
         testElementTwo.sendKeys(testLogin);
    }
}
