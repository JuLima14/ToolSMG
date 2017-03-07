package ar.com.smg.entities;

public class Estado {

	private int idEstado;
	private String descripcion;
	
	public Estado() {
	}

	public Estado(int idEstado, String descripcion) {
		this.idEstado = idEstado;
		this.descripcion = descripcion;
	}

	public int getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
