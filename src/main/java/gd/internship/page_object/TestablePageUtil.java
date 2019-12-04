package gd.internship.page_object;

import org.openqa.selenium.WebElement;

class TestablePageUtil {

    private TestablePageUtil() {
    }

    static TestablePageUtil get() {
        return new TestablePageUtil();
    }

    boolean testableMethodOne(WebElement element) {
        return element.isDisplayed();
    }

    void testableMethodTwo(WebElement element, String text) {
        element.sendKeys(text);
    }
}
