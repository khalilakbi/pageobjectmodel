package authentication;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.LoginPage;

public class TestLogOut {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();
    }
     /*
    Test case valid login
    1 open app url with chrome
    2 enter username
    3 enter password
    4 click on login btn
    5
    */

    @Test
    public void testVlogOut(){
        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginBtn();
        accountPage.clickOnUserDopDown();
        accountPage.clickOnLogOut();
        Assert.assertEquals(driver.getCurrentUrl(),expectedUrl);

    }
}
