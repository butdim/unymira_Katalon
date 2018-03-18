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

WebUI.navigateToUrl('http://kundentest.dev-unitb.de/ogrhtmlprototyp/ogrhtmlprototyp/filialsuche-rotenburg.html')

WebUI.delay(10)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/01ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG Filiale Bad Hersfeld')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/02ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/03ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG SB-Stelle Bad Hersfeld')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/04ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG Filiale Ludwigsau-Friedlos')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/05ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG Filiale Kirchheim')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/06ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG Filiale Niederaula')

WebUI.click(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/2teSeite'))

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/07ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG SB-Stelle Bebra')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/08ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG Filiale Bebra Amalienstraße')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/09ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG Filiale Neuenstein')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/10ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG SB-Filiale Rotenburg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/11ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG Filiale Rotenburg Steinweg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/12ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG Filiale Oberaula')

WebUI.click(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/3teSeite'))

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/13ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG Filiale Breitenbach am Herzberg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/14ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG Filiale Alheim-Heinebach')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/15ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG Filiale Heringen')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/16ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG Filiale Nentershausen')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/17ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG Filiale Wildeck-Obersuhl')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/18ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG Filiale Sontra Marktplatz')

WebUI.click(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/4teSeite'))

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - DistanzRotenburg/19ErgebnisTest'), 'VR-Bankverein Bad Hersfeld-Rotenburg eG Filiale Gerstungen')

WebUI.closeBrowser()