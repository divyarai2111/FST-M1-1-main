import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class Activity10_2 {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Title--" + driver.getTitle());

        //Press the key of your first name in caps
        //Press CTRL+a and the CTRL+c to copy all the text on the page.
        //(Paste the text in a text editor to verify results.)
        WebElement pressedKey = driver.findElement(By.id("keyPressed"));
        action.sendKeys("D").build().perform();

        String enteredText=pressedKey.getText();
        System.out.println("Entered Text1--"+pressedKey.getText());
        action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        System.out.println("Entered Text1--"+pressedKey.getText());


        driver.close();


    }
}
