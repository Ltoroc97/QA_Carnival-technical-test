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

WebUI.click(findTestObject('Object Repository/userStory02/a_Learn More'))

WebUI.verifyElementPresent(findTestObject('Object Repository/userStory02/span_The Bahamas From Baltimore MD'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/userStory02/span_Itinerary'), 0)

WebUI.click(findTestObject('Object Repository/userStory02/span_Learn More'))

WebUI.click(findTestObject('Object Repository/userStory02/button_Next'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('userStory02/button_A baseball sitting on green grass in Baltimore MD - Slide Number 2 of 4'))

WebUI.verifyElementPresent(findTestObject('Object Repository/userStory02/h2_I TAKE SPORTS VERY SERIOUSLY'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/userStory02/span_Book Now'), 0)

not_run: WebUI.closeBrowser()

