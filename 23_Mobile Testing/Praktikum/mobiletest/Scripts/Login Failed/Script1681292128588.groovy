import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('/Users/User/Downloads/app.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - No account yet Create one (3)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (13)'), 'Rini Muzayanah', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (14)'), 'rimzynh@gmail.com', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (15)'), 'Bismillah7.', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (16)'), 'Bismillah7.', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - REGISTER (3)'), 0)

Mobile.pressBack()

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (17)'), 'rimzynh@gmail.com', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - LOGIN (1)'), 0)

Mobile.closeApplication()

