package ar.com.smg.entities;
// Generated 07-feb-2017 13:05:04 by Hibernate Tools 5.1.0.Final

/**
 * Comentarios generated by hbm2java
 */
public class Comentario implements java.io.Serializable {

	private int idCaso;
	private String descripcion;
	private int idUsuario;
	private int fecha;

	public Comentario() {
	}

	public Comentario(int idCaso, String descripcion, int idUsuario, int fecha) {
		this.idCaso = idCaso;
		this.descripcion = descripcion;
		this.idUsuario = idUsuario;
		this.fecha = fecha;
	}

	public int getIdCaso() {
		return this.idCaso;
	}

	public void setIdCaso(int idCaso) {
		this.idCaso = idCaso;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getFecha() {
		return this.fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

}