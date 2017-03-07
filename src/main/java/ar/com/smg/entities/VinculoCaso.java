package ar.com.smg.entities;

public class VinculoCaso {

	private int idVinculoCaso;
	private long idCaso; 
	private String descripcion;
	
	public VinculoCaso() {
	}


	public VinculoCaso(int idVinculoCaso, long idCaso, String descripcion) {
		this.idVinculoCaso = idVinculoCaso;
		this.idCaso = idCaso;
		this.descripcion = descripcion;
	}

	public int getIdVinculoCaso() {
		return idVinculoCaso;
	}

	public void setIdVinculoCaso(int idVinculoCaso) {
		this.idVinculoCaso = idVinculoCaso;
	}

	public long getIdCaso() {
		return idCaso;
	}

	public void setIdCaso(long idCaso) {
		this.idCaso = idCaso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
