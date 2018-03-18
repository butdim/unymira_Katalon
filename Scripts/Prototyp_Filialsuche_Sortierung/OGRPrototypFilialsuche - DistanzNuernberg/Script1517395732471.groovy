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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.navigateToUrl('http://kundentest.dev-unitb.de/ogrhtmlprototyp/ogrhtmlprototyp/filialsuche-nuernberg.html')

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzNuernberg/01ErgebnisText'), 'PSD Bank Nürnberg eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzNuernberg/02ErgebnisText'), 'Beratungsbüro Ansbach')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzNuernberg/03ErgebnisTest'), 'PSD Bank Nürnberg eG, Filiale Bamberg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzNuernberg/04ErgebnisTest'), 'Beratungsbüro Bayreuth')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzNuernberg/05ErgebnisTest'), 'Beratungsbüro Regensburg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzNuernberg/06ErgebnisTest'), 'PSD Bank Nürnberg eG, Filiale Würzburg')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzNuernberg/07ErgebnisTest'), 'Beratungsbüro Aschaffenburg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzNuernberg/08ErgebnisTest'), 'PSD Bank Nürnberg eG, Filiale Chemnitz')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzNuernberg/09ErgebnisTest'), 'PSD Bank Nürnberg eG, Filiale Leipzig')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzNuernberg/10ErgebnisTest'), 'PSD Bank Nürnberg eG, Filiale Dresden')

WebUI.closeBrowser()