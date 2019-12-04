package gd.internship.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoodTestablePageObject {

    private TestablePageUtil utilPage;

    GoodTestablePageObject() {
        utilPage = TestablePageUtil.get();
    }

    @FindBy(id = "testId")
    WebElement testElementOne;

    @FindBy(id = "testId2")
    WebElement testElementTwo;

    public boolean testMethodOne() {
        return utilPage.testableMethodOne(testElementOne);
    }

    public void testMethodTwo(String text) {
        utilPage.testableMethodTwo(testElementTwo, text);
    }
}
