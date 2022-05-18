import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClickclassWork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/rikeshgandharba/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
        WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
        searchbox.click();
        Thread.sleep(3000);
        WebElement button = driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
        button.click();
        driver.close();





    }
}

