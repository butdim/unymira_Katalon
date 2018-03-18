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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.deleteAllCookies()

WebUI.navigateToUrl('http://kundentest.dev-unitb.de/ogrhtmlprototyp/ogrhtmlprototyp/filialsuche-wangen-textinput.html')

WebUI.delay(5)

WebUI.setText(findTestObject('Filialsuche_Inputtext'), 'Rechberghausen')

WebUI.delay(2)

WebUI.submit(findTestObject('Filialsuche_submit_button'))

WebUI.delay(2)

WebUI.verifyTextPresent('Geschäftsstelle Rechberghausen', false)

WebUI.verifyTextPresent('Hauptstr. 37', false)

WebUI.verifyTextPresent('73098 Rechberghausen', false)

WebUI.verifyTextPresent('Geschäftsstelle Börtlingen', false)

WebUI.verifyTextPresent('Geschäftsstelle Uhingen-Holzhausen', false)

WebUI.verifyTextPresent('Raiffeisenbank Wangen eG', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Filialsuche_Inputtext'), 'Börtlingen')

WebUI.delay(2)

WebUI.submit(findTestObject('Filialsuche_submit_button'))

WebUI.delay(2)

WebUI.verifyTextPresent('Geschäftsstelle Börtlingen', false)

WebUI.verifyTextPresent('Hauptstr. 56', false)

WebUI.verifyTextPresent('73104 Börtlingen', false)

WebUI.verifyTextPresent('Geschäftsstelle Rechberghausen', false)

WebUI.verifyTextPresent('Geschäftsstelle Uhingen-Holzhausen', false)

WebUI.verifyTextPresent('Raiffeisenbank Wangen eG', false)

WebUI.delay(2)

WebUI.setText(findTestObject('Filialsuche_Inputtext'), 'Uhingen ')

WebUI.delay(2)

WebUI.submit(findTestObject('Filialsuche_submit_button'))

WebUI.delay(2)

WebUI.verifyTextPresent('Geschäftsstelle Uhingen-Holzhausen', false)

WebUI.verifyTextPresent('Dorfstr. 17 a', false)

WebUI.verifyTextPresent('73066 Uhingen', false)

WebUI.verifyTextPresent('Geschäftsstelle Börtlingen', false)

WebUI.verifyTextPresent('Geschäftsstelle Rechberghausen', false)

WebUI.verifyTextPresent('Raiffeisenbank Wangen eG', false)

WebUI.closeBrowser()

