import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenWebsite {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/rikeshgandharba/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

    }
}
