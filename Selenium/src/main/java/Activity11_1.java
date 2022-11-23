import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLSyntaxErrorException;
import java.time.Duration;

public class Activity11_1 {

    public static  void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Title--" + driver.getTitle());

        //accept() - To accept the alert. Same as clicking "OK"
        //dismiss() - To dismiss the alert. Same as clicking "Cancel"
        //getText() - To get the text of the alert
        //sendKeys() -To write some text to the alert

        driver.findElement(By.cssSelector("button#simple")).click();
        Alert alert=driver.switchTo().alert();
        System.out.println("Alter Text-- "+alert.getText());
        alert.accept();

        driver.findElement(By.cssSelector("button#simple")).click();
        driver.switchTo().alert();
        alert.dismiss();


        driver.close();
    }
}
