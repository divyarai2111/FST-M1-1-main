import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11_2 {
    public static  void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        System.out.println("Title--" + driver.getTitle());

        //Use findElement() to find the button to open a CONFIRM alert and click it.
        //Switch the focus from the main window to the Alert box and get the text in it and print it.
        //Close the alert once with alert.accept() and again with alert.dismiss()
        //Finally, close() the browser.

        driver.findElement(By.cssSelector("button#confirm")).click();
        Alert confirmAlert = driver.switchTo().alert();
        String alertText = confirmAlert.getText();
        System.out.println("Alert text is: " + alertText);
        confirmAlert.accept();
        driver.close();
    }
}
