 package com.semillero.heinsohn.roedores;

public abstract class Roedores {

	private String color;
	private double peso;
	
	public Roedores(String color, double peso) {
		super();
		this.color = color;
		this.peso = peso;
	}
	
	public String getColor() {
		return color;
	}
	public double getPeso() {
		return peso;
	}

	abstract String reproduccion();
	abstract String comer();
	abstract String obtenerRaza();
	
}
