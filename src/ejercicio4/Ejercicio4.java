/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int t[]=new int[10];
        int ultimo;
    // leemos la tabla
        for (int i=0;i<10;i++){
            System.out.print("Introduzca número: ");
            t[i]=Entrada.nextInt();
            }
    // guardamos el último elemento de la tabla
        ultimo = t[9];
    // desplazamos hacia abajo (de 0 hacia la última posición)
    // al desplazar perdemos el último valor, por eso lo hemos guardado antes.
        for (int i=8;i>=0;i--)
            t[i+1]=t[i];
    // el último valor pasa a ser el primero
        t[0] =ultimo;
        System.out.println("La tabla queda:");
        for (int i=0;i<10;i++)
            System.out.println(t[i]);
        }
}