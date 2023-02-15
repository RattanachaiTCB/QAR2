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

WebUI.navigateToUrl('https://localhost:5001/')

WebUI.setText(findTestObject('Object Repository/testobj/testedit/Page_WOLF/Page_WOLF/input_Forgot Password_username'), 'wolf01@qar2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/testobj/testedit/Page_WOLF/Page_WOLF/input_Forgot Password_password'), 
    '/eWc8J9JFEG5WeA2mg7b1w==')

WebUI.click(findTestObject('Object Repository/testobj/testedit/Page_WOLF/Page_WOLF/button_Sign In'))

WebUI.click(findTestObject('Object Repository/testobj/testedit/Page_WOLF/Page_WOLF/path'))

WebUI.setText(findTestObject('Object Repository/testobj/testedit/Page_WOLF/Page_WOLF/input__search-filter-input'), 'Test Validation changing requestor By Katalon automate test')

WebUI.click(findTestObject('Object Repository/testobj/testedit/Page_WOLF/Page_WOLF/p_KTL-VLD01-2023-000008'))

WebUI.click(findTestObject('Object Repository/testobj/testedit/Page_WOLF/Page_WOLF/clickRequesterOnleftSide'))

WebUI.click(findTestObject('Object Repository/testobj/testedit/Page_WOLF/Page_WOLF/changeRequestor'))

WebUI.click(findTestObject('Object Repository/testobj/testedit/Page_WOLF/Page_WOLF/span_'))

WebUI.click(findTestObject('Object Repository/testobj/testedit/Page_WOLF/Page_WOLF/p_'))

WebUI.click(findTestObject('Object Repository/testobj/testedit/Page_WOLF/Page_WOLF/button_Confirm'))

WebUI.click(findTestObject('Object Repository/testobj/testedit/Page_WOLF/Page_WOLF/path_1'))

WebUI.click(findTestObject('Object Repository/testobj/testedit/Page_WOLF/Page_WOLF/p__1'))

