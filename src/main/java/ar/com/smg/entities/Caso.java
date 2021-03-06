package ar.com.smg.entities;
// Generated 07-feb-2017 13:05:04 by Hibernate Tools 5.1.0.Final

import java.util.Date;

/**
 * Casos generated by hbm2java
 */
public class Caso implements java.io.Serializable {

	private long idCaso;
	private String descripcion;
	private int idEstado;
	private int idSeveridad;
	private int idUsuario;
	private Date fechaRegistro;
	private Date fechaCierre;
	private int idSoporte;
	private int idTipoCaso;
	private String solicitadoPor;
	private String identificador;
	private int idModulo;
	private int idAplicacion;
	private int idPrioridad;
	private int idAsignado;
	private int idClasificacion;
	private int idVinculo;
	private String fechaEstimada;
	private String imputado;
	private String estimado;
	private String implementacion;
	private String reportadoPor;
	

	public Caso() {
	}


	public Caso(int idCaso, String descripcion, int idEstado, int idSeveridad, int idUsuario, Date fechaRegistro,
			Date fechaCierre, int idSoporte, int idTipoCaso, String solicitadoPor, String identificador, int idModulo,
			int idAplicacion, int idPrioridad, int idAsignado, int idClasificacion, int idVinculo, String fechaEstimada,
			String imputado, String estimado, String implementacion, String reportadoPor) {
		super();
		this.idCaso = idCaso;
		this.descripcion = descripcion;
		this.idEstado = idEstado;
		this.idSeveridad = idSeveridad;
		this.idUsuario = idUsuario;
		this.fechaRegistro = fechaRegistro;
		this.fechaCierre = fechaCierre;
		this.idSoporte = idSoporte;
		this.idTipoCaso = idTipoCaso;
		this.solicitadoPor = solicitadoPor;
		this.identificador = identificador;
		this.idModulo = idModulo;
		this.idAplicacion = idAplicacion;
		this.idPrioridad = idPrioridad;
		this.idAsignado = idAsignado;
		this.idClasificacion = idClasificacion;
		this.idVinculo = idVinculo;
		this.fechaEstimada = fechaEstimada;
		this.imputado = imputado;
		this.estimado = estimado;
		this.implementacion = implementacion;
		this.reportadoPor = reportadoPor;
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


	public int getIdEstado() {
		return idEstado;
	}


	public void setIdEstado(int idEstado) {
		this.idEstado = idEstado;
	}


	public int getIdSeveridad() {
		return idSeveridad;
	}


	public void setIdSeveridad(int idSeveridad) {
		this.idSeveridad = idSeveridad;
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public Date getFechaRegistro() {
		return fechaRegistro;
	}


	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}


	public Date getFechaCierre() {
		return fechaCierre;
	}


	public void setFechaCierre(Date fechaCierre) {
		this.fechaCierre = fechaCierre;
	}


	public int getIdSoporte() {
		return idSoporte;
	}


	public void setIdSoporte(int idSoporte) {
		this.idSoporte = idSoporte;
	}


	public int getIdTipoCaso() {
		return idTipoCaso;
	}


	public void setIdTipoCaso(int idTipoCaso) {
		this.idTipoCaso = idTipoCaso;
	}


	public String getSolicitadoPor() {
		return solicitadoPor;
	}


	public void setSolicitadoPor(String solicitadoPor) {
		this.solicitadoPor = solicitadoPor;
	}


	public String getIdentificador() {
		return identificador;
	}


	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}


	public int getIdModulo() {
		return idModulo;
	}


	public void setIdModulo(int idModulo) {
		this.idModulo = idModulo;
	}


	public int getIdAplicacion() {
		return idAplicacion;
	}


	public void setIdAplicacion(int idAplicacion) {
		this.idAplicacion = idAplicacion;
	}


	public int getIdPrioridad() {
		return idPrioridad;
	}


	public void setIdPrioridad(int idPrioridad) {
		this.idPrioridad = idPrioridad;
	}


	public int getIdAsignado() {
		return idAsignado;
	}


	public void setIdAsignado(int idAsignado) {
		this.idAsignado = idAsignado;
	}


	public int getIdClasificacion() {
		return idClasificacion;
	}


	public void setIdClasificacion(int idClasificacion) {
		this.idClasificacion = idClasificacion;
	}


	public int getIdVinculo() {
		return idVinculo;
	}


	public void setIdVinculo(int idVinculo) {
		this.idVinculo = idVinculo;
	}


	public String getFechaEstimada() {
		return fechaEstimada;
	}


	public void setFechaEstimada(String fechaEstimada) {
		this.fechaEstimada = fechaEstimada;
	}


	public String getImputado() {
		return imputado;
	}


	public void setImputado(String imputado) {
		this.imputado = imputado;
	}


	public String getEstimado() {
		return estimado;
	}


	public void setEstimado(String estimado) {
		this.estimado = estimado;
	}


	public String getImplementacion() {
		return implementacion;
	}


	public void setImplementacion(String implementacion) {
		this.implementacion = implementacion;
	}


	public String getReportadoPor() {
		return reportadoPor;
	}


	public void setReportadoPor(String reportadoPor) {
		this.reportadoPor = reportadoPor;
	}


	@Override
	public String toString() {
		return "Caso [idCaso=" + idCaso + ", descripcion=" + descripcion + ", idEstado=" + idEstado + ", idSeveridad="
				+ idSeveridad + ", idUsuario=" + idUsuario + ", fechaRegistro=" + fechaRegistro + ", fechaCierre="
				+ fechaCierre + ", idSoporte=" + idSoporte + ", idTipoCaso=" + idTipoCaso + ", solicitadoPor="
				+ solicitadoPor + ", identificador=" + identificador + ", idModulo=" + idModulo + ", idAplicacion="
				+ idAplicacion + ", idPrioridad=" + idPrioridad + ", idAsignado=" + idAsignado + ", idClasificacion="
				+ idClasificacion + ", idVinculo=" + idVinculo + ", fechaEstimada=" + fechaEstimada + ", imputado="
				+ imputado + ", estimado=" + estimado + ", implementacion=" + implementacion + ", reportadoPor="
				+ reportadoPor + "]";
	}


	
}
