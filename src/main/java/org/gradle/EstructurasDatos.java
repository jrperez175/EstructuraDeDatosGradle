package org.gradle;

public class EstructurasDatos {

	public int suma(int nro1, int nro2) {
		
		int resSuma= nro1+nro2;
		return resSuma;
	}

	public int sumarUno(int nro1) {
		nro1++;
		return nro1;
	}

	public int restaDosNumeros(int nro1, int nro2) {
		
		int resultado = nro1 - nro2;
		return resultado;
	}

	public int multiplicarDosNumeros(int nro1, int nro2) {
		
		int resultado = nro1 * nro2;
		return resultado;
	}

	public int dividirDosNumeros(int nro1, int nro2) {
		
		int resultado = nro1/nro2;
		return resultado;
	}

	public int restarUno(int nro1) {
		
		nro1--;
		return nro1;
	}

	public String devolverString(String nombre) {
		
		return nombre;
	}

	public int contarCaracteres(String nombre) {
		
		return nombre.length();
	}

	public boolean devolverBoleano(int nro1) {
		
		if (nro1==5) { 
			return true;
		}
		 else { 
		return false;
		 }
	}

}
