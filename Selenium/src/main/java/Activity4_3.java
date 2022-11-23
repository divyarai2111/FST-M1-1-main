import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity4_3 {

//    Find the third header on the page.
//    Find the fifth header on the page and get it's 'colour' CSS Property.
//    Find the violet button on the page and print all the class attribute values.
//    Find the grey button on the page with Absolute XPath.

    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.training-support.net/selenium/target-practice");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        String thirdHeader = driver.findElement(By.xpath("//*[@id=\"third-header\"]")).getText();
        System.out.println(thirdHeader);

        String fifthHeader=driver.findElement(By.xpath("//h5")).getCssValue("color");
        System.out.println(fifthHeader);

        String violetButtonClasses = driver.findElement(By.xpath("//button[contains(text(), 'Violet')]")).getAttribute("class");
        System.out.println(violetButtonClasses);

        String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
        System.out.println("Grey: " + greyButton);


        driver.close();

    }
}
