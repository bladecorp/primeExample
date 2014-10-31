package net.tecgurus.primefaces.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;


@ManagedBean
public class Pruebas {
	
	private String nombre;
	private String apellido;
	private String telefono;
		
	
	/**
	 * @return the nombre
	 */
	public final String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public final void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido
	 */
	public final String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public final void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the telefono
	 */
	public final String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public final void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	

}
