import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.carnival.com/')

WebUI.click(findTestObject('userStory01/div_View terms and conditions_vifp-sweeps-b_a8aa06'))

WebUI.waitForElementClickable(findTestObject('userStory01/div_View terms and conditions_vifp-sweeps-b_a8aa06'), 0)

WebUI.click(findTestObject('userStory01/span_Plan'))

WebUI.click(findTestObject('userStory01/a_Find a Cruise'))

WebUI.click(findTestObject('userStory01/a_Sail To'))

WebUI.click(findTestObject('userStory01/button_The Bahamas'))

WebUI.click(findTestObject('userStory01/a_Duration'))

WebUI.click(findTestObject('userStory01/button_6 - 9 Days'))

WebUI.click(findTestObject('userStory01/span_Duration_cdc-filters-tab-link-chevron'))

WebUI.click(findTestObject('userStory01/span_11 results'))

WebUI.click(findTestObject('userStory01/span_Pricing'))

WebUI.click(findTestObject('userStory01/div_400 800 500 800'))

WebUI.click(findTestObject('userStory01/div_400 800 500 720'))

WebUI.click(findTestObject('userStory01/span_5 results'))

WebUI.click(findTestObject('userStory01/span_Pricing'))

WebUI.verifyElementPresent(findTestObject('userStory01/span_The Bahamas from Baltimore MD'), 0)

WebUI.verifyElementPresent(findTestObject('userStory01/Price639_Baltimore'), 10)

not_run: WebUI.closeBrowser()

