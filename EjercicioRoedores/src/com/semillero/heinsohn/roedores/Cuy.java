package com.semillero.heinsohn.roedores;

public class Cuy extends Roedores{

	public Cuy(String color, double peso) {
		super(color, peso);
	}

	@Override
	String reproduccion() {
		return "tengo 3 crias por parto";
	}

	@Override
	String comer() {
		return "Como frutas y verduras, menos limon y naranja";
	}

	@Override
	String obtenerRaza() {
		return "Hola soy un Cuy";
	}

}
