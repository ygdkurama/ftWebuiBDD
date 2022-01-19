package com.cucumber.framework.cases;

import com.cucumber.framework.helper.PageObject.Pages.ReviewPage;

import com.cucumber.framework.settings.ObjectRepo;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class TestCase1 {
    //WebDriver driver;

    @Test(description = "测试用例1")//测试展示9个卡片
    public void getCards() throws Exception {


        ReviewPage reviewPage = new ReviewPage(ObjectRepo.driver);
        //reviewPage.showcards();
        Assert.assertEquals(reviewPage.showcards(),"9");

//        ReviewPage reviewPage = new ReviewPage(driver,"Review","dianpingH5.xml");
//        List<WebElement> elelist = testPage.getElements("展示卡片");
//        String listcount = String.valueOf(elelist.size());
//        Assert.assertEquals(listcount,"9");
    }

    @BeforeClass
    public void beforeClass() throws Exception {

//        PropertyFileReader pf =new PropertyFileReader();
//
//        InitializeWebDrive  iwd = new InitializeWebDrive(pf);
//        iwd.setUpDriver(pf.getBrowser());
//
//        ObjectRepo.driver.get(ObjectRepo.reader.getWebsite());


    }

    @AfterClass
    public void afterClass() {
        ObjectRepo.driver.quit();
    }
}
