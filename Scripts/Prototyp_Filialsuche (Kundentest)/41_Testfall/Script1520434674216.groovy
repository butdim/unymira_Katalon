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

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://kundentest.dev-unitb.de/ogrhtmlprototyp/ogrhtmlprototyp/filialsuche-nuernberg-textinput.html')

WebUI.delay(2)

WebUI.setText(findTestObject('Filialsuche_Inputtext'), 'Ansbach')

WebUI.submit(findTestObject('Filialsuche_submit_button'))

WebUI.delay(2)

WebUI.verifyTextPresent('Martin-Luther-Platz 20', false)

WebUI.verifyTextPresent('PSD Bank Nürnberg eG', false)

WebUI.setText(findTestObject('Filialsuche_Inputtext'), 'nürnberg')

WebUI.submit(findTestObject('Filialsuche_submit_button'))

WebUI.delay(2)

WebUI.verifyTextPresent('PSD Bank Nürnberg eG', false)

WebUI.verifyTextPresent('Willy-Brandt-Platz 8', false)

WebUI.verifyTextPresent('90402 Nürnberg', false)

WebUI.verifyTextPresent('Beratungsbüro Ansbach', false)

WebUI.setText(findTestObject('41_TF/Page_Filialsuche-nuernberg-textinpu/input_city'), 'Bamberg')

WebUI.submit(findTestObject('Filialsuche_submit_button'))

WebUI.delay(2)

WebUI.verifyTextPresent('PSD Bank Nürnberg eG, Filiale Bamberg', false)

WebUI.verifyTextPresent('Hauptwachstr. 11', false)

WebUI.verifyTextPresent('96047 Bamberg', false)

WebUI.verifyTextPresent('Beratungsbüro Bayreuth', false)

WebUI.setText(findTestObject('41_TF/Page_Filialsuche-nuernberg-textinpu/input_city'), 'Bayreuth')

WebUI.submit(findTestObject('Filialsuche_submit_button'))

WebUI.delay(2)

WebUI.verifyTextPresent('Beratungsbüro Bayreuth', false)

WebUI.verifyTextPresent('Wölfelstraße 7', false)

WebUI.verifyTextPresent('95444 Bayreuth', false)

WebUI.verifyTextPresent('PSD Bank Nürnberg eG, Filiale Bamberg', false)

WebUI.closeBrowser()

