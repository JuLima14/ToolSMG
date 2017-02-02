package ar.com.smg.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Caso {

	private int numero ;
	private String fecha_registro;
	
	public Caso(int numero,String fecha_registro){
		this.numero = numero;
		this.fecha_registro = fecha_registro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	

	
}
