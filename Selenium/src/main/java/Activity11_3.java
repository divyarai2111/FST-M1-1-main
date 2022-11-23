import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11_3 {
    public static  void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Title--" + driver.getTitle());

        //Also use findElement() to find the button to open a PROMPT alert and click it.
        //Switch the focus from the main window to the Alert box.
        //Use sendKeys() to type in "Yes, you are!".
        //Close the alert with alert.accept().
        //Finally, close() the browser.
        driver.findElement(By.cssSelector("button#prompt")).click();
        Alert promptAlert = driver.switchTo().alert();
        String alertText = promptAlert.getText();
        System.out.println("Alert text is: " + alertText);
        promptAlert.sendKeys("Yes, you are!");

        promptAlert.accept();

        driver.close();
    }

}
