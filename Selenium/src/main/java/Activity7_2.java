import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_2 {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/dynamic-attributes");
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//input[contains(@class,'-username')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[contains(@class,'-password')]")).sendKeys("password");
        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[3]/input")).sendKeys("password");
        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[4]/input")).sendKeys("divya@gmail.com");
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/div[3]/div/div/button")).click();


        System.out.print("After text?---"+driver.findElement(By.id("action-confirmation")).getText());


        driver.close();

    }
}
