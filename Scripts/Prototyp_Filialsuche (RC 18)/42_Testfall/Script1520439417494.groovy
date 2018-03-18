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

WebUI.navigateToUrl('http://rc-ogrhtmlprototyp.testintern/18-1-0/filialsuche-nuernberg.html')

WebUI.delay(2)

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT/span_PSD Bank Nrnberg eG'))

WebUI.verifyTextPresent('PSD Bank Nürnberg eG', false)

WebUI.verifyTextPresent('Willy-Brandt-Platz 8', false)

WebUI.verifyTextPresent('90402 Nürnberg', false)

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT/span_Beratungsbro Ansbach'))

WebUI.verifyTextPresent('Beratungsbüro Ansbach', false)

WebUI.verifyTextPresent('Martin-Luther-Platz 20', false)

WebUI.verifyTextPresent('91522 Ansbach', false)

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT/span_PSD Bank Nrnberg eG Filia'))

WebUI.verifyTextPresent('PSD Bank Nürnberg eG, Filiale Bamberg', false)

WebUI.verifyTextPresent('Hauptwachstr. 11', false)

WebUI.verifyTextPresent('96047 Bamberg', false)

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT/span_Beratungsbro Bayreuth'))

WebUI.verifyTextPresent('Beratungsbüro Bayreuth', false)

WebUI.verifyTextPresent('Wölfelstraße 7', false)

WebUI.verifyTextPresent('95444 Bayreuth', false)

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT/span_Beratungsbro Regensburg'))

WebUI.verifyTextPresent('Beratungsbüro Regensburg', false)

WebUI.verifyTextPresent('Dr.-Leo-Ritter-Str. 2 (1. OG)', false)

WebUI.verifyTextPresent('93049 Regensburg', false)

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT/span_PSD Bank Nrnberg eG Filia_1'))

WebUI.verifyTextPresent('PSD Bank Nürnberg eG, Filiale Würzburg', false)

WebUI.verifyTextPresent('Ludwigstr. 22', false)

WebUI.verifyTextPresent('97070 Würzburg', false)

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT/a_Weiter'))

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (1)/span_Beratungsbro Aschaffenbur'))

WebUI.verifyTextPresent('Beratungsbüro Aschaffenburg', false)

WebUI.verifyTextPresent('Ludwigstr. 25', false)

WebUI.verifyTextPresent('63739 Aschaffenburg', false)

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (1)/span_PSD Bank Nrnberg eG Filia'))

WebUI.verifyTextPresent('PSD Bank Nürnberg eG, Filiale Chemnitz', false)

WebUI.verifyTextPresent('Bahnhofstraße 54a', false)

WebUI.verifyTextPresent('09111 Chemnitz', false)

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (1)/span_PSD Bank Nrnberg eG Filia_1'))

WebUI.verifyTextPresent('PSD Bank Nürnberg eG, Filiale Leipzig', false)

WebUI.verifyTextPresent('Brühl 65', false)

WebUI.verifyTextPresent('04109 Leipzig', false)

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (1)/span_PSD Bank Nrnberg eG Filia_2'))

WebUI.verifyTextPresent('PSD Bank Nürnberg eG, Filiale Dresden', false)

WebUI.verifyTextPresent('Hauptstr. 36', false)

WebUI.verifyTextPresent('01097 Dresden', false)

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT/a_1'))

WebUI.delay(2)

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/svg_dropdown-icons'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/div_Ansbach'))

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/div_Ansbach'))

WebUI.delay(2)

WebUI.verifyTextPresent('Martin-Luther-Platz 20', false)

WebUI.verifyTextPresent('91522 Ansbach', false)

WebUI.verifyTextPresent('Beratungsbüro Ansbach', false)

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/svg_dropdown-icons'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/div_Aschaffenburg'))

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/div_Aschaffenburg'))

WebUI.delay(2)

WebUI.verifyTextPresent('Beratungsbüro Aschaffenburg', false)

WebUI.verifyTextPresent('Ludwigstr. 25', false)

WebUI.verifyTextPresent('63739 Aschaffenburg', false)

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/svg_dropdown-icons'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/div_Bamberg'))

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/div_Bamberg'))

WebUI.delay(2)

WebUI.verifyTextPresent('PSD Bank Nürnberg eG, Filiale Bamberg', false)

WebUI.verifyTextPresent('Hauptwachstr. 11', false)

WebUI.verifyTextPresent('96047 Bamberg', false)

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/svg_dropdown-icons'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/div_Chemnitz'))

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/div_Chemnitz'))

WebUI.delay(2)

WebUI.verifyTextPresent('PSD Bank Nürnberg eG, Filiale Chemnitz', false)

WebUI.verifyTextPresent('Bahnhofstraße 54a', false)

WebUI.verifyTextPresent('09111 Chemnitz', false)

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/svg_dropdown-icons'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/div_Leipzig'))

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/div_Leipzig'))

WebUI.delay(2)

WebUI.verifyTextPresent('PSD Bank Nürnberg eG, Filiale Leipzig', false)

WebUI.verifyTextPresent('Brühl 65', false)

WebUI.verifyTextPresent('04109 Leipzig', false)

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/svg_dropdown-icons'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/div_Regensburg'))

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/div_Regensburg'))

WebUI.delay(2)

WebUI.verifyTextPresent('Beratungsbüro Regensburg', false)

WebUI.verifyTextPresent('Dr.-Leo-Ritter-Str. 2 (1. OG)', false)

WebUI.verifyTextPresent('93049 Regensburg', false)

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/svg_dropdown-icons'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/div_Wrzburg'))

WebUI.click(findTestObject('42TF/Page_Filialsuche-nuernberg - BVR HT (2)/div_Wrzburg'))

WebUI.delay(2)

WebUI.verifyTextPresent('PSD Bank Nürnberg eG, Filiale Würzburg', false)

WebUI.verifyTextPresent('Ludwigstr. 22', false)

WebUI.verifyTextPresent('97070 Würzburg', false)

WebUI.closeBrowser()

