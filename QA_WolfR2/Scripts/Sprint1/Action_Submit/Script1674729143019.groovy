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

import groovy.inspect.swingui.BytecodeCollector
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import com.kms.katalon.core.webui.driver.DriverFactory


String textSubmitted = 'Submitted'
String charRange = '\n';

//login
/*WebUI.callTestCase(findTestCase('Login Pass'), [:], FailureHandling.STOP_ON_FAILURE)*/


WebUI.delay(2)
WebUI.navigateToUrl('https://qar2.wolfapprove.com/Default')
WebUI.waitForPageLoad(5)

//click new request 
/*WebUI.click(findTestObject('Page_WOLF/p_KTL-ACT01-2023-000004'))
WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Submit'))
WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Confirm'))
WebUI.click(findTestObject('Object Repository/Page_WOLF/p_KTL-ACT01-2023-000004'))*/

//click new list
WebDriver driver = DriverFactory.getWebDriver()
//click request id
String getNewRequestId = driver.findElement(By.className('running-number-container')).getText()
int endIndex = getNewRequestId.indexOf(charRange)
String subStr = getNewRequestId.substring(0,endIndex)
WebUI.delay(2)
driver.findElement(By.linkText(subStr)).click()
WebUI.delay(2)

//click submit button
WebUI.click(findTestObject('Page_WOLF/button_Submit'))
WebUI.delay(2)
WebUI.click(findTestObject('Page_WOLF/button_Confirm'))
WebUI.delay(5)
//search request by status Wait for Approve
WebUI.click(findTestObject('Page_WOLF/svg'))
WebUI.click(findTestObject('Object Repository/Page_WOLF/span_To Do List'))
WebUI.click(findTestObject('Object Repository/Page_WOLF/div_In Process'))
WebUI.setText(findTestObject('Page_WOLF/input_Department_search'), subStr)
WebUI.delay(3)
//check status
WebUI.verifyElementText(findTestObject('Page_WOLF/span_Wait for Approve'), 'Wait for Approve')
WebUI.delay(3)

//click New Request Id
driver.findElement(By.linkText(subStr)).click()
WebUI.delay(2)
//click history button
WebElement menuElement = driver.findElement(By.className('worklist-items-container'))
menuElement.findElement(By.id('History')).click()
WebUI.delay(2)
//WebUI.verifyElementText(findTestObject('Page_WOLF/span_Submitted'), 'Submitted')
WebUI.verifyTextPresent(textSubmitted, false)