import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.urlBlibli)

WebUI.maximizeWindow()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.blibli.com/')

WebUI.click(findTestObject('Object Repository/Page_Online Mall Bliblicom Sensasi Belanja Online Shop ala Mall/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_Online Mall Bliblicom Sensasi Belanja Online Shop ala Mall/input_atau_input input--email'), 
    'semuaada@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Online Mall Bliblicom Sensasi Belanja Online Shop ala Mall/input_atau_input input--password'), 
    '8SQVv/p9jVRYfSV/eMGvjg==')

WebUI.click(findTestObject('Object Repository/Page_Online Mall Bliblicom Sensasi Belanja Online Shop ala Mall/button_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_Online Mall Bliblicom Sensasi Belanja Online Shop ala Mall/input_Galeri Indonesia_s'), 
    'rokok')

WebUI.sendKeys(findTestObject('Object Repository/Page_Online Mall Bliblicom Sensasi Belanja Online Shop ala Mall/input_Galeri Indonesia_s'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Jual Rokok Murah - Gratis Ongkir  Bliblicom/button_Saya berumur 21'))

WebUI.click(findTestObject('Object Repository/Page_Jual Rokok Murah - Gratis Ongkir  Bliblicom/img'))

WebUI.click(findTestObject('Object Repository/Page_Jual Surabaya - Djarum Super Rokok 16 Batang Bungkus Terbaru - Harga Promo Juli 2019  Bliblicom/div_BELI SEKARANG'))

WebUI.closeBrowser()

