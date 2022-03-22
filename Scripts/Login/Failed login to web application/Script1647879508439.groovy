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

'Open web application'
WebUI.openBrowser('https://orion.printerous.com/en/')

'Click login button on homepage'
WebUI.click(findTestObject('Homepage/Login button on homepage'))

'Input invalid username'
WebUI.setText(findTestObject('Homepage/Email field'), findTestData('Login Data').getValue(1, 2))

'Input invalid password'
WebUI.setText(findTestObject('Homepage/Password field'), findTestData('Login Data').getValue(2, 2))

'Click login button'
WebUI.click(findTestObject('Homepage/Log in button'))

'Showing invalid email or login validation'
WebUI.verifyElementPresent(findTestObject('Homepage/Invalid email or password validation'), 0)

'Close browser'
WebUI.closeBrowser()

