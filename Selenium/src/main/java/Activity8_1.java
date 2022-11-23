import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity8_1 {

    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/tables");
        System.out.println(driver.getTitle());


        //Use findElements() in combination with xpath() to find the number of columns and rows (not counting the table header) and print them.
        //Find and print the all the cell values of the third row of the table.
        //Find and print the cell value at the second row and second column.
        //Close the browser.

        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[1]/td"));
        System.out.println(cols.size());

        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr"));
        System.out.println(rows.size());

        List<WebElement> row3=(driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[3]/td")));
        for(WebElement row : row3){
            System.out.print(row.getText()+"--");
        }

        System.out.println(driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/table/tbody/tr[2]/td[2]")).getText());

        driver.close();




    }
}
