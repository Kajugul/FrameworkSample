package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Women_Section
{

    WebDriver driver;
    By womenXpath = By.xpath("//*[@id='block_top_menu']/ul/li[1]/a");

    public Women_Section(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
    public WebElement womenTab;

    public void clickWomenSectionTab()
    {
        driver.findElement(womenXpath).click();
    }
}
