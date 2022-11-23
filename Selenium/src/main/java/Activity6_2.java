import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {

    public static void main(String args[]){
        //Create a Class and a main() method
        //Create a WebDriver instance, named driver, with the FirefoxDriver().
        //Open a browser with https://training-support.net/selenium/ajax
        //Get the title of the page using driver.getTitle() and print out the title.
        //Find and click the "Change content" button on the page.
        //Wait for the text to say "HELLO!". Print the message that appears on the page.
        //Wait for the text to change to contain "I'm late!". Print the new message on the page.
        //Finally, close the browser.

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/ajax");
        System.out.println(driver.getTitle());
        driver.findElement(By.cssSelector(".ui.violet.button")).click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"ajax-content\"]"),"HELLO!"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"ajax-content\"]")).getText());
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"ajax-content\"]"),"I'm late!"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"ajax-content\"]")).getText());

        driver.close();
    }
}
