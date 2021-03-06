package ar.com.smg.entities;
// Generated 07-feb-2017 13:05:04 by Hibernate Tools 5.1.0.Final

/**
 * Soportes generated by hbm2java
 */
public class Soporte implements java.io.Serializable {

	private int idSoporte;
	private String descripcion;
	private String telefono;
	private String correo;

	public Soporte() {
	}

	public Soporte(int idSoporte, String descripcion, String telefono, String correo) {
		this.idSoporte = idSoporte;
		this.descripcion = descripcion;
		this.telefono = telefono;
		this.correo = correo;
	}

	public int getIdSoporte() {
		return this.idSoporte;
	}

	public void setIdSoporte(int idSoporte) {
		this.idSoporte = idSoporte;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
