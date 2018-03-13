package org.gradle;

public class EstructurasDatos {

	public int suma(int nro1, int nro2) {

		int resSuma = nro1 + nro2;
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

		int resultado = nro1 / nro2;
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

		if (nro1 != 5) {
			return false;
		} else {
			return true;
		}
	}

	public boolean evaluarEntero(int nro1) {

		if (nro1 >= 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean evaluarParEImpar(int nro1) {

		// if ((nro1/2)*2 == nro1) {
		if ((nro1 % 2) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int evaluarCambioAPositivo(int nro1) {

		/*
		 * if (nro1 >= 0) { return nro1;
		 * 
		 * } else { return nro1*-1; }
		 */

		return Math.abs(nro1);

	}

	public boolean evaluarTablasDeVerdadSi(boolean variable_1, boolean variable_2) {

		if (variable_1 && variable_2) {
			return true;
		} else
			return false;

	}

	public boolean evaluarTablasDeVerdadOr(boolean variable_1, boolean variable_2) {

		if (variable_1 || variable_2) {
			return true;
		} else {
			return false;
		}

	}

	public boolean evaluarTablasDeVerdadNegacion(boolean variable_1) {

		return !variable_1;
	}

	public String definirFestividad(String color_1, String color_2) {

		if (color_1 == "Rojo" && color_2 == "Verde") {
			return "Navidad";
		} else if (color_1 == "Verde" && color_2 == "Naranja") {
			return "Halloween";
		} else {
			return "Pascua";
		}

	}

	public boolean definirUltimo(int int1, int int2) {
		return ((int2 % 10) == int1);
	}

	public int definirMayor(int int1, int int2, int int3) {
		// TODO Auto-generated method stub

		/*
		 * if (int1 > int2) { if (int1 > int3) { return int1; } } else { if (int2 >
		 * int3) { return int2; }
		 * 
		 * } return int3;
		 */
		return (Math.max(int1, Math.max(int2, int3)));
	}

	public int multiplicarSumando(int int1, int int2) {
		// TODO Auto-generated method stub

		// int contador=0;
		int resultado = 0;
		/*
		 * while (contador < int2) { resultado = resultado + int1; contador++; }
		 */

		for (int i = 0; i < int2; i++) {
			resultado = resultado + int1;
		}
		return resultado;
	}

	public int potencia(int base, int potencia) {
		int contador = 0;
		int resultado = base;

		/*
		 * while (contador < potencia-1) { int mult=0; int contint=0; while (contint <
		 * base ) { mult=mult+resultado; contint++; } contador++; resultado=mult; }
		 */
		// Refactorin
		while (contador < potencia - 1) {
			resultado = multiplicarSumando(resultado, base);
			contador++;
		}

		return resultado;
	}

	public int potenciaPow(int int1, int int2) {

		return (int) Math.pow(int1, int2);
	}

	public int ArrayElementoMaximo(int[] intArreglo) {
		// TODO Auto-generated method stub
		int maximo = 0;
		for (int i = 0; i < intArreglo.length; i++) {

			/*
			 * if (intArreglo[i] > maximo) { maximo=intArreglo[i]; }
			 */

			maximo = Math.max(maximo, intArreglo[i]);

		}
		return maximo;
	}

	public boolean ArrayElementoSeis(int[] intArreglo) {

		return ((intArreglo[0] == 6) || (intArreglo[(intArreglo.length - 1)] == 6));

	}

	public int[] ArrayMasGrande(int[] intArreglo1, int[] intArreglo2) {
		// TODO Auto-generated method stub
		if ((intArreglo1[0] + intArreglo1[1]) > (intArreglo2[0] + intArreglo2[1])) {
			return intArreglo1;
		} else {
			return intArreglo2;
		}

	}

	public int[] ArrayConstruccion(int intContador) {

		int[] resultado = new int[intContador];

		for (int i = 0; i < intContador; i++) {
			resultado[i] = i;
		}

		return resultado;
	}

	public int ArrayMultiplicacion(int[] arreglo) {

		return multiplicarSumando(arreglo[0], arreglo[1]);
	}

	public int Factorial(int num1) {
		
		if (num1 != 1) {
			//Obtenerlo con multiplicacion
			//return  num1 * Factorial(num1 - 1);
			
			//Obteniendolo con sumas
			return multiplicarSumando(num1, Factorial(num1 - 1));
		} else {
			return 1;
		}
	}

	public int SumatoriaRecursiva(int num1) {
		// TODO Auto-generated method stub
		
		if (num1==0) {
			return 0;
			
		}else {
			if ((num1 % 2) == 0) {
				return 3 + SumatoriaRecursiva(num1 -1); 
			}else {
				return 2 + SumatoriaRecursiva(num1 -1);
			}
		}
			
	}
}




