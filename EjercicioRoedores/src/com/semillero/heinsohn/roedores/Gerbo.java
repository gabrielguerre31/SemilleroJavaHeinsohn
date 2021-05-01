package com.semillero.heinsohn.roedores;

public class Gerbo extends Roedores {

	public Gerbo(String color,double peso) {
		super(color,  peso);
		
	}

	@Override
	String reproduccion() {
		return "Tengo 5-6 crias";
	}

	@Override
	String comer() {
		return "Como verduras, insectos y semillas";
	}

	@Override
	String obtenerRaza() {
		return "Hola soy un Gerbo";
	}

}
