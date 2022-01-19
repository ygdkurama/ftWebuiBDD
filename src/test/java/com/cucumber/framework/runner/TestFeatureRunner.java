package com.cucumber.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


/**
 * @author: Gordon.Yu
 * @date: 1/16/22 1:25 p.m.
 * @description:
 */

//@CucumberOptions(features = { "classpath:featurefile/Test.feature" }, glue = {
@CucumberOptions(features = { "src/test/resources/featurefile/TestReviewPage.feature" }, glue = {
        "classpath:com.cucumber.framework.stepdefinition" }, monochrome = true,plugin = { "pretty",
        "json:target/TestFeatureRunner.json" })
public class TestFeatureRunner extends AbstractTestNGCucumberTests {
}
