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

import org.codehaus.groovy.transform.tailrec.VariableReplacedListener
import org.openqa.selenium.By as By
import com.kms.katalon.core.exception.StepFailedException as StepFailedException
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.remote.RemoteWebElement

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.deleteAllCookies()

WebUI.navigateToUrl('http://kundentest.dev-unitb.de/vr/ogrhtmlprototyp/filialsuche-textinput.html')

WebUI.delay(5)

WebUI.setText(findTestObject('Filialsuche_Inputtext'), 'Berlin')

WebUI.delay(2)

WebUI.submit(findTestObject('Filialsuche_submit_button'))

WebUI.delay(2)

ArrayList<WebElement> wes = WebUiCommonHelper.findWebElements(findTestObject('Filialsuche_loc_distance'), 5)

ArrayList<WebElement> wes2 = WebUiCommonHelper.findWebElements(findTestObject('Filialsuche_paginierung'), 5)

int s = wes.size()

int[] distance = new int[s]

int j = 0

for (int i = 0; i < s; i++) {
    el1 = wes.get(i)
	
    if (!(el1.isDisplayed())) {
		j = j + 1
		
        el2 = wes2.get(j)

        el2.click()

        WebUI.delay(2)
    }
    
    text1 = el1.getText()

    tmp1 = text1.split(' ')

    num1 = tmp1[0].replaceAll(',', '.')

    km1 = Float.parseFloat(num1)

    distance[i] = km1
	
	/*   el2 = wes.get(i - 1)

    text2 = el2.getText()

    tmp2 = text2.split(' ')

    num2 = tmp2[0].replaceAll(',', '.')

    km2 = Float.parseFloat(num2)

    if (km2 > km1) {
        WebUI.comment('Sortierung ist NICHT nach Entfernung!')

        WebUI.closeBrowser()

        throw new StepFailedException('Sortierung ist NICHT nach Entfernung!')
    }*/
}

for (int i = 2; i < s; i++) {
    if (distance[i] < distance[i - 1]) {
        WebUI.comment('Sortierung ist NICHT nach Entfernung! Siehe Eintrag Nr. ' + i)

        WebUI.closeBrowser()

        throw new StepFailedException('Sortierung ist NICHT nach Entfernung! Siehe Eintrag Nr. ')
    }
}

WebUI.closeBrowser()