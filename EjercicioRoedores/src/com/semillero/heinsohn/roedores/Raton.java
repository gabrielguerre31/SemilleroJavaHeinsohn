package com.semillero.heinsohn.roedores;

public class Raton extends Roedores {

	public Raton(String color, double peso) {
		super(color, peso);
	}

	@Override
	String reproduccion() {
		return "Tengo 8 a 12 crias";
	}

	@Override
	String comer() {
		return "Como frutas, semillas y resto de comida";
	}

	@Override
	String obtenerRaza() {
		return "Hola soy un Raton";
	}

}
