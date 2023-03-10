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

WebUI.setText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_username'), 'wolf01@qar2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_password'), '/eWc8J9JFEG5WeA2mg7b1w==')

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_New Request'))

WebUI.setText(findTestObject('Page_WOLF/input_searchType'), 'KTL-REF')

WebUI.click(findTestObject('Object Repository/Page_WOLF/p_KTL-REF  Test Reference Form'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/input__items2.layout1.data.value'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/input__items3.layout1.data.value'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Add'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/div_Honda CR-V (  6502)_p-radiobutton-box p_82aa2b'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/span_Honda City (  4103)'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/input__items2.layout1.data.value'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/input__items3.layout1.data.value'))

WebUI.verifyNotEqual(findTestObject('Object Repository/Page_WOLF/input__items2.layout1.data.value'), null)

WebUI.verifyNotEqual(findTestObject('Object Repository/Page_WOLF/input__items3.layout1.data.value'), null)

