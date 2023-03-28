package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    //data (variables)
    WebDriver driver;
//    By inputUsername = By.name("username");
//    By inputPassword = By.name("password");
//    By loginBtn = By.tagName("button");
    @FindBy (name = "username" )
    public WebElement inputUsername;

    @FindBy (name = "password")
    public WebElement inputPassword;

    @FindBy(tagName = "button")
    public WebElement loginBtn;



    //method region

//    public void enterUserName(String username) {
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.presenceOfElementLocated(inputUsername));
//        driver.findElement(inputUsername).sendKeys(username);
//    }
    public void enterUserName(String username){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        inputUsername.sendKeys(username);
    }
//    public void enterPassword(String password){
//        driver.findElement(inputPassword).sendKeys(password);
//    }
    public void enterPassword(String password){
       inputPassword.sendKeys(password);
    }
//    public void clickPnLoginBtn(){
//        driver.findElement(loginBtn).click();
//    }
    public void clickOnLoginBtn(){
        loginBtn.click();
    }
//    public void doLogin(String username,String password){
//        enterUserName(username);
//        enterPassword(password);
//        clickPnLoginBtn();
//    }
}
