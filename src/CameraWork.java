import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class CameraWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/rikeshgandharba/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Digital Camera");
        searchBox.submit();



    }
}
