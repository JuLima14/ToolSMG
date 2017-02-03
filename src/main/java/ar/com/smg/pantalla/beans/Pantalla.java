package ar.com.smg.pantalla.beans;

public class Pantalla {
	
	
	private int id;
	private String nombre;
	private String url;
	private int posicion;
	
	
	public Pantalla(int id , String nombre , String url, int posicion){
		this.id = id;
		this.nombre = nombre;
		this.url = url;
		this.posicion = posicion;
	}
	public Pantalla(){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	

}
