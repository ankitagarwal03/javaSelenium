import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AmazonTest {
    static WebDriver driver;
    public static void main(String[] args){
        InitBrowser b = new InitBrowser();
        driver = b.launchBrowser("firefox");
        b.doGetUrl("https://www.amazon.com/");
        String title = b.getTitle();
        System.out.println(title);
        getFooterLink();

    }

    public static void getFooterLink(){
        ElementUtil eUtil = new ElementUtil(driver);
        By footer = By.cssSelector("td.navFooterDescItem");
        List<WebElement> li = eUtil.doGetTexts(footer);
        for(WebElement e : li){
            if(e.getText().length()>0) {
                System.out.print(e.getText().length());
                System.out.println(" "+e.getText());
            }
        }
    }

}
