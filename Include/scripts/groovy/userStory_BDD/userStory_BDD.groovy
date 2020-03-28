package userStory_BDD
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class userStory01 {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	@Given("I have entered the main page of carnival")
	def Homepage() {
		println "Homepage"


		WebUI.openBrowser('')

		WebUI.maximizeWindow()

		WebUI.navigateToUrl('https://www.carnival.com/')
	}



	@When("you select the Plan option located in the main menu")
	def SelectMenuFine(int value) {
		println "SelectMenuFine"

		WebUI.click(findTestObject('userStory01/div_View terms and conditions_vifp-sweeps-b_a8aa06'))

		WebUI.waitForElementClickable(findTestObject('userStory01/div_View terms and conditions_vifp-sweeps-b_a8aa06'), 0)

		WebUI.click(findTestObject('userStory01/span_Plan'))

		WebUI.click(findTestObject('userStory01/a_Find a Cruise'))
	}


	@Then("you should see at the top the query filter with the following fields: Sail To, Sail From, Dates, Duration")
	def HomePageFiltrer() {
		println "HomePageFiltrer"


		WebUI.verifyElementPresent(findTestObject('userStory01/span_The Bahamas from Baltimore MD'), 0)
	}
}