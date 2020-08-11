/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.Scanner;
//para el programa que se muestra se crea la clase con el nombre Ejercicio1
public class Ejercicio1 {
    public static void main(String[] args) {
        //para leer datos de varios tipos usamos la clase Scanner
        //Declarar el objeto e inicializar con el objeto de entrada
        //estandar predefinido
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca el número de alumnos: ");
		int numAlumnos = Integer.parseInt(entrada.nextLine());
	//Almacenamos los valores de tipo String y double en un Arreglo
                String[] nombres = new String[numAlumnos];
		double[] notasN = new double[numAlumnos];
		String[] notasS = new String[numAlumnos];
		System.out.println();
        //Creamos un bucle para que nos de cuantos valores vamos a desarrollar    
		for(int i = 0; i < nombres.length; i++) {
			System.out.print("Introduzca el nombre del alumno: ");
			nombres[i] = entrada.nextLine();
			do{
				System.out.print("\nIntroduzca la nota: ");
				notasN[i] = Double.parseDouble(entrada.nextLine());
				if(notasN[i] >= 0 && notasN[i] < 10.49){
					notasS[i] = "Suspenso";
				} else if(notasN[i] >= 10.50 && notasN[i] < 13.99) {
					notasS[i] = "Bien";
				} else if(notasN[i] >= 14 && notasN[i] < 17.99) {
					notasS[i] = "Notable";
				} else if(notasN[i] >= 18 && notasN[i] <= 20) {
					notasS[i] = "Sobresaliente";
				} else {
					notasS[i] = "Nota erronea";
				}
			} while(notasN[i] < 0 || notasN[i] > 20);			
		}
           	entrada.close();
        //creamos un bucle donde nos dara las nota de acuerdo a los valores que demos
		for(int i = 0; i < nombres.length; i++) {
			System.out.println("La nota de " +  nombres[i] +  " es " + notasN[i] + ", " + notasS[i]);
		}}}

