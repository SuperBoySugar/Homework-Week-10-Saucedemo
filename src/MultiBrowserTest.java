import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiBrowserTest {

     static String browser = "Edge";
     static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong browser name");
        }
        driver.manage().window().maximize();

        String baseUrl = "https://www.saucedemo.com/";
        // Open the Url
        driver.get(baseUrl);
        // print the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        // Print current Url
        System.out.println("Current Url: " + driver.getCurrentUrl());
        // Get the page source
        System.out.println("Page source: " + driver.getPageSource());
        // Enter email to email field
        WebElement usernamefield = driver.findElement(By.id("user-name"));
        usernamefield.sendKeys("locked_out_user");
        // Enter password to password field
        WebElement passwordfield = driver.findElement(By.id("password"));
        passwordfield.sendKeys("secret_sauce");

    }
}
