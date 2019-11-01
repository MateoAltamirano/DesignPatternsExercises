package cine;

public class ConcreteBoleto implements IBoleto {

	private String nombrePelicula;
	private String cine;
	private int hora;
	private String funcion;
	private String recomendaciones;
	private int numeroAsiento;
	
	

	public String getNombrePelicula() {
		return nombrePelicula;
	}



	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}



	public String getCine() {
		return cine;
	}



	public void setCine(String cine) {
		this.cine = cine;
	}



	public int getHora() {
		return hora;
	}



	public void setHora(int hora) {
		this.hora = hora;
	}



	public String getFuncion() {
		return funcion;
	}



	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}



	public String getRecomendaciones() {
		return recomendaciones;
	}



	public void setRecomendaciones(String recomendaciones) {
		this.recomendaciones = recomendaciones;
	}



	public int getNumeroAsiento() {
		return numeroAsiento;
	}



	public void setNumeroAsiento(int numeroAsiento) {
		this.numeroAsiento = numeroAsiento;
	}



	@Override
	public Object clone() {
		ConcreteBoleto cloneObj = new ConcreteBoleto();
		cloneObj.setNombrePelicula(nombrePelicula);
		cloneObj.setCine(cine);
		cloneObj.setFuncion(funcion);
		cloneObj.setHora(hora);
		cloneObj.setNumeroAsiento(numeroAsiento);
		cloneObj.setRecomendaciones(recomendaciones);
		return cloneObj;
	}
}
