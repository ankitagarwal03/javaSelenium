import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.ExcelRead;

import java.util.List;

public class OpenCartTest {
    static String browser;
    static ElementUtil elementUtil;

    public static void main(String [] args){

//        ExcelRead excelRead = new ExcelRead();
//        excelRead.readExcel("/src/main/resources/WMS.xlsx","wms","warehouseid");

        InitBrowser initBrowser = new InitBrowser();
        browser = "firefox";
        WebDriver driver = initBrowser.launchBrowser(browser);
        elementUtil = new ElementUtil(driver);
//        initBrowser.doGetUrl("https://www.amazon.com");
        initBrowser.doGetUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        String title = initBrowser.getTitle();
        System.out.println(title);
//        Validations.verifyText("Register Account",title);
//        getAllImageLink();
//        getAllLink();
        getAllPlaceholderText();

//        initBrowser.quit();
    }

    public static void getAllPlaceholderText(){
        By fName = By.id("input-firstname");
        By lName = By.id("input-lastname");
        By email = By.id("input-email");
        By telephone = By.id("input-telephone");
        By pass = By.id("input-password");
        By conPass = By.id("input-confirm");
        By checkbox = By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]");
        By continueButton = By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]");

        String fNameEl = elementUtil.doGetAttribute(fName,"placeholder");
        String lNameEl = elementUtil.doGetAttribute(lName,"placeholder");
        String emailEl = elementUtil.doGetAttribute(email,"placeholder");
        String telephoneEl = elementUtil.doGetAttribute(telephone,"placeholder");
        String passEl = elementUtil.doGetAttribute(pass,"placeholder");
        String conPassEl = elementUtil.doGetAttribute(conPass,"placeholder");

        System.out.println("fname placeHolder = "+fNameEl);
        System.out.println("lNameEl placeHolder = "+lNameEl);
        System.out.println("emailEl placeHolder = "+emailEl);
        System.out.println("telephoneEl placeHolder = "+telephoneEl);
        System.out.println("passEl placeHolder = "+passEl);
        System.out.println("conPassEl placeHolder = "+conPassEl);
        System.out.println("--------------------------------------");

        elementUtil.doSendKeys(fName,"ankit");
        elementUtil.doSendKeys(lName,"agarwal");
        elementUtil.doSendKeys(email,"an1@aa.com");
        elementUtil.doSendKeys(telephone,"9999990000");
        elementUtil.doSendKeys(pass,"123456");
        elementUtil.doSendKeys(conPass,"123456");

        System.out.println(elementUtil.doGetAttribute(fName,"value"));
        System.out.println(elementUtil.doGetAttribute(lName,"value"));
        System.out.println(elementUtil.doGetAttribute(email,"value"));
        System.out.println(elementUtil.doGetAttribute(telephone,"value"));
        System.out.println(elementUtil.doGetAttribute(pass,"value"));
        System.out.println(elementUtil.doGetAttribute(conPass,"value"));

        elementUtil.doClick(checkbox);
        elementUtil.doClick(continueButton);

        By successMsg = By.id("content");
        System.out.println("-================================");
        System.out.println(elementUtil.doGetText(successMsg));
    }

    public static void getAllImageLink(){
        By img = By.tagName("img");
        List<WebElement> li = elementUtil.doFindElements(img);
        System.out.println(li.size());
        for(WebElement l : li){

            System.out.println("SRC = "+l.getAttribute("src"));
            System.out.println("alt = "+l.getAttribute("alt"));
            System.out.println("-------------------------");
        }
    }

    public static void getAllLink(){
        By link = By.tagName("a");
        List<WebElement> li = elementUtil.doGetLinkText(link);
        System.out.println("total link on the page "+li.size());

        for(int i=0;i<li.size();i++){
            System.out.println(li.get(i).getText());
            System.out.println(li.get(i).getAttribute("href"));
            System.out.println("-------------------------");
        }
    }

}
