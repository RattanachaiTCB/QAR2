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
WebUI.delay(2)
WebUI.callTestCase(findTestCase('Login Pass'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)
WebUI.navigateToUrl('https://qar2.wolfapprove.com/Default')
WebDriver driver = DriverFactory.getWebDriver()
String charRange = '\n';
/*WebUI.click(findTestObject('Page_WOLF/p_KTL-ACT01-2023-000002'))
WebUI.click(findTestObject('Page_WOLF/button_Request Comment'))
WebUI.click(findTestObject('Page_WOLF/p (5)'))
WebUI.setText(findTestObject('Page_WOLF/body_Comment (1)'), 'Comment')
WebUI.click(findTestObject('Page_WOLF/button_Confirm'))
WebUI.click(findTestObject('Page_WOLF/td_EMP001'))
WebUI.click(findTestObject('Page_WOLF/span_Yes'))
WebUI.click(findTestObject('Page_WOLF/svg'))
WebUI.click(findTestObject('Page_WOLF/span_To Do List'))
WebUI.click(findTestObject('Page_WOLF/div_Related List'))
WebUI.click(findTestObject('Page_WOLF/span_Wait for Comment'))
WebUI.verifyElementText(findTestObject('Page_WOLF/span_Wait for Comment'), 'Wait for Comment')*/

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
WebUI.click(findTestObject('Page_WOLF/button_Request Comment'))
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
WebUI.click(findTestObject('Page_WOLF/button_Confirm'))
//EMP005
WebElement clickTest = driver.findElement(By.cssSelector('.p-d-flex.p-jc-end'))
clickTest.findElement(By.cssSelector('.p-inputtext.p-component.set-input-search-dialog')).click()
clickTest.findElement(By.cssSelector('.p-inputtext.p-component.set-input-search-dialog')).sendKeys('Busalin')
WebUI.delay(2)
driver.findElement(By.className('p-selectable-row')).click()
WebUI.delay(2)
WebUI.click(findTestObject('Page_WOLF/button_Yes'))
WebUI.delay(9)
WebUI.click(findTestObject('Page_WOLF/svg'))
WebUI.click(findTestObject('Page_WOLF/span_To Do List'))
WebUI.click(findTestObject('Page_WOLF/div_Related List'))
//WebUI.click(findTestObject('Page_WOLF/span_Wait for Comment'))
//WebUI.verifyElementText(findTestObject('Page_WOLF/span_Wait for Comment'), 'Wait for Comment')
WebUI.verifyTextPresent('Wait for Comment', false)