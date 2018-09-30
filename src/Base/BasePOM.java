package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePOM
{

    public WebDriver driver = null;

    public BasePOM(WebDriver driver)
    {
        this.driver = driver;
    }

    public void highlightElment(WebDriver driver, By elementLocator) throws InterruptedException
    {
        WebElement elementinUI = driver.findElement(elementLocator);
        // draw a border around the found element
        if (driver instanceof JavascriptExecutor)
        {
            ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('style', 'border: 2px solid red;')",
                    elementinUI);
            wait(3000);
        }
    }

    public void click(By locator) throws InterruptedException
    {
        wait(3000);
        driver.findElement(locator).click();
    }

    private void wait(int time) throws InterruptedException
    {
        Thread.sleep(time);
    }

    public void sendKeys(String data, By locator) throws InterruptedException
    {
        wait(3000);
        driver.findElement(locator).sendKeys(data);
    }

}
