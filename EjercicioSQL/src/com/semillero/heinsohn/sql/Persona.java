package com.semillero.heinsohn.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {

	private String nombres, apellidos, sexo, fechaNacimiento;
	private int id, salario;

	public Persona(String nombres, String apellidos, String sexo, String fechaNacimiento, int id, int salario) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.id = id;
		this.salario = salario;
	}
	

	public Persona(int salario) {
		super();
		this.salario = salario;
	}


	public Persona(String nombres) {
		super();
		this.nombres = nombres;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public static void leerNombresApellidos() throws SQLException {

		ArrayList<Persona> listaPer = new ArrayList<Persona>();
		Connection conexion = null;
		Conexion miConexion = new Conexion();
		conexion = miConexion.getConnection();
		PreparedStatement ps;
		ResultSet res;
		ps = conexion.prepareStatement("SELECT * FROM persona");
		res = ps.executeQuery();
		while (res.next()) {
			String nombres = res.getString("Nombres");
			String apellidos = res.getString("Apellidos");
			String sexo = res.getString("Sexo");
			String fechaNacimiento = res.getString("FechaNacimiento");
			int salario = res.getInt("Salario");
			int id = res.getInt("id");
			listaPer.add(new Persona(nombres, apellidos, sexo, fechaNacimiento, id, salario));
		}
		for (Persona per : listaPer) {
			String nombre = per.getNombres();
			String apellido = per.getApellidos();
			System.out.println("Nombre y Apellido: " + inicialMayuscula(nombre) + " " + inicialMayuscula(apellido)
					+ " ,La longitud de los apellidos son: " + apellido.replace(" ", "").length());
		}
		res.close();
		ps.close();

	}

	public static String inicialMayuscula(String str) {
		StringBuffer strbf = new StringBuffer();
		Matcher match = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(str);
		while (match.find()) {
			match.appendReplacement(strbf, match.group(1).toUpperCase() + match.group(2).toLowerCase());
		}
		return str = match.appendTail(strbf).toString();

	}

	public static void personasFechaMayor() throws SQLException {

		ArrayList<Persona> listaPer = new ArrayList<Persona>();
		Connection conexion = null;
		Conexion miConexion = new Conexion();
		conexion = miConexion.getConnection();
		PreparedStatement ps;
		ResultSet res;
		ps = conexion.prepareStatement("SELECT * FROM persona WHERE FechaNacimiento > '2010-01-01' ");
		res = ps.executeQuery();
		while (res.next()) {
			String nombres = res.getString("Nombres");
			String apellidos = res.getString("Apellidos");
			String sexo = res.getString("Sexo");
			String fechaNacimiento = res.getString("FechaNacimiento");
			int salario = res.getInt("Salario");
			int id = res.getInt("id");
			listaPer.add(new Persona(nombres, apellidos, sexo, fechaNacimiento, id, salario));
		}
		for (Persona per : listaPer) {
			String nombre = per.getNombres();
			System.out.println("Nombre persona que nacio despues de 2010-01-01: " + nombre.toUpperCase());
		}
		res.close();
		ps.close();

	}

	public static void sueldoPromedioMasculino() throws SQLException {

		ArrayList<Persona> listaPer = new ArrayList<Persona>();
		Connection conexion = null;
		Conexion miConexion = new Conexion();
		conexion = miConexion.getConnection();
		PreparedStatement ps;
		ResultSet res;
		ps = conexion.prepareStatement(
				"SELECT AVG(Salario) AS Promedio FROM ejerciciosemillero.persona WHERE Sexo = 'Masculino'");
		res = ps.executeQuery();
		while (res.next()) {
			int salario = res.getInt("Promedio");
			listaPer.add(new Persona(salario));
		}
		for (Persona per : listaPer) {
			int salario = per.getSalario();
			System.out.println("Sueldo promedio para Hombres: " + salario);
		}
		res.close();
		ps.close();

	}
	
	public static void sueldoPromedioFemenino() throws SQLException {

		ArrayList<Persona> listaPer = new ArrayList<Persona>();
		Connection conexion = null;
		Conexion miConexion = new Conexion();
		conexion = miConexion.getConnection();
		PreparedStatement ps;
		ResultSet res;
		ps = conexion.prepareStatement(
				"SELECT AVG(Salario) AS Promedio FROM ejerciciosemillero.persona WHERE Sexo = 'Femenino'");
		res = ps.executeQuery();
		while (res.next()) {
			int salario = res.getInt("Promedio");
			listaPer.add(new Persona(salario));
		}
		for (Persona per : listaPer) {
			int salario = per.getSalario();
			System.out.println("Sueldo promedio para Mujeres: " + salario);
		}
		res.close();
		ps.close();

	}
}