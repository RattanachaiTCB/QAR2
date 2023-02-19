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
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver as Keys

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


String textDraft = 'Draft'
String charRange = '\n';

//login
/*WebUI.callTestCase(findTestCase('Login Pass'), [:], FailureHandling.STOP_ON_FAILURE)*/


WebUI.delay(2)
WebUI.navigateToUrl('https://qar2.wolfapprove.com/Request?MemoID=0&template=123')
WebUI.delay(2)
//select company
WebUI.click(findTestObject('Page_WOLF/input_company'))
WebUI.click(findTestObject('Page_WOLF/td_TCB'))
WebUI.delay(2)
WebUI.click(findTestObject('Page_WOLF/button_Save Draft'))
WebUI.click(findTestObject('Page_WOLF/button_Confirm'))
WebUI.delay(5)

//click new list 
WebDriver driver = DriverFactory.getWebDriver()
String getNewRequestId = driver.findElement(By.className('running-number-container')).getText()
int endIndex = getNewRequestId.indexOf(charRange)
String subStr = getNewRequestId.substring(0,endIndex)
WebUI.delay(2)
driver.findElement(By.linkText(subStr)).click()
WebUI.delay(2)

//check verify data
//WebUI.verifyElementText(findTestObject('Page_WOLF/span_Wait for Approve'), textDraft)
//WebUI.verifyElementText(findTestObject('Page_WOLF/span_Draft'), textDraft)
WebUI.delay(4)
//click history button
//WebUI.click(findTestObject('Page_WOLF/button_History'))

//Sidebar RequestSideBarElement-display-none
WebElement menuElement = driver.findElement(By.className('worklist-items-container'))
menuElement.findElement(By.id('History')).click()
//WebUI.verifyElementText(findTestObject('Page_WOLF/span_Submitted'), textDraft)
WebUI.verifyTextPresent(textDraft, false)
