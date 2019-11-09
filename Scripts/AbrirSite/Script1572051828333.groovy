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

WebUI.openBrowser('http://localhost:4200/')
WebUI.maximizeWindow()
/* 1° CADASTRAR CATEGORIA
 * Está criando a categoria "Lanches Gourmet"
 */
WebUI.click(findTestObject('Object Repository/Pagina_Inicial/PaginaInicial_Btn_Categoria'))
WebUI.click(findTestObject('Object Repository/Pagina_Categoria/Pag_Categoria_Btn_NovaCategoria'))
WebUI.setText(findTestObject('Object Repository/Pagina_Categoria/Pag_NovaCategoria_Campo_Nome'), 'Lanches')
WebUI.setText(findTestObject('Object Repository/Pagina_Categoria/Pag_NovaCategoria_Campo_Descricao'), 'Lanches Gourmet')
WebUI.click(findTestObject('Object Repository/Pagina_Categoria/Pag_NovaCategoria_Btn_CriarCategoria'))

/* 2° CRIAR PRODUTO
 * Está criando o produto Tilápia
 */
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Pagina_Inicial/PaginaInicial_Btn_Produtos'))
WebUI.click(findTestObject('Object Repository/Pagina_Produtos/Pag_Produtos_Btn_NovoProduto'))
WebUI.setText(findTestObject('Object Repository/Pagina_Produtos/Pag_NovoProduto_Campo_Nome'), 'Tilápia Grelhada')
WebUI.setText(findTestObject('Object Repository/Pagina_Produtos/Pag_NovoProduto_Campo_Descricao'), 'Acompanha Cebola Frita')
WebUI.selectOptionByValue(findTestObject('Object Repository/Pagina_Produtos/TesteDropdown'), '6', false)
WebUI.setText(findTestObject('Object Repository/Pagina_Produtos/Pag_NovoProduto_Campo_Preco'), '30')
WebUI.setText(findTestObject('Object Repository/Pagina_Produtos/Pag_NovoProduto_Campo_Imagem'), 'https://thumbs.dreamstime.com/b/teste-palavra-no-teclado-22545850.jpg')
WebUI.click(findTestObject('Object Repository/Pagina_Produtos/Pag_NovoProduto_Btn_CriarProduto'))


/* 3° EDITAR CATEGORIA
 * Refrigerante vai virar Cerveja
 */
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Pagina_Inicial/PaginaInicial_Btn_Categoria'))
WebUI.click(findTestObject('Object Repository/Pagina_Categoria/Pag_Categoria_Btn_EditarRefrigerante'))
WebUI.setText(findTestObject('Object Repository/Pagina_Categoria/Pag_EditarCategoria_Campo_Nome'), 'Cerveja')
WebUI.setText(findTestObject('Object Repository/Pagina_Categoria/Pag_EditarCategoria_Campo_Descricao'), 'Artesanais da Casa')
WebUI.click(findTestObject('Object Repository/Pagina_Categoria/Pag_EditarCategoria_Btn_SalvarCategoria'))

/* 4° EDITAR PRODUTO
 * Fraldinha vai virar Salmão
 */
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Pagina_Inicial/PaginaInicial_Btn_Produtos'))
WebUI.click(findTestObject('Object Repository/Pagina_Produtos/Pag_EditarProduto_Btn_EditarFraldinha'))
WebUI.setText(findTestObject('Object Repository/Pagina_Produtos/Pag_EditarProduto_Campo_Nome'), 'Salmão')
WebUI.setText(findTestObject('Object Repository/Pagina_Produtos/Pag_EditarProduto_Campo_Descricao'), 'Salmão Grelhado')
WebUI.setText(findTestObject('Object Repository/Pagina_Produtos/Pag_EditarProduto_Campo_Preco'), '25')
WebUI.setText(findTestObject('Object Repository/Pagina_Produtos/Pag_NovoProduto_Campo_Imagem'), 'https://thumbs.dreamstime.com/b/teste-palavra-no-teclado-22545850.jpg')
WebUI.click(findTestObject('Object Repository/Pagina_Produtos/Pag_EditarProduto_Btn_SalvarProduto'))

/* 5° EXCLUIR CATEGORIA
 * Categoria sendo excluída: DOCE
 */
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Pagina_Inicial/PaginaInicial_Btn_Categoria'))
WebUI.click(findTestObject('Object Repository/Pagina_Categoria/Pag_Categoria_Btn_ExcluirDoces'))
WebUI.acceptAlert()

/* 6° EXCLUIR PRODUTO
 * Produto sendo excluído: Mousse de Maracujá
 */
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Pagina_Inicial/PaginaInicial_Btn_Produtos'))
WebUI.click(findTestObject('Object Repository/Pagina_Produtos/Pag_Produto_Btn_ExcluirMousseMaracuja'))
WebUI.acceptAlert()

/* 7° REALIZAR PEDIDO
 * 
 */
WebUI.delay(1)
WebUI.click(findTestObject('Object Repository/Pagina_Inicial/PaginaInicial_Btn_Comprar'))
WebUI.click(findTestObject('Object Repository/Pagina_RealizarPedido/Pagina_RealizarPedido_Picanha'))
WebUI.click(findTestObject('Object Repository/Pagina_RealizarPedido/Pagina_RealizarPedido_Salada'))
WebUI.click(findTestObject('Object Repository/Pagina_RealizarPedido/Pagina_RealizarPedido_SucoDeLaranja'))
WebUI.scrollToPosition(1, 1)
WebUI.click(findTestObject('Object Repository/Pagina_RealizarPedido/Btn_Finalizar_Pedido'))
