import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementUtil {
    private WebDriver driver;

    /**
     * create constructor of this to initialize the driver
     * @param driver
     */
    public ElementUtil(WebDriver driver){
        this.driver = driver;
    }

    public void doSendKeys(By locator, String value){
        doFindElement(locator).sendKeys(value);
    }

    public void doClick(By locator){
        doFindElement(locator).click();
    }

    public String doGetText(By locator){
        return doFindElement(locator).getText();
    }

    public List<WebElement> doGetTexts(By locator){
        return doFindElements(locator);
    }

    public String doGetAttribute(By locator, String attribute){
        return doFindElement(locator).getAttribute(attribute);
    }

    public WebElement doFindElement(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> doFindElements(By locator){
        List<WebElement> li = driver.findElements(locator);
        return li;
    }

    public List<WebElement> doGetLinkText(By locator){
        List<WebElement> li = doFindElements(locator);
        return li;
    }

    public void multiSelectDropDown(By locator, String[] targetText){
        List<WebElement> multiList = doFindElements(locator);
        Map<String, Boolean> mp = new HashMap<String, Boolean>();

        if(!multiList.isEmpty()){
            if(targetText[0].equalsIgnoreCase("all")){
//                System.out.println("111111");
                for(WebElement li : multiList){
//                    System.out.println(li.getText().equalsIgnoreCase("−"));
//                    System.out.println("text = "+li.getText());
                    if(!li.getText().equalsIgnoreCase("−")) {
                        li.click();
                    }
                }
                return;
            }
            else {
                for (WebElement li : multiList) {
                    String dropDownText = li.getText();
//                System.out.println("drop down text Is = "+dropDownText);
                    for (int i = 0; i < targetText.length; i++) {
                        if (dropDownText.equalsIgnoreCase(targetText[i])) {
                            li.click();
                            System.out.println(li.getText());
                            break;
                        }
                    }
                }
            }
//            for (WebElement li : multiList) {
//                mp.put(li.getText(), li.isSelected());
//            }
//            System.out.println(mp);
        }
    }


}
