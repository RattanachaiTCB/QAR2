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

WebUI.setText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_username'), 'busalin@qar2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_password'), '/eWc8J9JFEG5WeA2mg7b1w==')

WebUI.sendKeys(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_WOLF/span_Wait for Approve'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Return'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/p (4)'))

WebUI.setText(findTestObject('Object Repository/Page_WOLF/body_Return (1)'), 'Return')

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Confirm'))

WebUI.delay(5)

WebUI.navigateToUrl('https://qar2.wolfapprove.com/Default')

WebUI.click(findTestObject('Object Repository/Page_WOLF/div_B'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/div_Logout'))

WebUI.setText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_username'), 'pornpan@qar2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_password'), '/eWc8J9JFEG5WeA2mg7b1w==')

WebUI.sendKeys(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_WOLF/span_Wait for Approve'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_History'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_WOLF/span_Return'), 'Return')

WebUI.click(findTestObject('Object Repository/Page_WOLF/img_Requestor_img-logo'))

