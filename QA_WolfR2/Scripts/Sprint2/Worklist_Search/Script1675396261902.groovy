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
WebUI.navigateToUrl('https://qar2.wolfapprove.com/Default')
WebUI.delay(2)
WebUI.click(findTestObject('Page_WOLF/svg'))
WebUI.setText(findTestObject('Page_WOLF/input_Department_search'), 'AC01')
WebUI.delay(2)
WebUI.click(findTestObject('Page_WOLF/a_AC01-2023-000017'))
WebUI.verifyElementText(findTestObject('Page_WOLF/p_AC01  - Petty Cash Voucher'), 'AC01: แบบฟอร์มเบิกเงินสดย่อย - Petty Cash Voucher')
//WebUI.closeBrowser()

