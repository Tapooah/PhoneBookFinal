package manager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HelperUser extends HelperBase {

    public HelperUser(WebDriver wd) {
        super(wd);
    }

    ////////////////////////////////////// ˅ service methods ˅ //////////////////////////////////////

    public void openLoginRegistrationForm() {
        wd.findElement(By.cssSelector("a[href='/login']")).click();
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

    public boolean isLogged() {
        List<WebElement> list = wd.findElements(By.xpath("//button[text()='Sign Out']"));
        return !list.isEmpty(); //list.size()>0;
    }

    public void logout() {
        click(By.xpath("//button[text()='Sign Out']"));
    }

    public boolean isAlertDisplayed() {
        //wait for alert
        Alert alert = new WebDriverWait(wd, Duration.ofSeconds(5))
                .until(ExpectedConditions.alertIsPresent());
        //is alert present
        if (alert == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isErrorFormatDisplayed() {
        Alert alert = wd.switchTo().alert();
//        for example:
//        alert.getText();//get text from alert
//        alert.sendKeys("hello world");//type text in alert
//        alert.accept();//click on OK button
//        alert.dismiss();//click on CANCEL button
        String errorText = alert.getText();
        System.out.println(errorText);
        alert.accept();
        return errorText.contains("Wrong email or password");
    }


    ////////////////////////////////////// ˄ service methods ˄ //////////////////////////////////////
}
