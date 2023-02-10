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

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_New Request'))

WebUI.setText(findTestObject('Object Repository/Page_WOLF/input_concat(id(, , fil, , ))_fil'), 'Type of Approval')

WebUI.click(findTestObject('FormCondition'))

WebUI.verifyEqual(WebUI.getUrl(), 'https://qar2.wolfapprove.com/Request?MemoID=0&template=102')

WebUI.click(findTestObject('Dropdown Select'))

WebUI.click(findTestObject('DropdownOptionA'))

WebUI.click(findTestObject('BTN_LineApprove'))

WebUI.verifyTextPresent('อัญริญา แสนเลิศ', false)

WebUI.verifyTextPresent('ณัฏฐพล ปัทมเดชา', false)

WebUI.click(findTestObject('BTN_Information'))

WebUI.click(findTestObject('DropdownOptionA'))

WebUI.click(findTestObject('DropdownOptionB'))

WebUI.click(findTestObject('BTN_LineApprove'))

WebUI.verifyTextPresent('ธรรมิกา สุขประเสริญ', false)

WebUI.click(findTestObject('BTN_Information'))

WebUI.click(findTestObject('DropdownOptionB'))

WebUI.click(findTestObject('DropdownOptionC'))

WebUI.click(findTestObject('BTN_LineApprove'))

WebUI.verifyTextPresent('พงษ์สิทธิ์ พงศ์พิโรจ', false)
//
//WebUI.click(findTestObject('BTN_Information'))
//
//WebUI.click(findTestObject('DropdownOptionC'))
//
//WebUI.click(findTestObject('DropdownOptionD'))
//
//WebUI.click(findTestObject('BTN_LineApprove'))
//
//WebUI.verifyTextPresent('ธรรมิกา สุขประเสริญ', false)

