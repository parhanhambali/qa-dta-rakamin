package tugasEnam.cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class login {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";

    @Given("User akses ke halaman web")
    public void userAksesKeHalamanWeb() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(baseUrl);

    }

    @When("User input username yang valid")
    public void userInputUsernameYangValid() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And("User input password yang valid")
    public void userInputPasswordYangValid() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("User klik tombol button login")
    public void userKlikTombolButtonLogin() {
        driver.findElement(By.xpath("//*[@id=\"login-button\"][@type='submit']")).click();
    }

    @Then("User masuk ke halaman web")
    public void userMasukKeHalamanWeb() {

    }

    @When("User input username yang invalid")
    public void userInputUsernameYangInvalid() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And("User input password yang invalid")
    public void userInputPasswordYangInvalid() {
        driver.findElement(By.id("password")).sendKeys("test12345");
    }

    @And("User klik button login")
    public void userKlikButtonLogin() {
        driver.findElement(By.xpath("//*[@id=\"login-button\"][@type='submit']")).click();
    }

    @Then("Website menampilkan pesan error")
    public void websiteMenampilkanPesanError() {
        String errorLogin = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
    }
}
