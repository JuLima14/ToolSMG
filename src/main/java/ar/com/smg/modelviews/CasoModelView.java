package ar.com.smg.modelviews;

import java.util.List;

import ar.com.smg.entities.Aplicacion;
import ar.com.smg.entities.Asignado;
import ar.com.smg.entities.Caso;
import ar.com.smg.entities.ClasificacionCaso;
import ar.com.smg.entities.Estado;
import ar.com.smg.entities.Modulo;
import ar.com.smg.entities.Prioridad;
import ar.com.smg.entities.Severidad;
import ar.com.smg.entities.Soporte;
import ar.com.smg.entities.TipoCaso;
import ar.com.smg.entities.VinculoCaso;

public class CasoModelView {

	private Caso caso;
	private List<Aplicacion> aplicacionCaso;
	private List<Modulo> moduloCaso;
	private List<TipoCaso> tipoCaso;
	private List<ClasificacionCaso> clasificacionCaso;
	private List<VinculoCaso> vinculoCaso;
	private List<Prioridad> prioridadCaso;
	private List<Asignado> asignadoCaso;
	private List<Soporte> soporteCaso;
	private List<Severidad> severidadCaso;
	private List<Estado> estadoCaso;
	
	public CasoModelView() {
	}

	public CasoModelView(Caso caso, List<Aplicacion> aplicacionCaso, List<Modulo> moduloCaso, List<TipoCaso> tipoCaso,
			List<ClasificacionCaso> clasificacionCaso, List<VinculoCaso> vinculoCaso, List<Prioridad> prioridadCaso,
			List<Asignado> asignadoCaso, List<Soporte> soporteCaso, List<Severidad> severidadCaso,
			List<Estado> estadoCaso) {
		this.caso = caso;
		this.aplicacionCaso = aplicacionCaso;
		this.moduloCaso = moduloCaso;
		this.tipoCaso = tipoCaso;
		this.clasificacionCaso = clasificacionCaso;
		this.vinculoCaso = vinculoCaso;
		this.prioridadCaso = prioridadCaso;
		this.asignadoCaso = asignadoCaso;
		this.soporteCaso = soporteCaso;
		this.severidadCaso = severidadCaso;
		this.estadoCaso = estadoCaso;
	}

	public Caso getCaso() {
		return caso;
	}

	public void setCaso(Caso caso) {
		this.caso = caso;
	}

	public List<Aplicacion> getAplicacionCaso() {
		return aplicacionCaso;
	}

	public void setAplicacionCaso(List<Aplicacion> aplicacionCaso) {
		this.aplicacionCaso = aplicacionCaso;
	}

	public List<Modulo> getModuloCaso() {
		return moduloCaso;
	}

	public void setModuloCaso(List<Modulo> moduloCaso) {
		this.moduloCaso = moduloCaso;
	}

	public List<TipoCaso> getTipoCaso() {
		return tipoCaso;
	}

	public void setTipoCaso(List<TipoCaso> tipoCaso) {
		this.tipoCaso = tipoCaso;
	}

	public List<ClasificacionCaso> getClasificacionCaso() {
		return clasificacionCaso;
	}

	public void setClasificacionCaso(List<ClasificacionCaso> clasificacionCaso) {
		this.clasificacionCaso = clasificacionCaso;
	}

	public List<VinculoCaso> getVinculoCaso() {
		return vinculoCaso;
	}

	public void setVinculoCaso(List<VinculoCaso> vinculoCaso) {
		this.vinculoCaso = vinculoCaso;
	}

	public List<Prioridad> getPrioridadCaso() {
		return prioridadCaso;
	}

	public void setPrioridadCaso(List<Prioridad> prioridadCaso) {
		this.prioridadCaso = prioridadCaso;
	}

	public List<Asignado> getAsignadoCaso() {
		return asignadoCaso;
	}

	public void setAsignadoCaso(List<Asignado> asignadoCaso) {
		this.asignadoCaso = asignadoCaso;
	}

	public List<Soporte> getSoporteCaso() {
		return soporteCaso;
	}

	public void setSoporteCaso(List<Soporte> soporteCaso) {
		this.soporteCaso = soporteCaso;
	}

	public List<Severidad> getSeveridadCaso() {
		return severidadCaso;
	}

	public void setSeveridadCaso(List<Severidad> severidadCaso) {
		this.severidadCaso = severidadCaso;
	}

	public List<Estado> getEstadoCaso() {
		return estadoCaso;
	}

	public void setEstadoCaso(List<Estado> estadoCaso) {
		this.estadoCaso = estadoCaso;
	}

	
}
