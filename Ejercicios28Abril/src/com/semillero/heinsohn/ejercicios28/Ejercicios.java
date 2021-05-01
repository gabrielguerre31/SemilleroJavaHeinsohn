package com.semillero.heinsohn.ejercicios28;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		Ejercicios ejercicios = new Ejercicios();
		System.out.println("Primer ejercicio separar fecha: 31/01/1997");
		ejercicios.separarFecha();
		System.out.println("Segundo ejercicio sumar array: {1, 20, 4, 5, 6}");
		ejercicios.sumarArray();
		System.out.println("Tercer ejercicio app precios ");
		ejercicios.appPrecios();

	}

	public void separarFecha() {
		String fecha = "31/01/1997";
		String primer;
		String segundo;
		String tercero;
		primer = fecha.substring(0,2);
		segundo = fecha.substring(3,5);
		tercero= fecha.substring(6,10);
		System.out.println("Primer campo  " + primer);
		System.out.println("Segundo campo  " + segundo);
		System.out.println("Tercer campo  " + tercero);
	}

	public void sumarArray() {
		int[] datos = { 1, 20, 4, 5, 6 };
		int suma = 0;

		for (int i = 0; i < datos.length; i++) {
			suma += datos[i];
		}
		System.out.println("La suma del arreglo es " + suma);
	}

	public void appPrecios() {
		try {
			double suma = 0;
			int mayor = 0;
			int[] datos = new int[5];
			Scanner leer = new Scanner(System.in);
			for (int i = 0; i < datos.length; i++) {
				System.out.println("Ingrese el " + (i + 1) + " valor");
				datos[i] = leer.nextInt();
			}
			for (int i = 0; i < datos.length; i++) {
				suma += datos[i];
			}
			if(suma > 300 ) {
				suma = suma*1.1;
				System.out.println("El precio es " + suma);
			}else {
				suma = suma*1.07;
				System.out.println("El precio es " + suma);
			}
			for (int x = 0; x < datos.length; x++) {
				if (datos[x] > mayor) {
					mayor = datos[x];
				}
			}
			System.out.println("El numero mayor es " + mayor);
			
		} catch (Exception e) {
			System.out.println("No ingresaste un numero vuelve a correr el programa");
		}
	}
}
