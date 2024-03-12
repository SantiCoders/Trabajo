package Ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class claseTest {

	@Test
	void testCalcularIMC() {
		clase objeto = new clase();
		double res = objeto.calcularIMC(75, 1.80);
		assertEquals(23.148148148148145,res);
	}
	
	@Test
	void testClasificarIMC() {
		clase objeto = new clase();
		String res = objeto.clasificarIMC(23.148148148148148);
		assertEquals("Peso normal",res);
	}
	
	@Test
	void testEsPar() {
		clase objeto = new clase();
		boolean res = objeto.esPar(2);
		assertEquals(true,res);
	}
	
	@Test
	void testEjecutarSaludo() {
		clase objeto = new clase();
		String res = objeto.ejecutarSaludo("Hola", "Agustín");
		assertEquals("Hola Agustín",res);
	}
	
	@Test
	void testInteresCompuesto() {
		clase objeto = new clase();
		double res = objeto.interesCompuesto(10000.0,5.9f, 60);
		assertEquals(311714.9486829751,res);
	}
	
	@Test
	void testRedondear() {
		clase objeto = new clase();
		String res = objeto.redondear(311714.9486829751);
		assertEquals("311714,95",res);
	}
	
	@Test
	void testContarLetras() {
		clase objeto = new clase();
		int res = objeto.contarLetras("HOLA");
		assertEquals(4,res);
	}
	
	@Test
	void testContarCaracteresEnCadena() {
		clase objeto = new clase();
		int res = objeto.contarCaracteresEnCadena("HOLA", "A");
		assertEquals(1,res);
	}
}
