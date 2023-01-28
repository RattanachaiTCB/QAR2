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

WebUI.navigateToUrl('https://qar2.wolfapprove.com/Default')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_WOLF/svg'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/span_To Do List'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/div_In Process'))

WebUI.click(findTestObject('Page_WOLF/p_KTL-ACT01-2023-000004'))

WebUI.click(findTestObject('Page_WOLF/button_Recall'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_WOLF/p_'))

'input comment'
WebUI.click(findTestObject('Page_WOLF/p'))

WebUI.setText(findTestObject('Page_WOLF/body_Recall'), 'Recall')

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Confirm'))

'status recall in request page'
WebUI.click(findTestObject('Object Repository/Page_WOLF/span_Recall'))

'check status recall in form'
WebUI.verifyElementText(findTestObject('Object Repository/Page_WOLF/span_Recall'), '')

