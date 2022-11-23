import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class Activity10_1 {

    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action=new Actions(driver);
        driver.get("https://www.training-support.net/selenium/input-events");
        System.out.println("Title--" + driver.getTitle());

        //Left click and print the value of the side in the front.
        //Double click to show a random side and print the number.
        //Right click and print the value shown on the front of the cube.

        WebElement cube=driver.findElement(By.id("wrapD3Cube"));
        action.click(cube).build().perform();
        System.out.print("\nClick "+driver.findElement(By.className("active")).getText());
        action.doubleClick(cube).build().perform();
        System.out.print("\nDouble Click "+driver.findElement(By.className("active")).getText());
        action.contextClick(cube).build().perform();
        System.out.print("\nRight Click "+driver.findElement(By.className("active")).getText());

        Thread.sleep(5000);
        driver.close();
    }
}
