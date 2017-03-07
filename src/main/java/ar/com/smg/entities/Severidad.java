package ar.com.smg.entities;

public class Severidad {

	private int idSeveredidad;
	private String descripcion;
	
	public Severidad() {
	}
	public Severidad(int idSeveredidad, String descripcion) {
		this.idSeveredidad = idSeveredidad;
		this.descripcion = descripcion;
	}
	public int getIdSeveredidad() {
		return idSeveredidad;
	}
	public void setIdSeveredidad(int idSeveredidad) {
		this.idSeveredidad = idSeveredidad;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
