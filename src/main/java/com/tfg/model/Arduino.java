package com.tfg.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TARDUINO")
public class Arduino {

	@Id
	@GeneratedValue
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private ArduinoState state;
	
	@OneToOne(mappedBy="arduino", cascade = CascadeType.ALL)
	private User user;
	
	private boolean puerta;
	private boolean peso;
	private boolean carga;
	private boolean presencia;
	private double temperatura;
	
	public Arduino() {}
	
	public ArduinoState getState() {
		return state;
	}
	public void setState(ArduinoState state) {
		this.state = state;
	}
	public boolean getPuerta() {
		return puerta;
	}
	public void setPuerta(boolean puerta) {
		this.puerta = puerta;
	}
	public boolean getPeso() {
		return peso;
	}
	public void setPeso(boolean peso) {
		this.peso = peso;
	}
	public boolean getCarga() {
		return carga;
	}
	public void setCarga(boolean carga) {
		this.carga = carga;
	}
	public boolean getPresencia() {
		return presencia;
	}
	public void setPresencia(boolean presencia) {
		this.presencia = presencia;
	}
	public double getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	public Long getId() {
		return id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
