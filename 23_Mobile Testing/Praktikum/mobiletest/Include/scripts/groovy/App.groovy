import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class App {
	@Given("User open the aplicasition")
	public void openApplication() {
		Mobile.startApplication('/Users/User/Downloads/app.apk', true)
	}

	@And("User register to the application ")
	public void userRegistration() {
		Mobile.tap(findTestObject('Object Repository/android.widget.TextView - No account yet Create one (3)'), 0)
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (13)'), 'Rini Muzayanah', 0)
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (14)'), 'rimzynh@gmail.com', 0)
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (15)'), 'Bismillah7.', 0)
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (16)'), 'Bismillah7.', 0)
	}

	@When("User successfully register")
	public void successfullyRegister() {
		Mobile.tap(findTestObject('Object Repository/android.widget.Button - REGISTER (3)'), 0)
	}

	@And("Press Back to Login")
	public void backToLogin() {
		Mobile.pressBack();
	}

	@And("User set in Email {string}")
	public void setEmail(String email) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (16)'), 'rimzynh@gmail.com', 0)
	}

	@And("User click login button")
	public void clickLoginButton() {
		Mobile.tap(findTestObject('Object Repository/android.widget.Button - LOGIN (1)'), 0)
	}

	@Then("User cannot logged in to the application because password is empty")
	public void loginFailed() {
		Mobile.closeApplication()
	}

	@Given("User open app application")
	public void openApp() {
		Mobile.startApplication('/Users/User/Downloads/app.apk', true)
	}

	@And("User register to the app")
	public void registerToApp() {
		Mobile.tap(findTestObject('Object Repository/android.widget.TextView - No account yet Create one'), 0)
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText'), 'Rini Muzayanah', 0)
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (1)'), 'rimzynh@gmail.com', 0)
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (2)'), 'Bismillah7.', 0)
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (3)'), 'Bismillah7.', 0)
	}
	@When("User successfully register to app")
	public void successRegisToApp() {
		Mobile.tap(findTestObject('Object Repository/android.widget.Button - REGISTER'), 0)
	}

	@And("Press Back")
	public void PressBack() {
		Mobile.pressBack();
	}

	@And("User set in Email field {string}")
	public void setInEmail(String email) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (4)'), 'rimzynh@gmail.com', 0)
	}

	@And("User set in Password field")
	public void setPassword(String password) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (5)'), 'Bismillah7.', 0)
	}

	@And("User click the login button")
	public void clickLogin() {
		Mobile.tap(findTestObject('Object Repository/android.widget.Button - LOGIN'), 0)
	}

	@Then("User success login")
	public void loginSuccess() {
		Mobile.closeApplication()
	}

	@Given("User open the app")
	public void open() {
		Mobile.startApplication('/Users/User/Downloads/app.apk', true)
	}

	@When("User redirect to the register page")
	public void registerPage() {
		Mobile.tap(findTestObject('Object Repository/android.widget.TextView - No account yet Create one (2)'), 0)
	}

	@And("User set Name {string}")
	public void name(String name) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (10)'), 'Rini Muzayanah', 0)
	}

	@And("User set Password {string}")
	public void password(String password) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (11)'), 'Bismillah7.', 0)
	}

	@And("User Confirm password")
	public void confirmPassword(String confirmPassword) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (12)'), 'Bismillah7.', 0)
	}

	@And("User click Register button")
	public void registerButton() {
		Mobile.tap(findTestObject('Object Repository/android.widget.Button - REGISTER (6)'), 0)
	}

	@Then("Warning to enter valid email displayed")
	public void registFail() {
		Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Enter Valid Email'), 0)
		Mobile.closeApplication()
	}

	@Given("User open in the app")
	public void openTheApp() {
		Mobile.startApplication('/Users/User/Downloads/app.apk', true)
	}

	@When("User redirect in the register page")
	public void goToRegisterPage() {
		Mobile.tap(findTestObject('Object Repository/android.widget.TextView - No account yet Create one (1)'), 0)
	}

	@And("User set the Name {string}")
	public void setNameField(String name) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (6)'), 'Wiyan Herra Herviana', 0)
	}

	@And("User set the Email {string}")
	public void setEmailField(String email) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (7)'), 'wiyanherra9a@gmail.com', 0)
	}

	@And("User set the Password {string}")
	public void setPasswordField(String password) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (8)'), '@Alterra4', 0)
	}

	@And("User set confirmation password {string}")
	public void confirmThePassword() {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (8)'),'@Alterra4', 0)
	}

	@And("User click the Register button")
	public void clickRegistButton() {
		Mobile.tap(findTestObject('Object Repository/android.widget.Button - REGISTER (1)'), 0)
	}

	@Then("User successfully login")
	public void loginSuccessfully() {
		Mobile.tap(findTestObject('Object Repository/android.widget.FrameLayout (1)'), 0)
		Mobile.closeApplication()
	}

	@Given("User open aplikasi the app")
	public void openTheApplivation() {
		Mobile.startApplication('/Users/User/Downloads/app.apk', true)
	}

	@When("User redirect register page")
	public void goToRegister() {
		Mobile.tap(findTestObject('Object Repository/android.widget.TextView - No account yet Create one (4)'), 0)
	}

	@And("User set Name in the app {string}")
	public void setTheName(String name) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (18)'), 'Wiyan Herra Herviana', 0)
	}

	@And("User set Email in the app {string}")
	public void setTheEmail(String password) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (19)'), 'wiyanherra9a@gmail.com', 0)
	}

	@And("User set Password in the app {string}")
	public void setThePassword(String password) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (20)'), '@Alterra4', 0)
	}

	@And("User set Confirm Password in the app {string}")
	public void confirmThePassword(String confirmPassword) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (21)'), '@Alterra4', 0)
	}

	@And("User click in the register button")
	public void clickTheRegistButton() {
		Mobile.tap(findTestObject('Object Repository/5 - Dashboard/android.widget.Button - REGISTER'), 0)
	}

	@When("Press back to login page")
	public void backToLoginPage() {
		Mobile.pressBack()
	}

	@And("User set Email to app {string}")
	public void fillEmailp(String email) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (22)'), 'wiyanherra9a@gmail.com', 0)
	}

	@And("User set Passowrd in the app")
	public void fillPassword(String password) {
		Mobile.setText(findTestObject('Object Repository/android.widget.EditText (23)'), '@Alterra4', 0)
	}

	@And("User click in the login button")
	public void clickLoginBtn() {
		Mobile.tap(findTestObject('Object Repository/android.widget.Button - LOGIN (2)'), 0)
	}

	@Then("User can successfully go to dashboard")
	public void successViewDashboard() {
		Mobile.tap(findTestObject('Object Repository/android.widget.FrameLayout'), 0)
		Mobile.closeApplication()
	}
}