package chuchu;

import java.sql.Date;

public class Linea {
	private int idLinea, idOrigen, idDestino;
	private String nombre;
	private Date horaSalida, horaLlegada;
	private Double precioPreferente, precioSegunda;
	
	public Linea(){};
	
	public Linea(int idLinea, int idOrigen, int idDestino, String nombre,
			Date horaSalida, Date horaLlegada, Double precioPreferente,
			Double precioSegunda) {
		this.idLinea = idLinea;
		this.idOrigen = idOrigen;
		this.idDestino = idDestino;
		this.nombre = nombre;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.precioPreferente = precioPreferente;
		this.precioSegunda = precioSegunda;
	}

	public int getIdLinea() {
		return idLinea;
	}

	public void setIdLinea(int idLinea) {
		this.idLinea = idLinea;
	}

	public int getIdOrigen() {
		return idOrigen;
	}

	public void setIdOrigen(int idOrigen) {
		this.idOrigen = idOrigen;
	}

	public int getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(int idDestino) {
		this.idDestino = idDestino;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Date getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(Date horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public Double getPrecioPreferente() {
		return precioPreferente;
	}

	public void setPrecioPreferente(Double precioPreferente) {
		this.precioPreferente = precioPreferente;
	}

	public Double getPrecioSegunda() {
		return precioSegunda;
	}

	public void setPrecioSegunda(Double precioSegunda) {
		this.precioSegunda = precioSegunda;
	}

	@Override
	public String toString() {
		return "Linea: " + nombre;
	}
	
	
	
	
}
