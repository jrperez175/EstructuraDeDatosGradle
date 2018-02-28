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
	public void sumar3y4Retorna7Test() {
		//arrange definicion de la variables
		int nro1=3;
		int nro2=4;
		//EstructurasDatos estructuraDeDatos = new EstructurasDatos();
		
		//act- accion
		
		int resultado = estructuraDeDatos.suma(nro1,nro2);
		
		//assert
		Assert.assertEquals(7, resultado);
		
	}
	
	@Test
	public void sumar30y50Retorna80Test() {
		//arrange definicion de la variables
		int nro1=30;
		int nro2=50;
		//EstructurasDatos estructuraDeDatos = new EstructurasDatos();
		
		//act- accion
		
		int resultado = estructuraDeDatos.suma(nro1,nro2);
		
		//assert
		Assert.assertEquals(80, resultado);
		
	}
	
	@Test
	public void sumar4yRetorna5Test() {
		//arrange definicion de la variables
		int nro1=4;
						
		//act- accion
		
		int resultado = estructuraDeDatos.sumarUno(nro1);
		
		//assert
		Assert.assertEquals(5, resultado);
		
	}
}
