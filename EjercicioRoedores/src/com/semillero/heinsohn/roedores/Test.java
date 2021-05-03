package com.semillero.heinsohn.roedores;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		List<Roedores> roedores = new ArrayList<>();
		Roedores raton = new Raton("Cafe", 12);
		Roedores cuy = new Cuy("Negro", 5);
		Roedores gerbo = new Gerbo("Blanco", 3);
		
		roedores.add(gerbo);
		roedores.add(cuy);
		roedores.add(raton);
		
		for(Roedores roedor:roedores) {
			System.out.println(roedor.obtenerRaza());
			System.out.println("Peso: " + roedor.getPeso() + "Kg");
			System.out.println("Soy de color: " + roedor.getColor());
			System.out.println(roedor.comer());
			System.out.println(roedor.reproduccion());
		}

	}

}
