import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class Newwork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/rikeshgandharba/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://bishworaj100.github.io/reactloginapp/");
        WebElement userName = driver.findElement(By.id("mui-1"));
        userName.sendKeys("admin");
        WebElement password = driver.findElement(By.id("mui-2"));
        password.sendKeys("admin");
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();


    }
}
