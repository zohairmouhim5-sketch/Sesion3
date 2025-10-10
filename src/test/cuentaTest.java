package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class cuentaTest {
	
	private static Cuenta cuenta;
	private static Cuenta c12345;
	private static Cuenta c67890;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta = new Cuenta(0);
		c12345 = new Cuenta(50);
		c67890 = new Cuenta(0);
		c12345.setNumero("12345");
		c67890.setNumero("67890");
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
	void testIngresar() {
		cuenta.ingresar(500);
		assertEquals(500, cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() {
		cuenta.retirar(500);
		assertEquals(-500, cuenta.getSaldo());
	}
	
	@Test
	void test0014() {
		c12345.retirar(200);
		assertEquals(-150, c12345.getSaldo());
		
		c67890.retirar(350);
		assertEquals(-350, c67890.getSaldo());
		
		c12345.ingresar(100);
		assertEquals(-50, c12345.getSaldo());
		
		c67890.retirar(200);
		assertEquals(-550, c67890.getSaldo());
		
		c67890.retirar(150);
		assertEquals(-700, c67890.getSaldo());
		
		c12345.retirar(200);
		assertEquals(-250, c12345.getSaldo());
		
		c67890.ingresar(50);
		assertEquals(-650, c67890.getSaldo());
		
		c67890.retirar(100);
		assertEquals(-450, c67890.getSaldo());
		
		assertEquals(-250, c12345.getSaldo());
	}
}
