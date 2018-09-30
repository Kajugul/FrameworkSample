package TC_Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeMain
{
    static XSSFWorkbook workbook = null;
    static File file = null;

    public static void main(String[] args) throws IOException
    {

        String credentialsFilePath = "C:\\Users\\kajugul\\Desktop\\Credentials.xlsx";

        try
        {

            file = new File(credentialsFilePath);

            FileInputStream fileInputStream = new FileInputStream(file);

            workbook = new XSSFWorkbook(fileInputStream);

            XSSFSheet sheet = workbook.getSheet("Sheet1");

            for (int i = 0; i < sheet.getLastRowNum(); i++)
            {
                System.out.println(sheet.getRow(i).getCell(i).getStringCellValue());
            }

        } catch (Exception e)
        {
            e.printStackTrace();
        } finally
        {
            workbook.close();
        }

    }
}
