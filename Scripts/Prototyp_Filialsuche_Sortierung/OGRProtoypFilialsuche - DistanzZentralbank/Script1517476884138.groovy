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

WebUI.navigateToUrl('http://kundentest.dev-unitb.de/ogrhtmlprototyp/ogrhtmlprototyp/filialsuche.html')

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/01ErgebnisText'), 'Berliner Volksbank eG')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/02ErgebnisText'), 'Berliner Volksbank eG, FinanzCenter Tegel')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/03ErgebnisTest'), 'Berliner Volksbank eG, Filiale Kurt-Schumacher-Platz')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/04ErgebnisTest'), 'Berliner Volksbank eG, Filiale Frohnau')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/05ErgebnisTest'), 'Berliner Volksbank eG, Filiale Leopoldplatz')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/06ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Pankow')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/07ErgebnisTest'), 'Berliner Volksbank eG, Filiale Moabit')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/08ErgebnisTest'), 'Berliner Volksbank eG, Filiale Prenzlauer Berg')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/09ErgebnisTest'), 'Berliner Volksbank eG, Filiale Hennigsdorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/10ErgebnisTest'), 'Berliner Volksbank eG, Filiale Westend')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/11ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Spandau')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/12ErgebnisTest'), 'Berliner Volksbank eG, Filiale Hohen Neuendorf')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/13ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Friedrichstraße')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/14ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Charlottenburg')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/15ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Kurfürstendamm')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/16ErgebnisTest'), 'Berliner Volksbank eG, Filiale Wittenbergplatz')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/17ErgebnisTest'), 'Berliner Volksbank eG, Filiale Halensee')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/18ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Weißensee')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/19ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Wilmersdorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/20ErgebnisTest'), 'Berliner Volksbank eG, Filiale Kreuzberg')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/21ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Friedrichshain')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/22ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Neukölln')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/23ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Falkensee')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/24ErgebnisTest'), 'Berliner Volksbank eG, Filiale Karl-Marx-Straße')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/25ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Steglitz')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/26ErgebnisTest'), 'Berliner Volksbank eG, Filiale Tempelhof')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/27ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Mariendorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/28ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Zehlendorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/29ErgebnisTest'), 'Berliner Volksbank eG, Filiale Ahrensfelde')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/30ErgebnisTest'), 'Berliner Volksbank eG, Filiale Lichterfelde-Ost')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/31ErgebnisTest'), 'Berliner Volksbank eG, Filiale Treptow')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/32ErgebnisTest'), 'Berliner Volksbank eG, Filiale Kladow')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/33ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Oranienburg')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/34ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Kaulsdorf')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/35ErgebnisTest'), 'Berliner Volksbank eG, Filiale Helle Mitte')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/36ErgebnisTest'), 'Berliner Volksbank eG, Filiale Wannsee')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/37ErgebnisTest'), 'Berliner Volksbank eG, Filiale Teltow')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/38ErgebnisTest'), 'Berliner Volksbank eG, Filiale Wandlitz')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/39ErgebnisTest'), 'Berliner Volksbank eG, Filiale Rudow')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/40ErgebnisTest'), 'Berliner Volksbank eG, Filiale Adlershof')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/41ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Lichtenrade')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/42ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Köpenick')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/43ErgebnisTest'), 'Berliner Volksbank eG, Filiale Bernau')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/44ErgebnisTest'), 'Berliner Volksbank eG, Filiale Allende-Viertel')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/45ErgebnisTest'), 'Berliner Volksbank eG, Filiale Großbeeren')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/46ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Potsdam')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/47ErgebnisTest'), 'Berliner Volksbank eG, Filiale Nauen')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/48ErgebnisTest'), 'Berliner Volksbank eG, Filiale Eichwalde')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/49ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Strausberg')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/50ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Königs Wusterhausen')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/51ErgebnisTest'), 'Berliner Volksbank eG, Filiale Zehdenick')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/52ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Eberswalde')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/53ErgebnisTest'), 'Berliner Volksbank eG, Filiale Beelitz')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/54ErgebnisTest'), 'Berliner Volksbank eG, Filiale Gransee')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/55ErgebnisTest'), 'Berliner Volksbank eG, FinanzCenter Neuruppin')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/56ErgebnisTest'), 'Berliner Volksbank eG, Filiale Joachimsthal')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/57ErgebnisTest'), 'Berliner Volksbank eG, Filiale Halbe')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/58ErgebnisTest'), 'Berliner Volksbank eG, Filiale Treuenbrietzen')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/59ErgebnisTest'), 'Berliner Volksbank eG, Filiale Fürstenberg')

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/60ErgebnisTest'), 'Berliner Volksbank eG, Filiale Kyritz')

WebUI.click(findTestObject('naechsteSeite'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('OGRPrototypFiliasuche - DistanzZentralbank/61ErgebnisTest'), 'Berliner Volksbank eG, Filiale Wittstock')

WebUI.closeBrowser()