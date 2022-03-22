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

'User already select product'
WebUI.callTestCase(findTestCase('Add to cart/User can order single product'), [:], FailureHandling.STOP_ON_FAILURE)

'Click skip tutorial button'
WebUI.click(findTestObject('Product Page/Skip tutorial button'))

WebUI.scrollToElement(findTestObject('Object Repository/Product Page/Select Specifications'), 0)

'Click product material type'
WebUI.click(findTestObject('Product Page/Matte Vinyl material type'))

WebUI.scrollToElement(findTestObject('Product Page/Sticker Static material type'), 0)

'Click product shape'
WebUI.click(findTestObject('Product Page/Round shape'))

WebUI.scrollToElement(findTestObject('Product Page/Round shape'), 0)

'Click product size'
WebUI.click(findTestObject('Product Page/10 x 10 cm size'))

WebUI.scrollToElement(findTestObject('Product Page/10 x 10 cm size'), 0)

'Click product lamination'
WebUI.click(findTestObject('Product Page/None lamination'))

WebUI.scrollToElement(findTestObject('Product Page/Product Side'), 0)

'Click product quantity'
WebUI.click(findTestObject('Product Page/25 pcs quantity'))

