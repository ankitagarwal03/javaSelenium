import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class JqueryDropDown {
    static WebDriver driver;
    static ElementUtil elementUtil;
    public static void main(String[] args){

        InitBrowser initBrowser = new InitBrowser();
        driver = initBrowser.launchBrowser("chrome");
//        initBrowser.doGetUrl("https://www.google.com");
//        initBrowser.doGetUrl("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        initBrowser.doGetUrl("https://www.espncricinfo.com/series/indian-premier-league-2023-1345038/chennai-super-kings-vs-rajasthan-royals-17th-match-1359491/full-scorecard");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("======================================================");
        System.out.println(initBrowser.getTitle());

        elementUtil = new ElementUtil(driver);

//        multiSelectDropdown();
//        multiSelectCascadeDropdown();
        cricBuzz();
        getScoreCard();

    }
    public static void cricBuzz(){
        By name = By.xpath("//span[text()='Yashasvi Jaiswal']/ancestor::tr/td/span/span");
        System.out.println("player name = "+driver.findElement(name).getText());
    }
    public static void getScoreCard(){
        By scoreCard = By.xpath("//span[text()='Yashasvi Jaiswal']/ancestor::td/following-sibling::td[contains(@class,'ds-whitespace-nowrap')]");
        List<WebElement> scoreList = driver.findElements(scoreCard);
        for(WebElement sc: scoreList){
            System.out.println(sc.getText());
        }
    }

    public static void multiSelectCascadeDropdown(){
        By dropdownMulti = By.id("justAnInputBox1");
        elementUtil.doClick(dropdownMulti);

        By multiSelect = By.xpath("(//div[@class='comboTreeDropDownContainer'])[2]//li/span");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String[] multiSelectOptionArr = {"choice 1","choice 2","choice 3","choice 6"};
//        String[] multiSelectOptionArr = {"all"};
        elementUtil.multiSelectDropDown(multiSelect, multiSelectOptionArr);

    }

    public static void multiSelectDropdown(){
        By dropdownMulti = By.id("justAnInputBox");
        elementUtil.doClick(dropdownMulti);

        By multiSelect = By.xpath("(//div[@class='comboTreeWrapper'])[1]//li/span");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String[] multiSelectOptionArr = {"choice 1","choice 2 2","choice 3","choice 6 2 1"};
//        String[] multiSelectOptionArr = {"all"};
        elementUtil.multiSelectDropDown(multiSelect, multiSelectOptionArr);
    }


}
