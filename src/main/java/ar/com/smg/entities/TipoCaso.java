package ar.com.smg.entities;

public class TipoCaso {

	private int idCaso;
	private String descripcion;
	
	public TipoCaso() {
	}

	public TipoCaso(int idCaso, String descripcion) {
		this.idCaso = idCaso;
		this.descripcion = descripcion;
	}

	public int getIdCaso() {
		return idCaso;
	}

	public void setIdCaso(int idCaso) {
		this.idCaso = idCaso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
