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

//WebUI.openBrowser('http://localhost:4200/')
//WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Pagina_Inicial/PaginaInicial_Btn_Produtos'))
WebUI.click(findTestObject('Object Repository/Pagina_Produtos/Pag_EditarProduto_Btn_EditarFraldinha'))
WebUI.setText(findTestObject('Object Repository/Pagina_Produtos/Pag_EditarProduto_Campo_Nome'), 'Salmão')
WebUI.setText(findTestObject('Object Repository/Pagina_Produtos/Pag_EditarProduto_Campo_Descricao'), 'Salmão Grelhado')
WebUI.setText(findTestObject('Object Repository/Pagina_Produtos/Pag_EditarProduto_Campo_Preco'), '25')
WebUI.setText(findTestObject('Object Repository/Pagina_Produtos/Pag_NovoProduto_Campo_Imagem'), 'https://thumbs.dreamstime.com/b/teste-palavra-no-teclado-22545850.jpg')
WebUI.click(findTestObject('Object Repository/Pagina_Produtos/Pag_EditarProduto_Btn_SalvarProduto'))

//WebUI.closeBrowser()