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

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import com.kms.katalon.core.webui.driver.DriverFactory

//login
//WebUI.callTestCase(findTestCase('Login Pass'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)
WebUI.navigateToUrl('https://qar2.wolfapprove.com/Default')
WebUI.delay(3)
WebDriver driver = DriverFactory.getWebDriver()
String charRange = '\n';
//search request by status Wait for Approve
WebUI.click(findTestObject('Page_WOLF/svg'))
WebUI.setText(findTestObject('Page_WOLF/input_Department_search'), 'Wait for Approve')
WebUI.delay(2)

//click request id
String getNewRequestId = driver.findElement(By.className('running-number-container')).getText()
int endIndex = getNewRequestId.indexOf(charRange)
String subStr = getNewRequestId.substring(0,endIndex)
WebUI.delay(2)
driver.findElement(By.linkText(subStr)).click()
WebUI.delay(2)
//WebUI.click(findTestObject('Page_WOLF/span_Wait for Approve'))
WebUI.click(findTestObject('Page_WOLF/button_Return'))
/*WebUI.click(findTestObject('Page_WOLF/p (4)'))
WebUI.setText(findTestObject('Page_WOLF/body_Return (1)'), 'Return')*/
WebUI.delay(5)
WebElement iFrameElement = driver.findElement(By.cssSelector('.p-dialog-content'))
WebElement iFrameElements = iFrameElement.findElement(By.tagName('iframe'))
WebUI.delay(3)
driver.switchTo().frame(iFrameElements);
WebUI.delay(3)
driver.findElement(By.id('tinymce')).click()
driver.findElement(By.id('tinymce')).sendKeys('Return')

WebUI.delay(3)
driver.switchTo().defaultContent()
WebUI.delay(3)
WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Confirm'))
WebUI.delay(5)
WebUI.navigateToUrl('https://qar2.wolfapprove.com/Default')
WebUI.click(findTestObject('Page_WOLF/div_B'))
WebUI.delay(2)
WebUI.click(findTestObject('Page_WOLF/div_Logout'))
WebUI.delay(2)
//login to pornpan@qar2.com
WebUI.navigateToUrl(GlobalVariable.G_url)
WebUI.maximizeWindow()
WebUI.delay(3)
WebUI.setText(findTestObject('login/input_username'), GlobalVariable.G_username)
WebUI.setEncryptedText(findTestObject('Page_WOLF/input_Forgot Password_password'), '/eWc8J9JFEG5WeA2mg7b1w==')
WebUI.sendKeys(findTestObject('Page_WOLF/input_Forgot Password_password'), Keys.chord(Keys.ENTER))
WebUI.delay(2)
//click
/*WebUI.setText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_username'), 'pornpan@qar2.com')
WebUI.setEncryptedText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_password'), '/eWc8J9JFEG5WeA2mg7b1w==')
WebUI.sendKeys(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_password'), Keys.chord(Keys.ENTER))*/

WebUI.click(findTestObject('Page_WOLF/span_Wait for Approve'))
WebUI.delay(2)
WebUI.verifyElementText(findTestObject('Page_WOLF/span_Return'), 'Return')
WebUI.click(findTestObject('Page_WOLF/img_Requestor_img-logo'))
WebUI.closeBrowser()
