package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.example.Consts.email;
import static org.example.Consts.pass;


public class LoginPage {
    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    By inputEmail = By.id("InputEmail");
    By inputPass = By.id("InputPsw");
    By btnJoin = By.xpath("//*[@id='vue-container']/div/div/div[1]/form/div[3]/button");
    By popUpClose = By.className("edrone-close-popup");

    By popUp = By.xpath("/html/body/div/section/form/ul");


    public void login() {
        driver.findElement(inputEmail).sendKeys(email);
    }
    public void password() {
        driver.findElement(inputPass).sendKeys(pass);
    }


    public void joinBtn() {
        try {
            driver.findElement(btnJoin).click();
        } catch (Exception e) {
            driver.findElement(popUpClose).click();
        }
    }
}
