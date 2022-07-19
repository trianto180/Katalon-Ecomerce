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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://live.techpanda.org/')

WebUI.click(findTestObject('Object Repository/New Account/a_My Account'))

WebUI.click(findTestObject('Object Repository/New Account/a_Create an Account'))

WebUI.setText(findTestObject('Object Repository/New Account/input__firstname'), 'Gantas')

WebUI.setText(findTestObject('Object Repository/New Account/input_Middle NameInitial_middlename'), 'Fantas')

WebUI.setText(findTestObject('Object Repository/New Account/input_Middle NameInitial_middlename'), 'Gantas')

WebUI.setText(findTestObject('Object Repository/New Account/input__lastname'), 'Prabowo')

WebUI.setText(findTestObject('Object Repository/New Account/input__email'), 'gantasprabowo@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/New Account/input__password'), 'EjW6fhWhyGgrLmziQ05e5w==')

WebUI.setEncryptedText(findTestObject('Object Repository/New Account/input__confirmation'), 'EjW6fhWhyGgrLmziQ05e5w==')

WebUI.click(findTestObject('Object Repository/New Account/input_This is a required field_is_subscribed'))

WebUI.click(findTestObject('Object Repository/New Account/span_Register'))

