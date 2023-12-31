package automation.testsuite.day12;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeworkDay12 extends CommonBase {

    @BeforeTest
    public void openChrome() {
        driver = initChromeDriver("http://demo.seleniumeasy.com/input-form-demo.html");
    }

    @Test
    public void runTest() {
        //Dropdown
        Select state = new Select(driver.findElement(By.name("state")));
        state.selectByVisibleText("South Dakota");
        System.out.println(state.getFirstSelectedOption().getText());

        //Radio
        driver.findElement(By.xpath("//label[normalize-space()='Do you have hosting?']//following-sibling::div//input[@value='yes']")).click();
    }
}
