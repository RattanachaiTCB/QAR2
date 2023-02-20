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
WebUI.click(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/svg'))

WebUI.setText(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/input_Department_search-filter-input'), 
    'upload')

WebUI.click(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/p_KTL_AAT_01-2023-000001'))

WebUI.click(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/button_Attachment'))

//WebUI.click(findTestObject('testobj/testedit/attachment/Page_WOLF/choosefile'))
WebUI.uploadFile(findTestObject('testobj/testedit/attachment/Page_WOLF/choosefile'), 'D:\\TestData\\jpegtest.jpg')

WebUI.click(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/button_Upload'))

WebUI.uploadFile(findTestObject('testobj/testedit/attachment/Page_WOLF/choosefile'), 'D:\\TestData\\pngtest.png')

WebUI.click(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/button_Upload'))

WebUI.uploadFile(findTestObject('testobj/testedit/attachment/Page_WOLF/choosefile'), 'D:\\TestData\\Test_Data.pptx')

WebUI.click(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/button_Upload'))

WebUI.uploadFile(findTestObject('testobj/testedit/attachment/Page_WOLF/choosefile'), 'D:\\TestData\\TEST_UPLOAD_ATTACHMENT.docx')

WebUI.click(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/button_Upload'))

WebUI.uploadFile(findTestObject('testobj/testedit/attachment/Page_WOLF/choosefile'), 'D:\\TestData\\TEST_UPLOAD_ATTACHMENT.pdf')

WebUI.click(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/button_Upload'))

WebUI.uploadFile(findTestObject('testobj/testedit/attachment/Page_WOLF/choosefile'), 'D:\\TestData\\TESTFile.xlsx')

WebUI.click(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/button_Upload'))

WebUI.click(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/p_jpegtest.jpg'))

WebUI.switchToWindowIndex(1)

WebUI.delay(10)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

//WebUI.switchToWindowTitle('WOLF')
WebUI.click(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/p_pngtest.png'))

WebUI.switchToWindowIndex(1)

WebUI.delay(10)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/p_Test_Data.pptx'))

//WebUI.switchToWindowIndex(1)
//
//WebUI.delay(10)
//
//WebUI.closeWindowIndex(1)
//
//WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/p_TEST_UPLOAD_ATTACHMENT.docx'))

//WebUI.switchToWindowIndex(1)
//
//WebUI.delay(10)
//
//WebUI.closeWindowIndex(1)
//
//WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/p_TEST_UPLOAD_ATTACHMENT.pdf'))

WebUI.switchToWindowIndex(1)

WebUI.delay(10)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/p_TESTFile.xlsx'))

//WebUI.switchToWindowIndex(1)
//
//WebUI.delay(10)
//
//WebUI.closeWindowIndex(1)
//
//WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/p_Save Draft'))

WebUI.click(findTestObject('Object Repository/testobj/testedit/attachment/Page_WOLF/button_Confirm'))

