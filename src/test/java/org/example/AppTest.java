package org.example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.example.Consts.Url;


public class AppTest {
    public static LoginPage loginPage;
    public static WebDriver driver;
    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/home/dina/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get(Url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginTest() {
    loginPage.login();
    loginPage.password();
    loginPage.joinBtn();

    }

    @AfterClass
    public static void shutDown() {
        driver.quit();
    }

}
