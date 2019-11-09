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

WebUI.openBrowser('http://localhost:4200/')
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Pagina_Inicial/PaginaInicial_Btn_Comprar'))
WebUI.click(findTestObject('Object Repository/Pagina_RealizarPedido/Pagina_RealizarPedido_Picanha'))
WebUI.click(findTestObject('Object Repository/Pagina_RealizarPedido/Pagina_RealizarPedido_Salada'))
WebUI.click(findTestObject('Object Repository/Pagina_RealizarPedido/Pagina_RealizarPedido_SucoDeLaranja'))
WebUI.scrollToPosition(1, 1)
WebUI.click(findTestObject('Object Repository/Pagina_RealizarPedido/Btn_Finalizar_Pedido'))

//WebUI.closeBrowser()