package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignUp
{

    By signupbutton = By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a");

    By EmailID = By.id("email_create");
    By CreateanAccount = By.xpath("");

    WebDriver driver;

    public SignUp(WebDriver driver)
    {
        this.driver = driver;
    }

    public Women_Section addNewUser(String emailID)
    {
        driver.findElement(signupbutton).click();
        driver.findElement(EmailID).sendKeys(emailID);

        return PageFactory.initElements(driver, Women_Section.class);
    }

}
