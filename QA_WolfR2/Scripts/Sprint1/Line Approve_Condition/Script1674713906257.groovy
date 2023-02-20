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
import org.openqa.selenium.WebDriver;
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
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

WebUI.navigateToUrl('https://localhost:5001/')

WebUI.setText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_username'), 'pornpan@qar2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_password'), '/eWc8J9JFEG5WeA2mg7b1w==')

WebUI.sendKeys(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_New Request'))

WebUI.setText(findTestObject('Page_WOLF/input_searchType'), 'Type of Approval')

WebUI.click(findTestObject('FormCondition'))

WebUI.verifyEqual(WebUI.getUrl(), 'https://localhost:5001/Request?MemoID=0&template=102')

WebUI.click(findTestObject('Dropdown Select'))

WebUI.click(findTestObject('DropdownOptionA'))

WebDriver driver = DriverFactory.getWebDriver()
driver.findElement(By.className("ant-input-number-input")).click()
driver.findElement(By.className("ant-input-number-input")).sendKeys(Keys.DELETE)
WebUI.delay(2)
driver.findElement(By.className("ant-input-number-input")).sendKeys('50')
WebUI.delay(2)
driver.findElement(By.className("ant-input-number-input")).sendKeys(Keys.ENTER)
WebUI.delay(2)

WebUI.click(findTestObject('BTN_LineApprove'))

WebUI.verifyTextPresent('อัญริญา แสนเลิศ', false)

WebUI.verifyTextPresent('ณัฏฐพล ปัทมเดชา', false)
