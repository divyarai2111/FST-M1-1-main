import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {
    //For this activity import the following classes
    //org.openqa.selenium.support.ui.ExpectedConditions
    //org.openqa.selenium.support.ui.WebDriverWait
    //Create a WebDriver instance, named driver, with the FirefoxDriver().
    //Open a browser with https://training-support.net/selenium/dynamic-controls
    //Get the title of the page using driver.getTitle() and print out the title.
    //Find the checkbox toggle button and click it.
    //Wait till the checkbox disappears.
    //Click the button again. Wait till it appears and check the checkbox.
    //Finally, close the browser.

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());

        WebElement checkbox = driver.findElement(By.xpath("//div[@id='dynamicCheckbox']/input"));
        WebElement toggleCheckboxButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
        toggleCheckboxButton.click();
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        toggleCheckboxButton.click();
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        checkbox.click();
        driver.close();

    }
}
