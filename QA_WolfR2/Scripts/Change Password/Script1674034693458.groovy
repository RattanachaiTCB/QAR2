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


String newPassword = 'Wolf@tcb1'
String verifyChangePassword = 'You can verify the request to use WOLF Approve via the email ([-EMAIL-]) that you have entered.<br/>ท่านสามารถยืนยันการขอใช้งานระบบผ่าน email ([-EMAIL-]) ที่ท่านได้กรอกมา...'
String verifyTextPermission = 'Access denied. You do not have permission to perform access this resource. Please add your employee profile.'
/*WebUI.openBrowser('')
WebUI.navigateToUrl('https://qar2.wolfapprove.com/')
WebUI.setText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_username'), 'wolf01@qar2.com')
WebUI.setEncryptedText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_password'), '/eWc8J9JFEG5WeA2mg7b1w==')
WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Sign In'))*/
//login
WebUI.callTestCase(findTestCase('Login Pass'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.delay(3)

//click profile
WebUI.click(findTestObject('Page_WOLF/button_profile'))
//click change password
WebUI.click(findTestObject('Page_WOLF/button_change_password'))
WebUI.delay(3)

/*WebUI.setEncryptedText(findTestObject('Page_WOLF/input_current_password'), '/eWc8J9JFEG5WeA2mg7b1w==')
WebUI.setEncryptedText(findTestObject('change_password/input_new_password'), 'aeHFOx8jV/A=')
WebUI.setEncryptedText(findTestObject('change_password/input_comfirm_password'), 'aeHFOx8jV/A=')
WebUI.click(findTestObject('change_password/button_Save'))*/

//set new password
WebUI.setText(findTestObject('change_password/input_current_password'), GlobalVariable.G_password)
WebUI.setText(findTestObject('change_password/input_new_password'), newPassword)
WebUI.setText(findTestObject('change_password/input_comfirm_password'), newPassword)
WebUI.delay(2)
WebUI.click(findTestObject('change_password/button_Save'))
WebUI.delay(3)

//check change password success
WebUI.verifyElementText(findTestObject('change_password/text_success'), 'Success')
WebUI.verifyElementText(findTestObject('change_password/text_confirm_change_password'), verifyChangePassword)
WebUI.waitForPageLoad(120)

/*WebUI.navigateToUrl(GlobalVariable.G_url)
WebUI.setText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_username'), 'wolf01@qar2.com')
WebUI.setEncryptedText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_password'), 'aeHFOx8jV/A=')
WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Sign In'))
WebUI.verifyElementText(findTestObject('login/text_check_permission'), 
    'Access denied. You do not have permission to perform access this resource. Please add your employee profile.')*/

//check login new password
WebUI.setText(findTestObject('login/input_username'), GlobalVariable.G_username)
WebUI.setText(findTestObject('login/input_password'), newPassword)
WebUI.delay(2)
//click
WebUI.click(findTestObject('login/button_login'))
WebUI.delay(2)
//check verify text permission
WebUI.verifyElementText(findTestObject('login/text_check_permission'), verifyTextPermission)

//
WebUI.click(findTestObject('Page_WOLF/button_Approve'))
WebUI.click(findTestObject('Page_WOLF/button_Rework'))
WebUI.click(findTestObject('Object Repository/Page_WOLF/p_'))
WebUI.click(findTestObject('Page_WOLF/p'))
WebUI.setText(findTestObject('Page_WOLF/body_comment'), '<p style="">comment</p><div id="katalon" style="top: 0px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')
WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Confirm'))
WebUI.click(findTestObject('Page_WOLF/p_DTP-2023-000001'))
WebUI.click(findTestObject('Page_WOLF/button_Cancel_1'))
WebUI.click(findTestObject('Page_WOLF/html_import url(httpsfonts.googleapis.comcss2familySarabundisplayswap) body  font-family Sarabun, sans-serif import url(httpsfonts.cdnfonts.comcssleelawadee) body  font-family Leelawadee, sans-serif katalonfont-familymon'))
WebUI.setText(findTestObject('Page_WOLF/body_cancel'), '<p>cancel</p><div id="katalon" style="top: 0px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.click(findTestObject('Page_WOLF/button_Request Comment'))

WebUI.click(findTestObject('Page_WOLF/html_import url(httpsfonts.googleapis.comcss2familySarabundisplayswap) body  font-family Sarabun, sans-serif import url(httpsfonts.cdnfonts.comcssleelawadee) body  font-family Leelawadee, sans-serif katalonfont-familymon'))

WebUI.setText(findTestObject('Page_WOLF/body_comment'), '<p style="">comment</p><div id="katalon" style="top: 0px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/td_EMP001'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/span_Yes'))

//WebUI.closeBrowser()

