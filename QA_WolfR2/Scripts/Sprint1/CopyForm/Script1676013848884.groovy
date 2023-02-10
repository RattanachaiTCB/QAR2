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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.support.ui.Select

import static org.junit.Assert.assertArrayEquals
import static org.junit.Assert.assertEquals

import org.junit.Assert
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://localhost:5001/login')

WebUI.setText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_username'), 'wolf01@qar2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_password'), '/eWc8J9JFEG5WeA2mg7b1w==')

WebUI.sendKeys(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_password'), Keys.chord(Keys.ENTER))

WebUI.navigateToUrl('https://localhost:5001/Request?MemoID=0&template=574')

String Company = WebUI.getText(findTestObject('เพิ่ม object'))  //object
String Subject = WebUI.getText(findTestObject('เพิ่ม object'))  //object
String DueDate = WebUI.getText(findTestObject('เพิ่ม object'))  //object
String FullName = WebUI.getText(findTestObject('เพิ่ม object'))  //object

WebUI.verifyEqual(WebUI.getUrl(), 'https://localhost:5001/Request?MemoID=0&template=574&isCopy')

WebUI.verifyEqual(WebUI.getText(findTestObject('เพิ่ม object')), Company)
WebUI.verifyEqual(WebUI.getText(findTestObject('เพิ่ม object')), Subject)
WebUI.verifyEqual(WebUI.getText(findTestObject('เพิ่ม object')), DueDate)
WebUI.verifyEqual(WebUI.getText(findTestObject('เพิ่ม object')), FullName)




