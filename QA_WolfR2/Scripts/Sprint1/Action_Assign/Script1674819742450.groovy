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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qar2.wolfapprove.com/')

WebUI.setText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_username'), 'pornpan@qar2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_password'), '/eWc8J9JFEG5WeA2mg7b1w==')

WebUI.sendKeys(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_WOLF/p_KTL-ACT01-2023-000001'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_WOLF/span_Wait for Approve'), 'Wait for Approve')

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Assign'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/p (2)'))

WebUI.setText(findTestObject('Page_WOLF/body_Assign'), 'Assign')

'*'
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_WOLF/p_'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Confirm'))

WebUI.setText(findTestObject('Object Repository/Page_WOLF/input_Confirm_p-inputtext p-component set-i_867df8'), 'บุษลิน')

WebUI.click(findTestObject('Object Repository/Page_WOLF/td_EMP005'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Yes'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/svg'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/span_To Do List'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/div_Related List'))

'check waiting for'
WebUI.verifyElementText(findTestObject('Object Repository/Page_WOLF/p__1'), 'บุษลิน ปิติวัฒน์')

'status in request page'
WebUI.click(findTestObject('Object Repository/Page_WOLF/span_Wait for Process'))

'check status wait for process in form'
WebUI.verifyElementText(findTestObject('Object Repository/Page_WOLF/span_Wait for Process'), 'Wait for Process')

