import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.vr.de/privatkunden.html')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.vr.de/privatkunden.html')

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Page_Privatkunden - Volksbanken Rai/a_Zurck'))

WebUI.click(findTestObject('Page_Privatkunden - Volksbanken Rai/a_nav__link--lvl-2 icons-navig'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Privatkunden - Volksbanken Rai/input_city'), 'Berlin')

WebUI.delay(5)

WebUI.click(findTestObject('CTA/Page_Privatkunden - Volksbanken Rai/button_form__submit btn btn--c'))

WebUI.click(findTestObject('Page_Filialsuche Privatkunden - Vol/div'))

WebUI.click(findTestObject('Page_Filialsuche Privatkunden - Vol/span_Zur Website'))

WebUI.mouseOver(findTestObject(null))

WebUI.closeBrowser()

