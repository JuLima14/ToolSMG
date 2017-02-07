package ar.com.smg.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

// Generated 07-feb-2017 13:05:04 by Hibernate Tools 5.1.0.Final

/**
 * Pantallas generated by hbm2java
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Pantalla implements java.io.Serializable {

	@XmlAttribute
	private Integer id;
	@XmlAttribute
	private String nombre;
	@XmlAttribute
	private String url;
	@XmlAttribute
	private Integer posicion;

	
	public Pantalla() {
	}

	public Pantalla(String nombre, String url) {
		this.nombre = nombre;
		this.url = url;
	}

	public Pantalla(String nombre, String url, Integer posicion) {
		this.nombre = nombre;
		this.url = url;
		this.posicion = posicion;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getPosicion() {
		return this.posicion;
	}

	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}


}
