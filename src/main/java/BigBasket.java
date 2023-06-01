import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        InitBrowser initBrowser = new InitBrowser();
        driver = initBrowser.launchBrowser("firefox");
        initBrowser.doGetUrl("https://www.bigbasket.com/");
        Actions actions = new Actions(driver);

        ElementUtil el = new ElementUtil(driver);
        By mainMenu = By.xpath("//a[@qa='categoryDD']");
        By level1Menu = By.linkText("Beverages");
        By level2Menu = By.linkText("Tea");
        By clickMenu = By.linkText("Tea Bags");

        doClickMultiLevelMenu(actions, mainMenu, level1Menu, level2Menu, clickMenu);

        By mainMenu1 = By.xpath("//a[@qa='categoryDD']");
        By level1Menu1 = By.linkText("Bakery, Cakes & Dairy");
        By level2Menu1 = By.linkText("Gourmet Breads");
        By clickMenu1 = By.linkText("Bagels & Baguette");

        doClickMultiLevelMenu(actions, mainMenu1, level1Menu1, level2Menu1, clickMenu1);
    }

    public static void doClickMultiLevelMenu(Actions actions,By menuElement, By level1Menu,By level2Menu, By clickMenu) throws InterruptedException {
        // move to parent element
        doMoveToElement(actions, menuElement);

        // move to first parent element
        doMoveToElement(actions, level1Menu);

        // move to second parent element
        doMoveToElement(actions, level2Menu);

        // move and Click to last element
        doMoveToElementAndClick(actions, clickMenu);

    }

    public static void doMoveToElement(Actions actions,By element) throws InterruptedException {
        WebElement menu = driver.findElement(element);
        actions.moveToElement(menu).build().perform();
        Thread.sleep(2000);
    }

    public static void doMoveToElementAndClick(Actions actions, By element) throws InterruptedException {
        WebElement menu = driver.findElement(element);
        actions.moveToElement(menu).click().build().perform();
        Thread.sleep(4000);
    }

}
