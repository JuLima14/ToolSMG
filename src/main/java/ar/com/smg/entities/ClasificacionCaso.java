package ar.com.smg.entities;

public class ClasificacionCaso {

	private int idClasificacion;
	private String descripcion;
	
	public ClasificacionCaso() {
	}

	public ClasificacionCaso(int idClasificacion, String descripcion) {
		this.idClasificacion = idClasificacion;
		this.descripcion = descripcion;
	}

	public int getIdClasificacion() {
		return idClasificacion;
	}

	public void setIdClasificacion(int idClasificacion) {
		this.idClasificacion = idClasificacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
