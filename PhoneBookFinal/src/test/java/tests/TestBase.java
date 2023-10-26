package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    WebDriver wd;

    @BeforeMethod
    public void preCondition() {

        // 1) open browser
        wd = new ChromeDriver();

        // 2) open link
        wd.navigate().to("https://telranedu.web.app/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterMethod
    public void tearDown() {
        // 7) driver quit
        wd.quit();
    }


    ////////////////////////////////////// ˅ service methods ˅ //////////////////////////////////////

    public void openLoginRegistrationForm() {
        WebElement loginTab = wd.findElement(By.cssSelector("a[href='/login']"));
        loginTab.click();
    }

    public void submitLogin() {
        wd.findElement(By.xpath("//button[1]")).click();
    }

    public void submitRegistration() {
        wd.findElement(By.xpath("//button[2]")).click();
    }

    public void fillLoginRegistrationForm(String email, String password) {
        //find + click + clear + sendKey
        type(By.xpath("//input[1]"), email);
        type(By.xpath("//input[2]"), password);
    }

    public void type(By locator, String text) {
        //find + click + clear + sendKey
        if (text != null) {
            WebElement elem = wd.findElement(locator);
            elem.click();
            elem.clear();
            elem.sendKeys(text);
        }
    }


    ////////////////////////////////////// ˄ service methods ˄ //////////////////////////////////////
}
