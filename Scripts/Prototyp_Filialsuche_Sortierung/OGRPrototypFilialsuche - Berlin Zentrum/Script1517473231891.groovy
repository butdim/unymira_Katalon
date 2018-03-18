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

WebUI.maximizeWindow()

WebUI.deleteAllCookies()

WebUI.navigateToUrl('http://kundentest.dev-unitb.de/ogrhtmlprototyp/ogrhtmlprototyp/filialsuche-textinput.html')

WebUI.delay(5)

WebUI.setText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/input_city'), 'Berlin')

WebUI.sendKeys(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/input_city'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/01ErgebnisText'), 'Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/02ErgebnisText'), 'Berliner Volksbank eG, FinanzCenter Tegel')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/03ErgebnisTest'), 'Berliner Volksbank eG, Filiale Kurt-Schumacher-Platz')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/04ErgebnisTest'), 'Berliner Volksbank eG, Filiale Leopoldplatz')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/05ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Pankow')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/06ErgebnisTest'), 'Berliner Volksbank eG, Filiale Moabit')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/07ErgebnisTest'), 'Berliner Volksbank eG, Filiale Prenzlauer Berg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/08ErgebnisTest'), 'Berliner Volksbank eG, Filiale Westend')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/09ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Friedrichstraße')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/10ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Charlottenburg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/11ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Kurfürstendamm')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/12ErgebnisTest'), 'Berliner Volksbank eG, Filiale Wittenbergplatz')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/13ErgebnisTest'), 'Berliner Volksbank eG, Filiale Halensee')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/14ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Weißensee')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/15ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Wilmersdorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/16ErgebnisTest'), 'Berliner Volksbank eG, Filiale Kreuzberg')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/17ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Friedrichshain')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/18ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Neukölln')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/19ErgebnisTest'), 'Berliner Volksbank eG, Filiale Karl-Marx-Straße')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/20ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Steglitz')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/21ErgebnisTest'), 'Berliner Volksbank eG, Filiale Tempelhof')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/22ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Mariendorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/23ErgebnisTest'), 'Berliner Volksbank eG, Filiale Ahrensfelde')

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/24ErgebnisTest'), 'Berliner Volksbank eG, Filiale Lichterfelde-Ost')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFilialsuche - Berlin Zentrum/25ErgebnisTest'), 'Berliner Volksbank eG, Filiale Treptow')

WebUI.closeBrowser()