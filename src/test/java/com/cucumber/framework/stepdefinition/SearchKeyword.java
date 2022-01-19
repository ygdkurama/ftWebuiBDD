package com.cucumber.framework.stepdefinition;


import com.cucumber.framework.helper.Logger.LoggerHelper;
import com.cucumber.framework.helper.PageObject.Pages.ReviewPage;
import com.cucumber.framework.settings.ObjectRepo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

/**
 * @author: Gordon.Yu
 * @date: 1/16/22 1:27 p.m.
 * @description:
 */
public class SearchKeyword {
    private ReviewPage reviewPage;
    private Logger oLog = LoggerHelper.getLogger(SearchKeyword.class);

    @Given("^: I am at the review page$")
    public void _i_am_at_the_review_page() throws Throwable {
        //String xx= ObjectRepo.reader.getWebsite()+"yyyyyy";
        oLog.info("开始打开网站");
        ObjectRepo.driver.get(ObjectRepo.reader.getWebsite());

        reviewPage = new ReviewPage(ObjectRepo.driver);
        ObjectRepo.data.put("ReviewPage", reviewPage);
    }

    @When("^: I type the \"(.*?)\" on search bar and click search button$")
    public void _i_click_on_the_searchbtn(String kw)
            throws Throwable {
        reviewPage.inputclear();
        reviewPage.inputkeyword(kw);
        reviewPage.clickbtn();
        Thread.sleep(1000);//等待内容加载
        List<WebElement> elelist = reviewPage.cards;
        for (int i = 0; i < elelist.size(); i++) {
            //Assert.assertEquals(keyword,);
            if (elelist.get(i).getText().contains(kw)) {
                oLog.info(kw+"在卡片中存在！！！！");
                continue;
            }
            else {
                break;
            }
        }

    }

    @Then("^: I should be at the specific search page$")
    public void _i_should_be_at_the_something_search_page_with_something(
            ) throws Throwable {
        Assert.assertEquals(reviewPage.showcards(),"9");
    }
}
