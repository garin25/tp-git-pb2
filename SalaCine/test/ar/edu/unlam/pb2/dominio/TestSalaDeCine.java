package ar.edu.unlam.pb2.dominio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestSalaDeCine {

	// cambios
	@Test
	 public void dadoQueExisteUnaSalaDeCineCon10Butacasy5FilasEstaContine10Butacasy5Filas(){
		 SalaDeCine sala = new SalaDeCine();
		 
		 
		 Integer valorEsperado1 = 10;
		 Integer valorEsperado2 = 5;
		 
		 Integer valorObtenido1= sala.obtenerNroDeButacas();
		 Integer valorObtenido2= sala.obtenerNroDeFilas();
		 
		 assertEquals(valorEsperado1,valorObtenido1);

		 assertEquals(valorEsperado2,valorObtenido2); 
		
	}
	
	
	
	
}
