package ar.com.smg.entities;

public class Asignado {
	
	private int idAsignado;
	private String descripcion;
	
	public Asignado() {
	}

	public Asignado(int idAsignado, String descripcion) {
		this.idAsignado = idAsignado;
		this.descripcion = descripcion;
	}

	public int getIdAsignado() {
		return idAsignado;
	}

	public void setIdAsignado(int idAsignado) {
		this.idAsignado = idAsignado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
