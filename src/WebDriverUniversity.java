import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class WebDriverUniversity {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/rikeshgandharba/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
        WebElement firstName = driver.findElement(By.name("first_name"));
        firstName.sendKeys("Rikesh");
        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("Gandharba");
        WebElement emailId = driver.findElement(By.name("email"));
        emailId.sendKeys("rikesh.gandharba@gmail.com");
        WebElement comments = driver.findElement(By.name("message"));
        comments.sendKeys("Please follow up at my email.");
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        submit.click();
    }
}
