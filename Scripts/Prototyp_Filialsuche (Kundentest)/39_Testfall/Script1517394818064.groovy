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

WebUI.maximizeWindow()

WebUI.deleteAllCookies()

WebUI.navigateToUrl('http://kundentest.dev-unitb.de/vr/ogrhtmlprototyp/filialsuche.html')

WebUI.delay(2)

WebUI.click(findTestObject('002/Page_Filialsuche-rotenburg - BVR HT/svg_dropdown-icons'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Belitz_option'), 2)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Belitz_option'))

WebUI.delay(2)

WebUI.click(findTestObject('Belitz_option'))

WebUI.delay(5)

ArrayList<WebElement> wes = WebUiCommonHelper.findWebElements(findTestObject('loc_steet_filialsuche'), 5)

for (int i = 1; i < wes.size(); i++) {
    el = wes.get(i)

    el_prev = wes.get(i - 1)

    char ch = el.getText().charAt(0)

    char ch_prev = el_prev.getText().charAt(0)

    if (ch_prev > ch) {
        WebUI.comment((('Sortierung ist NICHT alphabetisch: ' + el.getText()) + ' und ') + el_prev.getText())

        WebUI.closeBrowser()

        throw new StepFailedException((('Sortierung ist NICHT alphabetisch: ' + el.getText()) + ' und ') + el_prev.getText())
    } else if (ch_prev == ch) {
        ch = el.getText().charAt(1)

        ch_prev = el_prev.getText().charAt(1)

        if (ch_prev > ch) {
            WebUI.comment((('Sortierung ist NICHT alphabetisch: ' + el.getText()) + ' und ') + el_prev.getText())

            WebUI.closeBrowser()

            throw new StepFailedException((('Sortierung ist NICHT alphabetisch: ' + el.getText()) + ' und ') + el_prev.getText())
        } else if (ch_prev == ch) {
            ch = el.getText().charAt(2)

            ch_prev = el_prev.getText().charAt(2)

            if (ch_prev > ch) {
                WebUI.comment((('Sortierung ist NICHT alphabetisch: ' + el.getText()) + ' und ') + el_prev.getText())

                WebUI.closeBrowser()

                throw new StepFailedException((('Sortierung ist NICHT alphabetisch: ' + el.getText()) + ' und ') + el_prev.getText())
            }
        }
    }
}

WebUI.closeBrowser()

