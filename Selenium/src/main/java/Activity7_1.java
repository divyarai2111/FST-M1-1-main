import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {

    public static void main(String args[]) throws InterruptedException {
        //Create a Class and a main() method
        //Create a WebDriver instance, named driver, with the FirefoxDriver().
        //Open a browser with https://training-support.net/selenium/dynamic-attributes
        //Get the title of the page using driver.getTitle() and print out the title.
        //Find the username and password input fields. Type in the credentials:
        //username: admin
        //password: password
        //Wait for login message to appear and print the login message to the console.
        //Finally, close the browser.

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[1]/input")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[2]/input")).sendKeys("password");
        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/button")).click();


        Thread.sleep(5000);
        String message=driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]")).getText();
        System.out.print(message);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"action-confirmation\"]"),message));
        driver.close();
    }
}
