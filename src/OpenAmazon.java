import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileWriter;
public class OpenAmazon {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/rikeshgandharba/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        System.out.println();
        try {
            FileWriter myWriter = new FileWriter("site.txt");
            myWriter.write("https://www.amazon.com/");
            myWriter.close();
            System.out.println("Tittle successful.");
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }

    }


