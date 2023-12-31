package automation.testsuite.day15;

import automation.common.CommonBase;
import automation.constant.risePage.CT_Account;
import automation.page.risePage.ClientPage;
import automation.page.risePage.LoginPage_Factory;
import automation.page.trizzenPage.Client;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClientTest extends CommonBase {
    @BeforeMethod
    public void openChrome(){
        driver = initChromeDriver(CT_Account.RISE_URL);
    }

    @Test
    public void addClientSuccess(){
        LoginPage_Factory login = new LoginPage_Factory(driver);
        login.loginFunction("admin@demo.com","riseDemo");

        ClientPage client = new ClientPage(driver);
        Client clientData = new Client("Hangg Company","123 trung van", "Ha Noi","VN","12000","HN","0332145678","rise.fairsketch.com","123","123","Symbol");
        client.addClientFunction(clientData);

        pause(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Hangg Company']")).isDisplayed());
    }
}
