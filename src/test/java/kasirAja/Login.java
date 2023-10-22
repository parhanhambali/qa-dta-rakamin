package kasirAja;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    @Test
    public void success_login(){
        WebDriver driver;
        String baseUrl = "https://kasirdemo.belajarqa.com/";

        WebDriverManager.chromedriver().setup();

        // apply chrome driver setup
        // Membuka halama login
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

        // input email
        driver.findElement(By.id("email")).sendKeys("tdd-selenium@gmail.com");

        // input password
        driver.findElement(By.id("password")).sendKeys("tdd-selenium");

        // click login
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
