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
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-1-0/filialsuche.html')

WebUI.delay(2)

WebUI.waitForPageLoad(0)

WebUI.delay(2)

WebUI.click(findTestObject('03/Page_Filialsuche-rotenburg - BVR HT/svg_dropdown-icons'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('002/Page_Filialsuche - BVR HTML Prototy/div_Berlin'))

WebUI.delay(2)

WebUI.click(findTestObject('002/Page_Filialsuche - BVR HTML Prototy/div_Berlin'))

WebUI.delay(5)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy/span_Berliner Volksbank eG Fil'))

WebUI.delay(2)

WebUI.verifyTextPresent('Alt-Moabit 82', false)

WebUI.verifyTextPresent('10555 Berlin', false)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy/span_Berliner Volksbank eG Fil_1'))

WebUI.delay(2)

WebUI.verifyTextPresent('Alt-Rudow 71', false)

WebUI.verifyTextPresent('12355 Berlin', false)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy/span_Berliner Volksbank eG Fin'))

WebUI.delay(2)

WebUI.verifyTextPresent('Bahnhofstr. 19', false)

WebUI.verifyTextPresent('12555 Berlin', false)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy/span_Berliner Volksbank eG Fin_1'))

WebUI.delay(2)

WebUI.verifyTextPresent('Bahnhofstr. 50', false)

WebUI.verifyTextPresent('12305 Berlin', false)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy/span_Berliner Volksbank eG Fil_2'))

WebUI.delay(2)

WebUI.verifyTextPresent('Baumschulenstr. 96', false)

WebUI.verifyTextPresent('12437 Berlin', false)

WebUI.scrollToElement(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy/span_Berliner Volksbank eG Fin_2'), 0)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy/span_Berliner Volksbank eG Fin_2'))

WebUI.delay(2)

WebUI.verifyTextPresent('Berliner Allee 19-21', false)

WebUI.verifyTextPresent('13088 Berlin', false)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy/a_2'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy/span_Berliner Volksbank eG Fin_3'))

WebUI.delay(2)

WebUI.verifyTextPresent('Berliner Str. 98', false)

WebUI.verifyTextPresent('13507 Berlin', false)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fil'))

WebUI.delay(2)

WebUI.verifyTextPresent('Bornholmer Str. 1', false)

WebUI.verifyTextPresent('10439 Berlin', false)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fin'))

WebUI.delay(2)

WebUI.verifyTextPresent('Brandenburgische Str. 86-87', false)

WebUI.verifyTextPresent('10713 Berlin', false)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fin_1'))

WebUI.delay(2)

WebUI.verifyTextPresent('Brodauer Str. 45', false)

WebUI.verifyTextPresent('12621 Berlin', false)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fin_2'))

WebUI.delay(2)

WebUI.verifyTextPresent('Frankfurter Allee 69', false)

WebUI.verifyTextPresent('10247 Berlin', false)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fin_3'))

WebUI.delay(2)

WebUI.verifyTextPresent('Friedrichstr. 108-109', false)

WebUI.verifyTextPresent('10117 Berlin', false)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/a_3'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fil_1'))

WebUI.delay(2)

WebUI.verifyTextPresent('Karl-Marx-Str. 71', false)

WebUI.verifyTextPresent('12043 Berlin', false)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fil_2'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fin_4'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fil_3'))

WebUI.delay(2)

WebUI.verifyTextPresent('Kranoldplatz 2', false)

WebUI.verifyTextPresent('12209 Berlin', false)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fil_4'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fin_5'))

WebUI.delay(2)

WebUI.verifyTextPresent('Kurfürstendamm 46', false)

WebUI.verifyTextPresent('10707 Berlin', false)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/a_4'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fil_5'))

WebUI.delay(2)

WebUI.verifyTextPresent('Ludolfingerplatz 7', false)

WebUI.verifyTextPresent('13465 Berlin', false)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fin_6'))

WebUI.delay(2)

WebUI.verifyTextPresent('Mariendorfer Damm 88-90', false)

WebUI.verifyTextPresent('12109 Berlin', false)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fil_6'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fin_7'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fil_7'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fil_8'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/a_5'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fil_9'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fil_10'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fil_11'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fil_12'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fil_13'))

WebUI.delay(2)

WebUI.verifyTextPresent('Scharnweberstr. 14', false)

WebUI.verifyTextPresent('13405 Berlin', false)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fin_8'))

WebUI.delay(2)

WebUI.verifyTextPresent('Schloßstr. 46', false)

WebUI.verifyTextPresent('12165 Berlin', false)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/a_6'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fil_14'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fin_9'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fil_15'))

WebUI.delay(2)

WebUI.verifyTextPresent('Tempelhofer Damm 159', false)

WebUI.verifyTextPresent('12099 Berlin', false)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fin_10'))

WebUI.delay(2)

WebUI.verifyTextPresent('Wilmersdorfer Straße 65/66', false)

WebUI.verifyTextPresent('10627 Berlin', false)

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fin_11'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/a_7'))

WebUI.click(findTestObject('TF17/Page_Filialsuche - BVR HTML Prototy (1)/span_Berliner Volksbank eG Fil_16'))

WebUI.delay(2)

WebUI.verifyTextPresent('Wormser Str. 6', false)

WebUI.verifyTextPresent('10789 Berlin', false)

WebUI.closeBrowser()

