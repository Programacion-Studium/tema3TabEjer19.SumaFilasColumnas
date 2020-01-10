package es.Studium.tema3TabEjer19;

import java.util.Scanner;

public class SumaFilasColumnas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tabla[][] = new int[3][3];
		int sumaFila[] = new int[3];
		int sumaColumna[] = new int[3];
		Scanner teclado = new Scanner(System.in);
		//Metodo para introduccir datos a la matriz
		introducirDatos(tabla, teclado);
		
		int i,e;
		//ponemos un for para recorrer la fila del array
		for(i=0;(i<3);i++)
		{
			//Ponemos un segundo for para recorrer la columna del array
			for(e=0;e<3;e++)
			{
				sumaFila[i]=sumaFila[i]+tabla[i][e];
			}
			System.out.println("La fila "+i+" da como resultado " +sumaFila[i]);
		}
		for(e=0;(e<3);e++)
		{
			//Ponemos un segundo for para recorrer la columna del array
			for(i=0;i<3;i++)
			{
				sumaColumna[e]=sumaColumna[e]+tabla[i][e];
			}
			System.out.println("La columna "+e+" da como resultado " +sumaColumna[e]);
		}
	}
	// Metodo para introducir los Datos de la matriz por el teclado
		private static void introducirDatos(int[][] tabla, Scanner teclado) {
			int i;
			int e;
			//ponemos un for para recorrer la fila del array
			for(i=0;i<3;i++)
			{
				//Ponemos un segundo for para recorrer la columna del array
				for(e=0;e<3;e++)
				{
					//pedimos que se introduzcan los datos, y leemos por teclado
					System.out.print("Escribir valor " + i + " , " + e + " : ");
		            tabla [i][e] = teclado.nextInt();
				}
			}
		}
}
