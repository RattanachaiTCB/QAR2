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

import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.Select
import com.kms.katalon.core.webui.driver.DriverFactory


String approveBy = 'พรพรรณ ธนากานต์'
String requestBy = 'วูล์ฟ'
String status = 'Wait for Approve'
String charRange = '\n';

//login
/*WebUI.callTestCase(findTestCase('Login Pass'), [:], FailureHandling.STOP_ON_FAILURE)*/


//WebUI.convertWebElementToTestObject(5)
WebUI.navigateToUrl('https://qar2.wolfapprove.com/Default')
WebUI.delay(5)
//search request by status Wait for Approve
WebUI.click(findTestObject('Page_WOLF/svg'))
WebUI.setText(findTestObject('Page_WOLF/input_Department_search'), 'Wait for Approve')
WebUI.delay(2)

//click new list
WebDriver driver = DriverFactory.getWebDriver()
String getNewRequestId = driver.findElement(By.className('running-number-container')).getText()
int endIndex = getNewRequestId.indexOf(charRange)
String subStr = getNewRequestId.substring(0,endIndex)
WebUI.delay(2)
println('subStr===>'+subStr)

driver.findElement(By.linkText(subStr)).click()
WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/Page_WOLF/span_Wait for Approve'))
WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Approve'))
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Confirm'))
WebUI.delay(2)
WebUI.click(findTestObject('Page_WOLF/svg'))
WebUI.click(findTestObject('Page_WOLF/span_To Do List'))
WebUI.click(findTestObject('Page_WOLF/div_Related List'))
WebUI.delay(5)
//WebUI.setText(findTestObject('Page_WOLF/input_Department_search'), 'Wait for Approve')
//WebUI.verifyElementText(findTestObject('Page_WOLF/p__1'), textSearch)
//WebUI.verifyNotEqual(findTestObject('Page_WOLF/p__1'), requestBy)



//get text to check request by and approve by
WebElement getApproveByElement = driver.findElement(By.className('waiting-for-container'))
String getApproveBy = getApproveByElement.findElement(By.className('text-name')).getText()
println('approveBy ==> ' + getApproveBy)

WebElement getRequestByElement = driver.findElement(By.className('request-by-container'))
String getRequestBy = getRequestByElement.findElement(By.className('text-name')).getText()
println(requestBy + '<=== getRequestBy ==> ' + getRequestBy)

String getCheckRequestId = driver.findElement(By.className('running-number-container')).getText()
int endIndexRequest = getCheckRequestId.indexOf(charRange)
String subStrCheckRequest = getCheckRequestId.substring(0,endIndexRequest)
println(subStrCheckRequest + '<=== subStrCheckRequest ==> ' + subStr)

//verify text
WebUI.verifyMatch(getApproveBy, approveBy, false)
//WebUI.verifyMatch(getRequestByElement, requestBy, false)
WebUI.verifyMatch(subStrCheckRequest, subStr, false)