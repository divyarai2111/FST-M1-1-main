import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10_3 {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);
        driver.get("https://training-support.net/selenium/drag-drop");
        System.out.println("Title--" + driver.getTitle());

        //Find the ball and simulate a click and drag to move it into "Dropzone 1".
        //Verify that the ball has entered Dropzone 1.
        //Once verified, move the ball into "Dropzone 2".
        //Verify that the ball has entered Dropzone 2.
        //Once verified, close the browser.

        WebElement ball=driver.findElement(By.id("draggable"));
        WebElement drop1 = driver.findElement(By.id("droppable"));
        WebElement drop2 = driver.findElement(By.id("dropzone2"));

        action.dragAndDrop(ball,drop1).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop1, "background-color"));
        System.out.println("Ball in Zone1");

        action.dragAndDrop(ball,drop2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop2, "background-color"));
        System.out.println("Ball in Zone2");
        driver.close();
    }
}
