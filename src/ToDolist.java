import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class ToDolist {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/rikeshgandharba/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        String[]names = {"Education","Skills","Hobbies","Experience"};
        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
        WebElement todolist = driver.findElement(By.tagName("input"));
        for(String name : names){
            todolist.sendKeys(name);
            todolist.sendKeys(Keys.RETURN);
            Thread.sleep(3000);

        }

    }


}
