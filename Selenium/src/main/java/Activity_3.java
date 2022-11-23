import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_3 {

    public static void main(String args[]) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.training-support.net/selenium/simple-form");

        //print the title
        System.out.println("Title---"+driver.getTitle());

        //input field
        WebElement firstname=driver.findElement(By.id("firstName"));
        firstname.sendKeys("divya");
        WebElement lastname=driver.findElement(By.id("lastName"));
        lastname.sendKeys("raikar");
        driver.findElement(By.id("email")).sendKeys("divya.raikar@metlif.com");
        driver.findElement(By.id("number")).sendKeys("9898989898");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".ui.green.button")).click();

        driver.close();

    }
}
