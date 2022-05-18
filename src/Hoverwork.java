
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class Hoverwork {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://webdriveruniversity.com/");

            driver.manage().window().maximize();

            driver.findElement(By.xpath("//*[@id=\"scrolling-around\"]")).click();

            ArrayList tabs = new ArrayList(driver.getWindowHandles());
            driver.switchTo().window((String) tabs.get(1));
            WebElement ele = driver.findElement(By.xpath("//*[@id=\"zone1\"]"));

//Creating object of an Actions class
            Actions action = new Actions(driver);
            Thread.sleep(5000);
//Performing the mouse hover action on the target element.
            action.moveToElement(ele).perform();

        }
    }
}
