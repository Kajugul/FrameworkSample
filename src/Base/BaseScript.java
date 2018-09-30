package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseScript
{
    public WebDriver driver = null;

    String URL = "http://automationpractice.com/index.php";

    @BeforeTest
    public void BrowserSetup()
    {
        System.setProperty("webdriver.chrome.driver",
                "G://automation software database//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

        
    }

    @AfterTest
    public void closeSetup() throws InterruptedException
    {
        Thread.sleep(3000);
        Reporter.log("Closing browser...");
        driver.quit();
        System.out.println("Closing the browser- shutdown.");
    }

}
