package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage {
    WebDriver driver;
    By DashboardText = By.xpath("//h6[text()='Dashboard']");
    By userDropDown = By.xpath("//p[text()='Paul Collings']");

    By logoutLink = By.xpath("//a[text()='Logout']");


    public AccountPage(WebDriver driver){
        this.driver = driver;
    }

    public String getDashboardText() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(DashboardText).getText();
    }

    public void clickOnUserDopDown(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(userDropDown));
        driver.findElement(userDropDown).click();
    }
    public void clickOnLogOut(){
        driver.findElement(logoutLink).click();
    }

}
