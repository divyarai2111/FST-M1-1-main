import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity11_4 {

    public static  void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions action = new Actions(driver);
        driver.get("https://www.training-support.net/selenium/tab-opener");
        System.out.println("Title--" + driver.getTitle());
        System.out.println("Current Handle--"+driver.getWindowHandle());

        //Print the Page Title and Handle of that tab.
        //Find the button to open a new tab and click it.

        driver.findElement(By.id("launcher")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        System.out.println("After window Handle--"+driver.getWindowHandles());

        //Wait for the new tab to open.
        //Print all the handles.
        //Switch to the newly opened tab, print it's title and heading.

        for(String handle: driver.getWindowHandles())
            driver.switchTo().window(handle);

        wait.until(ExpectedConditions.titleIs("Newtab"));
        String newTabText = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("New tab heading is: " + newTabText);

        driver.findElement(By.linkText("Open Another One!")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));

        //Make sure the new tab's handle is part of the handles set
        Set<String> allWindowHandles = driver.getWindowHandles();
        allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles: " + allWindowHandles);

        //Loop through the handles set till we get to the newest handle
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        //Print the handle of the current window
        System.out.println("New tab handle: " + driver.getWindowHandle());

        //Wait for the newest tab to load completely
        wait.until(ExpectedConditions.titleIs("Newtab2"));

        //Print New Tab Title
        System.out.println("New Tab Title is: " + driver.getTitle());

        //Get heading on new page
        newTabText = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("New tab heading is: " + newTabText);
        //Repeat steps 6-8 by clicking the button on the new tab.
        //Finally, close both windows using quit().
        driver.quit();
    }

}
