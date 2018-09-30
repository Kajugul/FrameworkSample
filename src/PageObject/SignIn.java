package PageObject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Base.BasePOM;

public class SignIn extends BasePOM
{

    public SignIn(WebDriver driver)
    {
        super(driver);
    }

    String credentialsFilePath = "C:\\Users\\kajugul\\Desktop\\Credentials.xlsx";

    public SignIn signInClicking() throws InterruptedException
    {
        By xpath = By.cssSelector("div.header_user_info > a");

        highlightElment(driver, xpath);
        click(xpath);
        return PageFactory.initElements(driver, SignIn.class);

    }

    public SignIn doSignIn() throws InterruptedException
    {
        By username = By.id("email");
        By password = By.name("passwd");

        By loginButton = By.id("SubmitLogin");

        highlightElment(driver, username);
        sendKeys("hacker.haku@gmail.com", username);

        highlightElment(driver, password);
        sendKeys("hackerhaku", password);

        highlightElment(driver, loginButton);
        click(loginButton);

        return PageFactory.initElements(driver, SignIn.class);
    }

    public void validateUserfromSheet() throws IOException
    {

        FileInputStream file = new FileInputStream(new File(credentialsFilePath));
        HSSFWorkbook workbook = new HSSFWorkbook(file);

        HSSFSheet sheet = workbook.getSheetAt(0);

        String heading = sheet.getRow(0).getCell(0).getStringCellValue();

        String searchText1 = sheet.getRow(1).getCell(0).getStringCellValue();

        String searchText2 = sheet.getRow(2).getCell(0).getStringCellValue();

        System.out.println("Heading is:" + heading);

        System.out.println("Search Text 1 is:" + searchText1);

        System.out.println("Search Text 2 is:" + searchText2);

        file.close();

    }
}
