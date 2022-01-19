package com.cucumber.framework.helper.PageObject.Pages;

import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.PageObject.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ReviewPage extends PageBase {

    private WebDriver driver;
    private final Logger log = LoggerHelper.getLogger(ReviewPage.class);

    public ReviewPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    /** Web Elements */

    @FindBy(how=How.CLASS_NAME,using="card_listReviewCard__QvHn6")
    public List<WebElement> cards ;

    @FindBy(how=How.XPATH,using="/html/body/div/div[3]/main/div[2]/div[1]/input")
    public WebElement inputtxtbox;

    @FindBy(how=How.XPATH,using="/html/body/div/div[3]/main/div[2]/div[1]/button")
    public WebElement searchbtn;

    public WebDriver getDriver() {
        return this.driver;
    }

    public String showcards() {
        return String.valueOf(cards.size());
    }

    public void inputkeyword(String keyword){
        inputtxtbox.sendKeys(keyword);
    }

    public void inputclear() {
        inputtxtbox.clear();
    }

    public void clickbtn(){
        searchbtn.click();
    }



}
