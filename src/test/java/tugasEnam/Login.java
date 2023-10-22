package tugasEnam;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {
    @Test
    public void success_login(){
        WebDriver driver;
        String baseUrl = "https://www.saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        // apply chrome driver setup
        // Membuka halama login
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

//        String loginPageAssert = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div")).getText();

        // input email
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // input password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // click login
        driver.findElement(By.xpath("//*[@id=\"login-button\"][@type='submit']")).click();

        driver.close();
    }
    @Test
    public void failed_login(){
        WebDriver driver;
        String baseUrl = "https://www.saucedemo.com/";

        WebDriverManager.chromedriver().setup();

        // apply chrome driver setup
        // Membuka halama login
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.get(baseUrl);

        // input email
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // input password
        driver.findElement(By.id("password")).sendKeys("test12345");

        // click login
        driver.findElement(By.xpath("//*[@id=\"login-button\"][@type='submit']")).click();

        // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String errorLogin = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();

       // driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3/button/svg")).getText();
        Assert.assertEquals(errorLogin, "Epic sadface: Username and password do not match any user in this service");

        // driver.close();
    }
}