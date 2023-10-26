package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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


    ////////////////////////////////////// ˄ service methods ˄ //////////////////////////////////////
}
