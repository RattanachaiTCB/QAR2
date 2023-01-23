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

WebUI.click(findTestObject('Object Repository/Page_WOLF/div_WA'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/div_Change Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_WOLF/input__current_password'), '/eWc8J9JFEG5WeA2mg7b1w==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_WOLF/input__new_password'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_WOLF/input__comfirm_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_WOLF/div_Success'), 'Success')

WebUI.verifyElementText(findTestObject('Object Repository/Page_WOLF/div_You can verify the request to use WOLF _1e150d'), 
    'You can verify the request to use WOLF Approve via the email ([-EMAIL-]) that you have entered.<br/>ท่านสามารถยืนยันการขอใช้งานระบบผ่าน email ([-EMAIL-]) ที่ท่านได้กรอกมา...')

WebUI.waitForPageLoad(120)

WebUI.navigateToUrl('https://qar2.wolfapprove.com/')

WebUI.setText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_username'), 'wolf01@qar2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Sign In'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_WOLF/p_Access denied.You do not have permission _a684cd'), 
    'Access denied. You do not have permission to perform access this resource. Please add your employee profile.')

