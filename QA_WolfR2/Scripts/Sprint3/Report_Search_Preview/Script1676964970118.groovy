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

//WebUI.openBrowser('')
//
//WebUI.navigateToUrl('https://qar2.wolfapprove.com/')
//
//WebUI.setText(findTestObject('Object Repository/testobj/Page_WOLF/ReportObj/input_Forgot Password_username'), 'wolf01@qar2.com')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/testobj/Page_WOLF/ReportObj/input_Forgot Password_password'), '/eWc8J9JFEG5WeA2mg7b1w==')
//
//WebUI.click(findTestObject('Object Repository/testobj/Page_WOLF/ReportObj/button_Sign In'))
WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/testobj/Page_WOLF/ReportObj/ReportNav'))

WebUI.setText(findTestObject('Object Repository/testobj/Page_WOLF/ReportObj/ClickReportTestName'), 'Re')

WebUI.verifyElementPresent(findTestObject('testobj/Page_WOLF/ReportObj/div_Report_Test_On_Katalon'), 0)

WebUI.click(findTestObject('Object Repository/testobj/Page_WOLF/ReportObj/div_Report_Test_On_Katalon'))

WebUI.click(findTestObject('Object Repository/testobj/Page_WOLF/ReportObj/ClickReportTestName'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/testobj/Page_WOLF/ReportObj/ClickReportTable_ReportTest'))

//
//WebUI.click(findTestObject('Object Repository/testobj/Page_WOLF/ReportObj/div_Memo_TemplateSubjectSearch by Memo_Temp_26bd9a'))
WebUI.delay(10)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.navigateToUrl('https://qar2.wolfapprove.com/Default')

WebUI.delay(3)

