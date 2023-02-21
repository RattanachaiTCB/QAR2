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

WebUI.setText(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/input_Forgot Password_username'), 
    'wolf01@qar2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/input_Forgot Password_password'), 
    '/eWc8J9JFEG5WeA2mg7b1w==')

WebUI.sendKeys(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/input_Forgot Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Confirm'))

WebUI.verifyNotEqual(WebUI.getUrl(), 'https://qar2.wolfapprove.com/Default', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(WebUI.getUrl(), 'https://qar2.wolfapprove.com/Request?MemoID=0&template=121')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_WOLF/small_is required'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/input'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/a_Today'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/input__p-inputtext p-component information-_4aaea2'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/td_TCB'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Confirm'))

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.navigateToUrl('https://qar2.wolfapprove.com/Default')

WebUI.delay(3)

