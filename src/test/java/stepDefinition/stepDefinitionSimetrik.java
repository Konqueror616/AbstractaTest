package stepDefinition;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pagesObject.googlePage;

public class stepDefinitionSimetrik {
	
	googlePage google_page_object = new googlePage();
	
	@Given("^ingreso a google a chrome$")
	public void ingreso_a_google_a_chrome(){
		google_page_object.launchBrowser();
		google_page_object.openURL("https://www.google.com.co");
	}

	@When("^busco la palabra \"([^\"]*)\"$")
	public void busco_la_palabra(String paramter) {
		google_page_object.searchBox().sendKeys(paramter);
		google_page_object.searchBox().submit();
	}

	@Then("^se muestran resultados para la busqueda$")
	public void se_muestran_resultados_para_la_busqueda()  {
		
		boolean success = false;
		if(google_page_object.results().size() != 0) {
			success = true;
		}
		
		google_page_object.closeBrowser();
		assertTrue("Busqueda no tiene resultados",success);
	}
}
