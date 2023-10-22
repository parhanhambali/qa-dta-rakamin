package tugasEnam.cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class login {
    WebDriver driver;
    String baseUrl = "https://www.saucedemo.com/";

    @Given("User akses ke halaman web")
    public void user_akses_ke_halaman_web() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(baseUrl);

        String loginTitle = driver.findElement(By.xpath("//div[contains(text(), 'Swag Labs')]")).getText();
        Assert.assertEquals("Swag Labs", loginTitle);
        // driver.close();
    }

    @When("User input username yang valid")
    public void user_input_username_yang_valid() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And("User input password yang valid")
    public void user_input_password_yang_valid() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("User klik tombol button login")
    public void user_klik_tombol_button_login() {
        driver.findElement(By.xpath("//*[@id=\"login-button\"][@type='submit']")).click();
    }

    @Then("User masuk ke halaman web")
    public void user_masuk_ke_halaman_web() {

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

    @And("User klik button about")
    public void userKlikButtonAbout() {
        //driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[2]")).click();
        driver.get("https://saucelabs.com/");
    }

    @Then("User masuk ke halaman about")
    public void userMasukKeHalamanAbout() {

    }

    @And("User klik button add to cart")
    public void userKlikButtonAddToCart() {
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
    }

    @And("User klik icon keranjang")
    public void userKlikIconKeranjang() {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    }

    @And("User klik button checkout")
    public void userKlikButtonCheckout() {
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
    }

    @And("User input first name")
    public void userInputFirstName() {
        driver.findElement(By.id("first-name")).sendKeys("parhan");
    }

    @And("User input last name")
    public void userInputLastName() {
        driver.findElement(By.id("last-name")).sendKeys("hambali");
    }

    @And("User input postal code")
    public void userInputPostalCode() {
        driver.findElement(By.id("postal-code")).sendKeys("12220");
    }

    @And("User klik button continue")
    public void userKlikButtonContinue() {
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
    }

    @And("User klik button finish")
    public void userKlikButtonFinish() {
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
    }

    @And("User klik button back home")
    public void userKlikButtonBackHome() {
        driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();
    }

    @And("User klik hamburger menu")
    public void userKlikHamburgerMenu() {
        driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
    }

    @Then("User kembali ke halaman web")
    public void userKembaliKeHalamanWeb() {
    }

    @And("User klik button logout")
    public void userKlikButtonLogout() {
        driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
    }
}
