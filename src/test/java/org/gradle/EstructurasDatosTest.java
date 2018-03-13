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

		boolean resultado = estructuraDeDatos.evaluarTablasDeVerdadSi(variable_1, variable_2);

		// assert
		assertTrue(resultado);
	}

	@Test
	public void ingresoTrueFalseyObtengoFalseTest() {
		// arrange definicion de la variables
		boolean variable_1 = true;
		boolean variable_2 = false;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarTablasDeVerdadSi(variable_1, variable_2);

		// assert
		assertFalse(resultado);
	}

	@Test
	public void ingresoFalseTrueyObtengoFalseTest() {
		// arrange definicion de la variables
		boolean variable_1 = false;
		boolean variable_2 = true;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarTablasDeVerdadSi(variable_1, variable_2);

		// assert
		assertFalse(resultado);
	}

	@Test
	public void ingresoFalseFalseyObtengoFalseTest() {
		// arrange definicion de la variables
		boolean variable_1 = false;
		boolean variable_2 = false;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarTablasDeVerdadSi(variable_1, variable_2);

		// assert
		assertFalse(resultado);
	}

	@Test
	public void ingresoTrueTrueyObtengoTrueTest() {
		// arrange definicion de la variables
		boolean variable_1 = true;
		boolean variable_2 = true;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarTablasDeVerdadOr(variable_1, variable_2);

		// assert
		assertTrue(resultado);
	}

	@Test
	public void ingresoTrueFalseyObtengoTrueTest() {
		// arrange definicion de la variables
		boolean variable_1 = true;
		boolean variable_2 = false;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarTablasDeVerdadOr(variable_1, variable_2);

		// assert
		assertTrue(resultado);
	}

	@Test
	public void ingresoFalseTrueyObtengoTrueTest() {
		// arrange definicion de la variables
		boolean variable_1 = false;
		boolean variable_2 = true;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarTablasDeVerdadOr(variable_1, variable_2);

		// assert
		assertTrue(resultado);
	}

	@Test
	public void ingresoFalseFalseyObtengoFalse2Test() {
		// arrange definicion de la variables
		boolean variable_1 = false;
		boolean variable_2 = false;

		// act- accion

		boolean resultado = estructuraDeDatos.evaluarTablasDeVerdadOr(variable_1, variable_2);

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

		String resultado = estructuraDeDatos.definirFestividad(color_1, color_2);

		// assert
		assertEquals("Navidad", resultado);
	}

	@Test
	public void ingresoVerdeyNaranjayObtengoHalloweenTest() {
		// arrange definicion de la variables
		String color_1 = "Verde";
		String color_2 = "Naranja";

		// act- accion

		String resultado = estructuraDeDatos.definirFestividad(color_1, color_2);

		// assert
		assertEquals("Halloween", resultado);
	}

	@Test
	public void ingresoRojoyNaranjayObtengoPascuaTest() {
		// arrange definicion de la variables
		String color_1 = "Rojo";
		String color_2 = "Naranja";

		// act- accion

		String resultado = estructuraDeDatos.definirFestividad(color_1, color_2);

		// assert
		assertEquals("Pascua", resultado);
	}

	@Test
	public void ingreso8y18yObtengoTrue() {
		// arrange definicion de la variables
		int int1 = 8;
		int int2 = 18;

		// act- accion

		boolean resultado = estructuraDeDatos.definirUltimo(int1, int2);

		// assert
		assertTrue(resultado);
	}

	@Test
	public void ingreso3y113yObtengoTrue() {
		// arrange definicion de la variables
		int int1 = 3;
		int int2 = 113;

		// act- accion

		boolean resultado = estructuraDeDatos.definirUltimo(int1, int2);

		// assert
		assertTrue(resultado);
	}

	@Test
	public void ingreso6y117yObtengoTrue() {
		// arrange definicion de la variables
		int int1 = 6;
		int int2 = 117;

		// act- accion

		boolean resultado = estructuraDeDatos.definirUltimo(int1, int2);

		// assert
		assertFalse(resultado);
	}

	@Test
	public void ingreso8y18y30yObtengoTrue() {
		// arrange definicion de la variables
		int int1 = 8;
		int int2 = 18;
		int int3 = 30;

		// act- accion

		int resultado = estructuraDeDatos.definirMayor(int1, int2, int3);

		// assert
		assertEquals(30, resultado);
	}

	@Test
	public void ingreso29y5y15yObtengoTrue() {
		// arrange definicion de la variables
		int int1 = 29;
		int int2 = 5;
		int int3 = 15;

		// act- accion

		int resultado = estructuraDeDatos.definirMayor(int1, int2, int3);

		// assert
		assertEquals(29, resultado);
	}

	@Test
	public void ingreso10y50y5yObtengoTrue() {
		// arrange definicion de la variables
		int int1 = 10;
		int int2 = 50;
		int int3 = 5;

		// act- accion

		int resultado = estructuraDeDatos.definirMayor(int1, int2, int3);

		// assert
		assertEquals(50, resultado);
	}

	@Test
	public void ingreso2y2yObtengo4() {
		// arrange definicion de la variables
		int int1 = 2;
		int int2 = 2;

		// act- accion

		int resultado = estructuraDeDatos.multiplicarSumando(int1, int2);

		// assert
		assertEquals(4, resultado);
	}

	@Test
	public void ingreso3y4yObtengo12() {
		// arrange definicion de la variables
		int int1 = 3;
		int int2 = 4;

		// act- accion

		int resultado = estructuraDeDatos.multiplicarSumando(int1, int2);

		// assert
		assertEquals(12, resultado);
	}

	@Test
	public void ingreso5y5yObtengo25() {
		// arrange definicion de la variables
		int int1 = 5;
		int int2 = 5;

		// act- accion

		int resultado = estructuraDeDatos.multiplicarSumando(int1, int2);

		// assert
		assertEquals(25, resultado);
	}

	@Test
	public void ingreso2y2yObtengoPotencia4() {
		// arrange definicion de la variables
		int int1 = 2;
		int int2 = 2;

		// act- accion

		int resultado = estructuraDeDatos.potencia(int1, int2);

		// assert
		assertEquals(4, resultado);
	}

	@Test
	public void ingreso3y4yObtengoPotencia81() {
		// arrange definicion de la variables
		int int1 = 3;
		int int2 = 4;

		// act- accion

		int resultado = estructuraDeDatos.potencia(int1, int2);

		// assert
		assertEquals(81, resultado);
	}

	@Test
	public void ingreso5y5yObtengoPotencia3125() {
		// arrange definicion de la variables
		int base = 5;
		int potencia = 5;

		// act- accion

		int resultado = estructuraDeDatos.potencia(base, potencia);

		// assert
		assertEquals(3125, resultado);
	}

	@Test
	public void ingreso2y2yObtengoPotencia4Pow() {
		// arrange definicion de la variables
		int int1 = 2;
		int int2 = 2;

		// act- accion

		int resultado = estructuraDeDatos.potenciaPow(int1, int2);

		// assert
		assertEquals(4, resultado);
	}

	@Test
	public void ingreso3y4yObtengoPotencia81Pow() {
		// arrange definicion de la variables
		int int1 = 3;
		int int2 = 4;

		// act- accion

		int resultado = estructuraDeDatos.potenciaPow(int1, int2);

		// assert
		assertEquals(81, resultado);
	}

	@Test
	public void ingreso5y5yObtengoPotencia3125Pow() {
		// arrange definicion de la variables
		int int1 = 5;
		int int2 = 5;

		// act- accion

		int resultado = estructuraDeDatos.potenciaPow(int1, int2);

		// assert
		assertEquals(3125, resultado);
	}

	@Test
	public void ingreso5y3y8y1yObtengoMayor8() {
		// arrange definicion de la variables
		int[] intArreglo = { 5, 3, 8, 1 };

		// act- accion

		int resultado = estructuraDeDatos.ArrayElementoMaximo(intArreglo);

		// assert
		assertEquals(8, resultado);
	}

	@Test
	public void ingreso2y3y2y1yObtengoMayor3() {
		// arrange definicion de la variables
		int[] intArreglo = { 2, 3, 2, 1 };

		// act- accion

		int resultado = estructuraDeDatos.ArrayElementoMaximo(intArreglo);

		// assert
		assertEquals(3, resultado);
	}

	@Test
	public void ingreso15y4y14yNeg5yObtengoMayor15() {
		// arrange definicion de la variables
		int[] intArreglo = { 15, 4, 14, -5 };

		// act- accion

		int resultado = estructuraDeDatos.ArrayElementoMaximo(intArreglo);

		// assert
		assertEquals(15, resultado);
	}
	
	@Test
	public void ingreso6y3y8y1yObtengoTrue() {
		// arrange definicion de la variables
		int[] intArreglo = { 6, 3, 8, 1 };

		// act- accion

		boolean resultado = estructuraDeDatos.ArrayElementoSeis(intArreglo);

		// assert
		assertTrue(resultado);
	}
	
	@Test
	public void ingreso2y3y2y6yObtengoTrue() {
		// arrange definicion de la variables
		int[] intArreglo = { 2, 3, 2, 6 };

		// act- accion

		boolean resultado = estructuraDeDatos.ArrayElementoSeis(intArreglo);

		// assert
		assertTrue(resultado);
	}
	
	@Test
	public void ingreso6y4y14y6yObtengoTrue() {
		// arrange definicion de la variables
		int[] intArreglo = { 6, 4, 14, 6 };

		// act- accion

		boolean resultado = estructuraDeDatos.ArrayElementoSeis(intArreglo);

		// assert
		assertTrue(resultado);
	}
	
	@Test
	public void ingreso5y4y2y1yObtengoFalse() {
		// arrange definicion de la variables
		int[] intArreglo = { 5, 4, 2, 1 };

		// act- accion

		boolean resultado = estructuraDeDatos.ArrayElementoSeis(intArreglo);

		// assert
		assertFalse(resultado);
	}
	
	@Test
	public void ingresoArreglo6y3Arreglo9y1yObtengoArreglo() {
		// arrange definicion de la variables
		int[] intArreglo1 = { 6,3 };
		int[] intArreglo2 = { 9,1 };

		// act- accion

		int[] resultado = estructuraDeDatos.ArrayMasGrande(intArreglo1, intArreglo2);

		// assert
		assertArrayEquals(intArreglo2,resultado);
	}
	
	
	@Test
	public void ingresoArreglo2y3Arreglo2y6yObtengoArreglo() {
		// arrange definicion de la variables
		int[] intArreglo1 = { 2,3 };
		int[] intArreglo2 = { 2,6 };

		// act- accion

		int[] resultado = estructuraDeDatos.ArrayMasGrande(intArreglo1, intArreglo2);

		// assert
		assertArrayEquals(intArreglo2,resultado);
	}
	
	@Test
	public void ingresoArreglo6y4Arreglo1y6yObtengoArreglo() {
		// arrange definicion de la variables
		int[] intArreglo1 = { 6,4 };
		int[] intArreglo2 = { 1,6 };

		// act- accion

		int[] resultado = estructuraDeDatos.ArrayMasGrande(intArreglo1, intArreglo2);

		// assert
		assertArrayEquals(intArreglo1,resultado);
	}
	
	
	@Test
	public void ingresoTamano1yObtengoArreglo() {
		// arrange definicion de la variables
		int intContador = 1;
		int [] arreglo= {0};

		// act- accion

		int[] resultado = estructuraDeDatos.ArrayConstruccion(intContador);

		// assert
		assertArrayEquals(arreglo,resultado);
	}
	
	@Test
	public void ingresoTamano2yObtengoArreglo() {
		// arrange definicion de la variables
		int intContador = 2;
		int [] arreglo= {0,1};

		// act- accion

		int[] resultado = estructuraDeDatos.ArrayConstruccion(intContador);

		// assert
		assertArrayEquals(arreglo,resultado);
	}
	
	
	@Test
	public void ingresoTamano3yObtengoArreglo() {
		// arrange definicion de la variables
		int intContador = 3;
		int [] arreglo= {0,1,2};

		// act- accion

		int[] resultado = estructuraDeDatos.ArrayConstruccion(intContador);

		// assert
		assertArrayEquals(arreglo,resultado);
	}
	
	@Test
	public void ingresoTamano4yObtengoArreglo() {
		// arrange definicion de la variables
		int intContador = 4;
		int [] arreglo= {0,1,2,3};

		// act- accion

		int[] resultado = estructuraDeDatos.ArrayConstruccion(intContador);

		// assert
		assertArrayEquals(arreglo,resultado);
	}
	
	
	@Test
	public void ingresoArreglo2y2yObtengoMultiplicacionArreglo() {
		// arrange definicion de la variables
		int [] arreglo= {2,2};

		// act- accion

		int resultado = estructuraDeDatos.ArrayMultiplicacion(arreglo);

		// assert
		assertEquals(4,resultado);
	}
	
	
	@Test
	public void ingresoArreglo3y4yObtengoMultiplicacionArreglo() {
		// arrange definicion de la variables
		int [] arreglo= {3,4};

		// act- accion

		int resultado = estructuraDeDatos.ArrayMultiplicacion(arreglo);

		// assert
		assertEquals(12,resultado);
	}
	
	@Test
	public void ingresoArreglo5y5yObtengoMultiplicacionArreglo() {
		// arrange definicion de la variables
		int [] arreglo= {5,5};

		// act- accion

		int resultado = estructuraDeDatos.ArrayMultiplicacion(arreglo);

		// assert
		assertEquals(25,resultado);
	}
	
	@Test
	public void ingresoArreglo1yObtengoFactorial() {
		// arrange definicion de la variables
		int num1= 1;

		// act- accion

		int resultado = estructuraDeDatos.Factorial(num1);

		// assert
		assertEquals(1,resultado);
	}
	
	
	@Test
	public void ingresoArreglo2yObtengoFactorial() {
		// arrange definicion de la variables
		int num1= 2;

		// act- accion

		int resultado = estructuraDeDatos.Factorial(num1);

		// assert
		assertEquals(2,resultado);
	}
	
	
	@Test
	public void ingresoArreglo3yObtengoFactorial() {
		// arrange definicion de la variables
		int num1= 3;

		// act- accion

		int resultado = estructuraDeDatos.Factorial(num1);

		// assert
		assertEquals(6,resultado);
	}
	
	@Test
	public void ingresoNumero0yObtengoSumatoriaRecursiva() {
		// arrange definicion de la variables
		int num1= 0;

		// act- accion

		int resultado = estructuraDeDatos.SumatoriaRecursiva(num1);

		// assert
		assertEquals(0,resultado);
	}
	
	@Test
	public void ingresoNumero1yObtengoSumatoriaRecursiva() {
		// arrange definicion de la variables
		int num1= 1;

		// act- accion

		int resultado = estructuraDeDatos.SumatoriaRecursiva(num1);

		// assert
		assertEquals(2,resultado);
	}
	
	@Test
	public void ingresoNumero2yObtengoSumatoriaRecursiva() {
		// arrange definicion de la variables
		int num1= 2;

		// act- accion

		int resultado = estructuraDeDatos.SumatoriaRecursiva(num1);

		// assert
		assertEquals(5,resultado);
	}
	
	@Test
	public void ingresoNumero4yObtengoSumatoriaRecursiva() {
		// arrange definicion de la variables
		int num1= 4;

		// act- accion

		int resultado = estructuraDeDatos.SumatoriaRecursiva(num1);

		// assert
		assertEquals(10,resultado);
	}
}
