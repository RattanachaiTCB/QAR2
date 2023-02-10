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
import org.openqa.selenium.support.ui.Select as Select
import org.junit.Assert as Assert
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qar2.wolfapprove.com/')

WebUI.click(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_username'))

WebUI.setText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_username'), 'wolf01@qar2.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_password'), '/eWc8J9JFEG5WeA2mg7b1w==')

WebUI.sendKeys(findTestObject('Object Repository/Page_WOLF/input_Forgot Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_WOLF/p_New Request'))

WebUI.setText(findTestObject('Object Repository/Page_WOLF/input_concat(id(, , fil, , ))_fil'), 'cal')

WebUI.click(findTestObject('Object Repository/Page_WOLF/p_KTL-CCN01  Calculate Function'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/div__padding-controller col-xl-4 col-md-4 c_16246f'))

WebUI.clearText(findTestObject('Object Repository/Page_WOLF/input__ant-input-number-input'))

WebDriver driver = DriverFactory.getWebDriver()

driver.findElement(By.xpath('//*[@id="basic"]/div[4]/div[4]/div/div/div/div/div/input')).clear()

driver.findElement(By.xpath('//*[@id="basic"]/div[4]/div[4]/div/div/div/div/div/input')).sendKeys('2000')

