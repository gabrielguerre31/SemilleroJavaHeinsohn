package com.semillero.heinsohn.sql;

import java.sql.SQLException;


public class Principal {

	public static void main(String[] args) throws SQLException {
		System.out.println("Nombre y apellido con primer letra en mayuscula y longitud de los apellidos ");
		Persona.leerNombresApellidos();
		System.out.println("Nombre en mayuscula de personas con fecha de nacimiento despues de 2010-01-01 ");
		Persona.personasFechaMayor();
		System.out.println("Sueldo promedio Hombres ");
		Persona.sueldoPromedioMasculino();
		System.out.println("Sueldol promedio Mujeres");
		Persona.sueldoPromedioFemenino();
	}
}
