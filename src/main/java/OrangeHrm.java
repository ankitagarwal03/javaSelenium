import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.*;

public class OrangeHrm {
    static WebDriver driver;
    public static void main(String[] aegs) throws InterruptedException {
        InitBrowser initBrowser = new InitBrowser();
        driver = initBrowser.launchBrowser("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        System.out.println("timeout = "+driver.manage().timeouts().getImplicitWaitTimeout());
        ElementUtil elementUtil = new ElementUtil(driver);

        initBrowser.doGetUrl("https://opensource-demo.orangehrmlive.com/");
        System.out.println("first print = "+initBrowser.getTitle());

//        String parentWindow = driver.getWindowHandle();
//        Thread.sleep(3000);
        By youtube = By.xpath("//a[contains(@href, 'youtube')]");
//        By twitter = By.xpath("//a[contains(@href, 'twitter')]");
//        By facebook = By.xpath("//a[contains(@href, 'facebook')]");
//        By linkedin = By.xpath("//a[contains(@href, 'linkedin')]");
//
//        elementUtil.doClick(youtube);
//        elementUtil.doClick(twitter);
//        elementUtil.doClick(facebook);
//        elementUtil.doClick(linkedin);
//
//        Set<String> st = driver.getWindowHandles();
//
//        Iterator<String> it = st.iterator();
//        while(it.hasNext()){
//            String childWindow = it.next();
//            if(!(childWindow.equals(parentWindow))) {
//                driver.switchTo().window(childWindow);
//                System.out.println("Print title of the Page " + driver.getTitle());
//                Thread.sleep(1000);
//                driver.close();
//            }
//        }
//
//        driver.switchTo().window(parentWindow);
//        System.out.println("again back to the parent "+driver.getTitle());

    }



}
