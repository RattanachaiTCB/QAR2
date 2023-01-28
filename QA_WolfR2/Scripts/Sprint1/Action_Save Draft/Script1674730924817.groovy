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

WebUI.delay(8)

WebUI.navigateToUrl('https://qar2.wolfapprove.com/Request?MemoID=0&template=123')

WebUI.click(findTestObject('Object Repository/Page_WOLF/input__p-inputtext p-component information-_4aaea2'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/div_TCB'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Save Draft'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_WOLF/p_KTL-ACT01-2023-000004'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_WOLF/span_Wait for Approve'), 'Draft')

WebUI.click(findTestObject('Object Repository/Page_WOLF/button_History'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_WOLF/span_Submitted'), 'Draft')

