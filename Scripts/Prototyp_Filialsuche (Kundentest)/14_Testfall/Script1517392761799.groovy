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

WebUI.navigateToUrl('http://kundentest.dev-unitb.de/vr/ogrhtmlprototyp/filialsuche.html')

WebUI.delay(2)

WebUI.click(findTestObject('002/Page_Filialsuche-rotenburg - BVR HT/svg_dropdown-icons'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Belitz_option'))

WebUI.delay(2)

WebUI.click(findTestObject('Belitz_option'))

WebUI.delay(5)

ArrayList<WebElement> wes1 = WebUiCommonHelper.findWebElements(findTestObject('filial_map'), 5)

ArrayList<WebElement> wes2 = WebUiCommonHelper.findWebElements(findTestObject('loc_steet_filialsuche'), 5)

ArrayList<WebElement> wes3 = WebUiCommonHelper.findWebElements(findTestObject('filialsuche_loc_city'), 5)

int filial_maps_count = wes1.size()

int filial_accordeon_count = wes2.size()

int filial_count = 37

String city_name = 'Berlin'

if (filial_maps_count != filial_count) {
    WebUI.comment((('Anzahl Maps ' + filial_maps_count) + ' ist NICHT gleich Anzahl Filialen ') + filial_count)

    WebUI.closeBrowser()

    throw new StepFailedException((('Anzahl Maps ' + filial_maps_count) + ' ist NICHT gleich Anzahl Filialen ') + filial_count)
} else if (filial_accordeon_count != filial_count) {
    WebUI.comment((('Anzahl Accordeons ' + filial_accordeon_count) + ' ist NICHT gleich Anzahl Filialen ') + filial_count)

    WebUI.closeBrowser()

    throw new StepFailedException((('Anzahl Accordeons ' + filial_accordeon_count) + ' ist NICHT gleich Anzahl Filialen ') + 
    filial_count)
}

for (int i = 0; i < wes3.size(); i++) {
    el = wes3.get(i)

    city_text = el.getText()

    if (!(city_text.contains(city_name))) {
        WebUI.comment((('Accordeon ' + i + ' enthält ' + city_name) + ' NICHT: ') + el.getText())

        WebUI.closeBrowser()

        throw new StepFailedException((('Accordeon ' + i + ' enthält ' + city_name) + ' NICHT: ') + el.getText())
    }
}

WebUI.closeBrowser()

