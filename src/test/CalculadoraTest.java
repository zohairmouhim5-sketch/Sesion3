package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Calculadora;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSuma() {
		assertEquals(5, Calculadora.suma(2,3));
	}
	
	
	@Test
	void testRestaer() {
		int valorEsperado = 3;
		int valorReal = Calculadora.restar(5,  2);
		
		assertEquals(valorEsperado, valorReal);
	}
	
	@Test
	void testDividir() {
		int valorEsperado = 0;
		int valorReal = Calculadora.dividir(1,  2);
		
		assertEquals(valorEsperado, valorReal);
	}
	
	@Test
	void testMultiplicar() {
		int valorEsperado = 20;
		int valorReal = Calculadora.multiplicar(5,  4);
		
		assertEquals(valorEsperado, valorReal);
	}
	

}
