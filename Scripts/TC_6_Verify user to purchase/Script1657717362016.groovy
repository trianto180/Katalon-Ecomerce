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

WebUI.click(findTestObject('Object Repository/Purchase/a_My Account'))

WebUI.setText(findTestObject('Object Repository/Purchase/input__loginusername'), 'gantasprabowo@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Purchase/input__loginpassword'), 'EjW6fhWhyGgrLmziQ05e5w==')

WebUI.click(findTestObject('Object Repository/Purchase/span_Login'))

WebUI.click(findTestObject('Object Repository/Purchase/a_My Wishlist'))

WebUI.click(findTestObject('Purchase/span_Cart'))

WebUI.click(findTestObject('Object Repository/Purchase/a_Checkout'))

WebUI.setText(findTestObject('Object Repository/Purchase/input_Company_billingcompany'), 'techpedia')

WebUI.setText(findTestObject('Object Repository/Purchase/input__billingstreet'), 'United states')

WebUI.setText(findTestObject('Object Repository/Purchase/input_Street Address 2_billingstreet'), 'New York')

WebUI.setText(findTestObject('Object Repository/Purchase/input__billingcity'), 'New York')

WebUI.selectOptionByValue(findTestObject('Object Repository/Purchase/select_Please select region, state or provi_73d6eb'), 
    '18', true)

WebUI.setText(findTestObject('Object Repository/Purchase/input__billingpostcode'), '532333')

WebUI.click(findTestObject('Object Repository/Purchase/div_Checkout                        1      _757ec1'))

WebUI.setText(findTestObject('Object Repository/Purchase/input__billingtelephone'), '123456')

WebUI.setText(findTestObject('Object Repository/Purchase/input_Fax_billingfax'), '11221')

WebUI.click(findTestObject('Object Repository/Purchase/span_Continue'))

WebUI.click(findTestObject('Object Repository/Purchase/span_Continue'))

WebUI.click(findTestObject('Object Repository/Purchase/label_Credit Card (saved)'))

WebUI.click(findTestObject('Object Repository/Purchase/label_Check  Money order'))

WebUI.click(findTestObject('Object Repository/Purchase/button_Continue_1'))

WebUI.click(findTestObject('Object Repository/Purchase/span_Place Order'))

WebUI.click(findTestObject('Object Repository/Purchase/p_Your order  is 100016488'))

