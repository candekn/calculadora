package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testeo {

	@Test
	public void test() throws Exception {
		Calculadora miCalculadora = new Calculadora();
		Double esperado=4.0;
		assertEquals(esperado, miCalculadora.Dividir(20.0, 5.0),2);
	}
	/*@Test
	public void testDividir1(){
		Calculadora miCalculadora = new Calculadora();
		Double esperado=4.0;
		try {
			assertEquals(esperado, miCalculadora.Dividir(20.0, 5.0),2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	@Test
	(expected=Exception.class)
	public void testQueVerifiqueQueLanceUnaException() throws Exception {
		Calculadora miCalculadora = new Calculadora();
		miCalculadora.Dividir(20.0, 0.0);
	}

}
