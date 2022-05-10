package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

//- resultMessage locator and create methods 'String getResultMessage()' and
//        'void confirmResultMessage(String expectedMessage)' (Note Use Assert.assertTrue)
public class ResultPage extends Utility {
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/main[1]/div[1]/div[1]/div[2]/h2[1]")
    WebElement resultMessage;
// actual text method
    public String actualtextMethod() {
        String actualText = getTextFromElement(resultMessage);
        return actualText;
    }
// verify text method by assert.assertTrue
    public void confirmResultMessage(String expectedText) {
        if (actualtextMethod().equalsIgnoreCase(expectedText)) {
            Assert.assertTrue(true);
        } else {
            Assert.fail();
        }
    }
}
