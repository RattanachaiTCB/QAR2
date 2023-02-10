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

WebUI.click(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_username'))

WebUI.setText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_username'), 'wolf01@qar2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_password'), '/eWc8J9JFEG5WeA2mg7b1w==')

WebUI.sendKeys(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_WOLF/p_New Request'))

WebUI.setText(findTestObject('Object Repository/Page_WOLF/input_concat(id(, , fil, , ))_fil'), 'cal')

WebUI.click(findTestObject('Object Repository/Page_WOLF/p_KTL-CCN01  Calculate Function'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/i_total_pi pi-plus'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/input_total_0_0_price'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Page_WOLF/input_total_0_0_price'), '2,000.00')

WebUI.click(findTestObject('Page_WOLF/input__0_1_amount'))

WebUI.sendKeys(findTestObject('Object Repository/Page_WOLF/input__0_1_amount'), '2')

WebUI.click(findTestObject('Object Repository/Page_WOLF/input__0_2_discount'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/Page_WOLF/input__0_2_discount'), '100')

WebUI.click(findTestObject('Object Repository/Page_WOLF/div_priceamountdiscounttotal11'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/td__ant-table-cell ant-table-cell-row-hover'))

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Page_WOLF/input_GRAND TOTAL_ant-input-number-input'), 
    'value', '3,900.00', 0)

