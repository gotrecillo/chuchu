package chuchu;

import java.sql.Date;

public class Billete {
	private int idBillete, idLinea, idVagon;
	private String nombreViajero;
	private Categoria categoria;
	private Estado estado;
	private Pago pago;
	private Date fechaExpedicion;
	
	public Billete(){};
	
	public Billete(int idBillete, int idLinea, int idVagon,
			String nombreViajero, Categoria categoria, Estado estado,
			Pago pago, Date fechaExpedicion) {
		this.idBillete = idBillete;
		this.idLinea = idLinea;
		this.idVagon = idVagon;
		this.nombreViajero = nombreViajero;
		this.categoria = categoria;
		this.estado = estado;
		this.pago = pago;
		this.fechaExpedicion = fechaExpedicion;
	}

	public int getIdBillete() {
		return idBillete;
	}

	public void setIdBillete(int idBillete) {
		this.idBillete = idBillete;
	}

	public int getIdLinea() {
		return idLinea;
	}

	public void setIdLinea(int idLinea) {
		this.idLinea = idLinea;
	}

	public int getIdVagon() {
		return idVagon;
	}

	public void setIdVagon(int idVagon) {
		this.idVagon = idVagon;
	}

	public String getNombreViajero() {
		return nombreViajero;
	}

	public void setNombreViajero(String nombreViajero) {
		this.nombreViajero = nombreViajero;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Pago getPago() {
		return pago;
	}

	public void setPago(Pago pago) {
		this.pago = pago;
	}

	public Date getFechaExpedicion() {
		return fechaExpedicion;
	}

	public void setFechaExpedicion(Date fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}

	@Override
	public String toString() {
		return "Billete : " + idBillete + ", viajero: " + nombreViajero
				+ ", categoria: " + categoria ;
	}
	
	
}
