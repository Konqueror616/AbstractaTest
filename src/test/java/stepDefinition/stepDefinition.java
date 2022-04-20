package stepDefinition;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagesObject.mercadoLibrePage;

public class stepDefinition {
	
	mercadoLibrePage mercado_libre_page_object = new mercadoLibrePage();
	
	@Given("^ingreso a la pagina de MercadoLibre$")
	public void ingreso(){
		
		mercado_libre_page_object.launchBrowser();
		mercado_libre_page_object.openURL("https://www.mercadolibre.cl/");
	}

	@When("^busco la palabra \"([^\"]*)\"$")
	public void buscar(String parametro) {
		mercado_libre_page_object.searchBox().sendKeys(parametro);
		mercado_libre_page_object.searchButton().submit();
	}

	@Then("^se muestra el detalle de los \"([^\"]*)\" primeros resultados para la busqueda$")
	public void resultados(int cantidad)  {
		
		boolean success = false;
		
		for(int i = 1; i < cantidad+1; i++) {
			
			System.out.println("Nombre del producto "+i+": "+ mercado_libre_page_object.nameProduct(i).getText());
			System.out.println("Precio del producto "+i+": "+ mercado_libre_page_object.priceProduct(i).getText());
			System.out.println("Link del producto "+i+": "+ mercado_libre_page_object.accessLinkProduct(i).getAttribute("href"));
			System.out.println("\n");
		}
		
		
		if(cantidad > 0)
			success = true;
		
		mercado_libre_page_object.closeBrowser();
		assertTrue("Cantidad a buscar no puede ser 0",success);
	}
}
