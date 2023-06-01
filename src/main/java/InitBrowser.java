import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import utils.MyException;

public class InitBrowser {

    WebDriver driver;

    /**
     * This is used to initialize the driver instance by passing the browser type
     * @param browser
     * if blank or null throw exception
     */
    public WebDriver launchBrowser(String browser){
        if(browser.equals("")){
            System.out.println("Incorrect Browser pass");
            throw new MyException("Browser is blank");
        }
        if(browser == null){
            System.out.println("Null Browser pass");
            throw new MyException("Browser is null");
        }
        switch (browser.toLowerCase().trim()){
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                System.out.println("invalid browser passed");
                break;
        }
        driver.manage().window().maximize();
        return driver;
    }

    /**
     *
     * @param url
     */
    public void doGetUrl(String url){
        if(url.contains("http")) {
            driver.get(url);
        }
        else{
            throw new MyException("InvalidURL");
        }
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public void quit(){
        driver.quit();
    }



}
