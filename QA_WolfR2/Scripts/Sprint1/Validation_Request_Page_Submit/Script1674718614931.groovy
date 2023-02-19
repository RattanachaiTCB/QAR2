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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//login
/*WebUI.callTestCase(findTestCase('Login Pass'), [:], FailureHandling.STOP_ON_FAILURE)*/

WebUI.delay(3)

//WebUI.waitForPageLoad(5)
//check verify save button
WebUI.click(findTestObject('Page_WOLF/button_Submit'))
WebUI.click(findTestObject('Page_WOLF/button_Confirm'))

//check url
WebUI.verifyNotEqual(WebUI.getUrl(), 'https://qar2.wolfapprove.com/Default', FailureHandling.STOP_ON_FAILURE)
WebUI.verifyEqual(WebUI.getUrl(), 'https://qar2.wolfapprove.com/Request?MemoID=0&template=121')

//verify field
WebUI.verifyElementVisible(findTestObject('Page_WOLF/small_is required'))
WebUI.click(findTestObject('Page_WOLF/input'))
WebUI.click(findTestObject('Page_WOLF/a_Today'))

//click select company
WebUI.click(findTestObject('Page_WOLF/input_company'))
WebUI.click(findTestObject('Page_WOLF/td_TCB'))

//click button
WebUI.click(findTestObject('Page_WOLF/button_Submit'))
WebUI.click(findTestObject('Page_WOLF/button_Confirm'))

