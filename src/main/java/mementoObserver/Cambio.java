package mementoObserver;

import java.util.Date;

public class Cambio {
	private String mensaje;
	private String cambio;
	private String autor;
	private Date fecha;

	
	public void show() {
		System.out.println("Current values --> mensaje: " + mensaje + " cambio: " + cambio+" autor: "+autor+" fecha: "+fecha);
	}


	public Cambio(String mensaje, String cambio, String autor, Date fecha) {
		super();
		this.mensaje = mensaje;
		this.cambio = cambio;
		this.autor = autor;
		this.fecha = fecha;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


	public String getCambio() {
		return cambio;
	}


	public void setCambio(String cambio) {
		this.cambio = cambio;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	
	
}