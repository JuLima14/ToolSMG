package ar.com.smg.entities;

public class Prioridad {

	private int idPrioridad;
	private String descripcion;
	
	public Prioridad() {
	}

	public Prioridad(int idPrioridad, String descripcion) {
		this.idPrioridad = idPrioridad;
		this.descripcion = descripcion;
	}

	public int getIdPrioridad() {
		return idPrioridad;
	}

	public void setIdPrioridad(int idPrioridad) {
		this.idPrioridad = idPrioridad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
