package org.gradle;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class EstructurasDatosTest {

	private EstructurasDatos estructuraDeDatos;

	@Before
	public void setup() {
		estructuraDeDatos = new EstructurasDatos();
	}

	@Test
	public void ingreso3y4Obtengo7Test() {

		// arrange - definicion de la variables
		int nro1 = 3;
		int nro2 = 4;

		/*
		 * EstructurasDatos estructuraDeDatos = new EstructurasDatos(); como se repite
		 * podemos sacar la variable a nivel global y inicializarla en el @Before
		 */

		// act- accion

		int resultado = estructuraDeDatos.suma(nro1, nro2);

		// assert
		Assert.assertEquals(7, resultado);

	}

	@Test
	public void ingreso30y50Obtengo80Test() {
		// arrange definicion de la variables
		int nro1 = 30;
		int nro2 = 50;

		// EstructurasDatos estructuraDeDatos = new EstructurasDatos();

		// act- llamado a la accion

		int resultado = estructuraDeDatos.suma(nro1, nro2);

		// assert - lo que espero
		Assert.assertEquals(80, resultado);

	}

	@Test
	public void ingreso4yObtengo5Test() {
		// arrange definicion de la variables
		int nro1 = 4;

		// act- accion

		int resultado = estructuraDeDatos.sumarUno(nro1);

		// assert
		Assert.assertEquals(5, resultado);

	}

	@Test
	public void ingreso5y3Obtengo2Test() {
		// arrange definicion de la variables
		int nro1 = 5;
		int nro2 = 3;

		// act- accion

		int resultado = estructuraDeDatos.restaDosNumeros(nro1, nro2);

		// assert
		// Assert.assertEquals(2, resultado);
		assertEquals(2, resultado);
	}

	@Test
	public void ingreso8y4Obtengo4Test() {
		// arrange definicion de la variables
		int nro1 = 8;
		int nro2 = 4;

		// act- accion

		int resultado = estructuraDeDatos.restaDosNumeros(nro1, nro2);

		// assert
		// Assert.assertEquals(2, resultado);
		assertEquals(4, resultado);
	}

	@Test
	public void ingreso4y2Obtengo2Test() {
		// arrange definicion de la variables
		int nro1 = 4;
		int nro2 = 2;

		// act- accion

		int resultado = estructuraDeDatos.restaDosNumeros(nro1, nro2);

		// assert
		// Assert.assertEquals(2, resultado);
		assertEquals(2, resultado);
	}

	@Test
	public void ingreso2y5Obtengo10Test() {
		// arrange definicion de la variables
		int nro1 = 2;
		int nro2 = 5;

		// act- accion

		int resultado = estructuraDeDatos.multiplicarDosNumeros(nro1, nro2);

		// assert
		// Assert.assertEquals(2, resultado);
		assertEquals(10, resultado);
	}

	@Test
	public void ingreso7y3Obtengo21Test() {
		// arrange definicion de la variables
		int nro1 = 7;
		int nro2 = 3;

		// act- accion

		int resultado = estructuraDeDatos.multiplicarDosNumeros(nro1, nro2);

		// assert
		// Assert.assertEquals(2, resultado);
		assertEquals(21, resultado);
	}

	@Test
	public void ingreso2y2Obtengo4Test() {
		// arrange definicion de la variables
		int nro1 = 2;
		int nro2 = 2;

		// act- accion

		int resultado = estructuraDeDatos.multiplicarDosNumeros(nro1, nro2);

		// assert
		// Assert.assertEquals(2, resultado);
		assertEquals(4, resultado);
	}

	@Test
	public void ingreso6y2Obtengo3Test() {
		// arrange definicion de la variables
		int nro1 = 6;
		int nro2 = 2;

		// act- accion

		int resultado = estructuraDeDatos.dividirDosNumeros(nro1, nro2);

		// assert
		// Assert.assertEquals(2, resultado);
		assertEquals(3, resultado);
	}

	@Test
	public void ingreso10y5Obtengo2Test() {
		// arrange definicion de la variables
		int nro1 = 10;
		int nro2 = 5;

		// act- accion

		int resultado = estructuraDeDatos.dividirDosNumeros(nro1, nro2);

		// assert
		// Assert.assertEquals(2, resultado);
		assertEquals(2, resultado);
	}

	@Test
	public void ingreso2y2Obtengo1Test() {
		// arrange definicion de la variables
		int nro1 = 2;
		int nro2 = 2;

		// act- accion

		int resultado = estructuraDeDatos.dividirDosNumeros(nro1, nro2);

		// assert
		// Assert.assertEquals(2, resultado);
		assertEquals(1, resultado);
	}

	@Test
	public void ingreso5yObtengo4Test() {
		// arrange definicion de la variables
		int nro1 = 5;

		// act- accion

		int resultado = estructuraDeDatos.restarUno(nro1);

		// assert
		assertEquals(4, resultado);

	}

	@Test
	public void ingreso4yObtengo3Test() {
		// arrange definicion de la variables
		int nro1 = 4;

		// act- accion

		int resultado = estructuraDeDatos.restarUno(nro1);

		// assert
		assertEquals(3, resultado);

	}

	@Test
	public void ingreso9yObtengo8Test() {
		// arrange definicion de la variables
		int nro1 = 9;

		// act- accion

		int resultado = estructuraDeDatos.restarUno(nro1);

		// assert
		assertEquals(8, resultado);

	}

	@Test
	public void ingresoholayObtengoholaTest() {
		// arrange definicion de la variables
		String nombre = "hola";

		// act- accion

		String resultado = estructuraDeDatos.devolverString(nombre);

		// assert
		assertEquals("hola", resultado);

	}

	@Test
	public void ingresoBancolombiayObtengoBancolombiaTest() {
		// arrange definicion de la variables
		String nombre = "Bancolombia";

		// act- accion

		String resultado = estructuraDeDatos.devolverString(nombre);

		// assert
		assertEquals("Bancolombia", resultado);

	}

	@Test
	public void ingresofUnCiOnAlyObtengofUnCiOnAlTest() {
		// arrange definicion de la variables
		String nombre = "fUnCiOnAl";

		// act- accion

		String resultado = estructuraDeDatos.devolverString(nombre);

		// assert
		assertEquals("fUnCiOnAl", resultado);

	}

	@Test
	public void ingresoholayObtengoNumeroCaracteresTest() {
		// arrange definicion de la variables
		String nombre = "hola";

		// act- accion

		int resultado = estructuraDeDatos.contarCaracteres(nombre);

		// assert
		assertEquals(4, resultado);

	}

	@Test
	public void ingresofUnCiOnAlyObtengoNumeroCaracteresTest() {
		// arrange definicion de la variables
		String nombre = "fUnCiOnAl";

		// act- accion

		int resultado = estructuraDeDatos.contarCaracteres(nombre);

		// assert
		assertEquals(9, resultado);

	}

	@Test
	public void ingresoBancolombiayObtengoNumeroCaracteresTest() {
		// arrange definicion de la variables
		String nombre = "Bancolombia";

		// act- accion

		int resultado = estructuraDeDatos.contarCaracteres(nombre);

		// assert
		assertEquals(11, resultado);

	}

	@Test
	public void ingreso5yObtengoTrueTest() {
		// arrange definicion de la variables
		int nro1 = 5;

		// act- accion

		boolean resultado = estructuraDeDatos.devolverBoleano(nro1);

		// assert
		assertTrue(resultado);

	}

	@Test
	public void ingreso4yObtengoFalseTest() {
		// arrange definicion de la variables
		int nro1 = 4;

		// act- accion

		boolean resultado = estructuraDeDatos.devolverBoleano(nro1);

		// assert
		assertFalse(resultado);

	}

	@Test
	public void ingreso3yObtengoFalseTest() {
		// arrange definicion de la variables
		int nro1 = 3;

		// act- accion

		boolean resultado = estructuraDeDatos.devolverBoleano(nro1);

		// assert
		assertFalse(resultado);
	}

	@Test
	public void ingreso2yObtengoFalseTest() {
		// arrange definicion de la variables
		int nro1 = 2;

		// act- accion

		boolean resultado = estructuraDeDatos.devolverBoleano(nro1);

		// assert
		assertFalse(resultado);
	}
	
	@Test
	public void ingresoPositivo5yObtengoPositivoTest() {
		// arrange definicion de la variables
		int nro1 = 5;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarEntero(nro1);

		// assert
		assertTrue(resultado);
	}
	
	@Test
	public void ingresoNegativo3yObtengoNegativoTest() {
		// arrange definicion de la variables
		int nro1 = -3;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarEntero(nro1);

		// assert
		assertFalse(resultado);
	}
	
	@Test
	public void ingresoPositivo2yObtengoPositivoTest() {
		// arrange definicion de la variables
		int nro1 = 2;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarEntero(nro1);

		// assert
		assertTrue(resultado);
	}
	
	@Test
	public void ingresoNegativo5yObtengoNegativoTest() {
		// arrange definicion de la variables
		int nro1 = -5;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarEntero(nro1);

		// assert
		assertFalse(resultado);
	}
	
	@Test
	public void ingresoPositivo0yObtengoPositivoTest() {
		// arrange definicion de la variables
		int nro1 = 0;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarEntero(nro1);

		// assert
		assertTrue(resultado);
	}
	
	@Test
	public void ingresoNumero2yObtengoParTest() {
		// arrange definicion de la variables
		int nro1 = 2;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarParEImpar(nro1);

		// assert
		assertTrue(resultado);
	}
	
	@Test
	public void ingresoNumero3yObtengoImparTest() {
		// arrange definicion de la variables
		int nro1 = 3;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarParEImpar(nro1);

		// assert
		assertFalse(resultado);
	}
	
	@Test
	public void ingresoNumero4yObtengoParTest() {
		// arrange definicion de la variables
		int nro1 = 4;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarParEImpar(nro1);

		// assert
		assertTrue(resultado);
	}
	
	@Test
	public void ingresoNumero5yObtengoImparTest() {
		// arrange definicion de la variables
		int nro1 = 5;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarParEImpar(nro1);

		// assert
		assertFalse(resultado);
	}
	
	@Test
	public void ingresoNumero2yObtengo2Test() {
		// arrange definicion de la variables
		int nro1 = 2;

		// act- accion

		int resultado = estructuraDeDatos.evaluarCambioAPositivo(nro1);

		// assert
		assertEquals(2, resultado);
	}
	
	@Test
	public void ingresoNumeroNegativo4yObtengo4Test() {
		// arrange definicion de la variables
		int nro1 = -4;

		// act- accion

		int resultado = estructuraDeDatos.evaluarCambioAPositivo(nro1);

		// assert
		assertEquals(4, resultado);
	}
	
	@Test
	public void ingresoNumeroNegativo6yObtengo6Test() {
		// arrange definicion de la variables
		int nro1 = -6;

		// act- accion

		int resultado = estructuraDeDatos.evaluarCambioAPositivo(nro1);

		// assert
		assertEquals(6, resultado);
	}
	
	@Test
	public void ingresoNumeroPositivo7yObtengo7Test() {
		// arrange definicion de la variables
		int nro1 = 7;

		// act- accion

		int resultado = estructuraDeDatos.evaluarCambioAPositivo(nro1);

		// assert
		assertEquals(7, resultado);
	}
	
	@Test
	public void ingresoTrueTrueyTrueTest() {
		// arrange definicion de la variables
		boolean variable_1 = true;
		boolean variable_2 = true;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarTablasDeVerdadSi(variable_1,variable_2);

		// assert
		assertTrue(resultado);
	}
	
	@Test
	public void ingresoTrueFalseyObtengoFalseTest() {
		// arrange definicion de la variables
		boolean variable_1 = true;
		boolean variable_2 = false;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarTablasDeVerdadSi(variable_1,variable_2);

		// assert
		assertFalse(resultado);
	}
	
	@Test
	public void ingresoFalseTrueyObtengoFalseTest() {
		// arrange definicion de la variables
		boolean variable_1 = false;
		boolean variable_2 = true;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarTablasDeVerdadSi(variable_1,variable_2);

		// assert
		assertFalse(resultado);
	}
	
	@Test
	public void ingresoFalseFalseyObtengoFalseTest() {
		// arrange definicion de la variables
		boolean variable_1 = false;
		boolean variable_2 = false;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarTablasDeVerdadSi(variable_1,variable_2);

		// assert
		assertFalse(resultado);
	}
	
	@Test
	public void ingresoTrueTrueyObtengoTrueTest() {
		// arrange definicion de la variables
		boolean variable_1 = true;
		boolean variable_2 = true;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarTablasDeVerdadOr(variable_1,variable_2);

		// assert
		assertTrue(resultado);
	}
	
	@Test
	public void ingresoTrueFalseyObtengoTrueTest() {
		// arrange definicion de la variables
		boolean variable_1 = true;
		boolean variable_2 = false;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarTablasDeVerdadOr(variable_1,variable_2);

		// assert
		assertTrue(resultado);
	}
	
	@Test
	public void ingresoFalseTrueyObtengoTrueTest() {
		// arrange definicion de la variables
		boolean variable_1 = false;
		boolean variable_2 = true;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarTablasDeVerdadOr(variable_1,variable_2);

		// assert
		assertTrue(resultado);
	}
	
	@Test
	public void ingresoFalseFalseyObtengoFalse2Test() {
		// arrange definicion de la variables
		boolean variable_1 = false;
		boolean variable_2 = false;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarTablasDeVerdadOr(variable_1,variable_2);

		// assert
		assertFalse(resultado);
	}
	
	@Test
	public void ingresoTrueyObtengoFalseTest() {
		// arrange definicion de la variables
		boolean variable_1 = true;
		

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarTablasDeVerdadNegacion(variable_1);

		// assert
		assertFalse(resultado);
	}
	
	@Test
	public void ingresoFalseyObtengoTrueTest() {
		// arrange definicion de la variables
		boolean variable_1 = false;
		

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarTablasDeVerdadNegacion(variable_1);

		// assert
		assertTrue(resultado);
	}
	
	@Test
	public void ingresoRojoyVerdeyObtengoNavidadTest() {
		// arrange definicion de la variables
		String color_1 = "Rojo";
		String color_2 = "Verde";
		

		// act- accion

		String resultado = estructuraDeDatos.definirFestividad(color_1,color_2);

		// assert
		assertEquals("Navidad",resultado);
	}
	
	@Test
	public void ingresoVerdeyNaranjayObtengoHalloweenTest() {
		// arrange definicion de la variables
		String color_1 = "Verde";
		String color_2 = "Naranja";
		

		// act- accion

		String resultado = estructuraDeDatos.definirFestividad(color_1,color_2);

		// assert
		assertEquals("Halloween",resultado);
	}
	
	@Test
	public void ingresoRojoyNaranjayObtengoPascuaTest() {
		// arrange definicion de la variables
		String color_1 = "Rojo";
		String color_2 = "Naranja";
		

		// act- accion

		String resultado = estructuraDeDatos.definirFestividad(color_1,color_2);

		// assert
		assertEquals("Pascua",resultado);
	}
}
