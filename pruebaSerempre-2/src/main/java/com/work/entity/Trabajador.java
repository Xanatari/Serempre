package com.work.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity @Table(name = "tareas")
@JsonIgnoreProperties( ignoreUnknown = true)
public class Trabajador {
	
	@Id
	@Column(name = "id_Tarea")
	private String idTarea;
	
	
	@Column(name = "employee_id")
	private int idTrabajdor;
	
	@Column(name = "nombre_trabajador")
	private String nombreTrabajador;
	
	@Column(name = "titulo_tareas")
	private String Titulo;
	
	@Column(name = "descripcion_tarea")
	private String Descripcion;
	
	@Column(name = "tiempo_estidamdor")
	private String tiempoEstimado;
	
	@Column(name = "tiempo_trabajado")
	private String tiempoTrabajdo;
	
	@Column(name = "tiempo_Total")
	private String tiempoTotal;
	
	

	public String getIdTarea() {
		return idTarea;
	}
	public void setIdTarea(String idTarea) {
		this.idTarea = idTarea;
	}
	public int getIdTrabajdor() {
		return idTrabajdor;
	}
	public void setIdTrabajdor(int idTrabajdor) {
		this.idTrabajdor = idTrabajdor;
	}
	public String getNombreTrabajador() {
		return nombreTrabajador;
	}
	public void setNombreTrabajador(String nombreTrabajador) {
		this.nombreTrabajador = nombreTrabajador;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public String getTiempoEstimado() {
		return tiempoEstimado;
	}
	public void setTiempoEstimado(String tiempoEstimado) {
		this.tiempoEstimado = tiempoEstimado;
	}
	public String getTiempoTrabajdo() {
		return tiempoTrabajdo;
	}
	public void setTiempoTrabajdo(String tiempoTrabajdo) {
		this.tiempoTrabajdo = tiempoTrabajdo;
	}
	public String getTiempoTotal() {
		return tiempoTotal;
	}
	public void setTiempoTotal(String tiempoTotal) {
		this.tiempoTotal = tiempoTotal;
	}
	
	
	@Override
	public String toString() {
		return "Trabajador [idTrabajdor=" + idTrabajdor + ", nombreTrabajador=" + nombreTrabajador + ", Titulo="
				+ Titulo + ", Descripcion=" + Descripcion + ", tiempoEstimado=" + tiempoEstimado + ", tiempoTrabajdo="
				+ tiempoTrabajdo + ", tiempoTotal=" + tiempoTotal + ", idTarea=" + idTarea + ", getIdTarea()="
				+ getIdTarea() + ", getIdTrabajdor()=" + getIdTrabajdor() + ", getNombreTrabajador()="
				+ getNombreTrabajador() + ", getTitulo()=" + getTitulo() + ", getDescripcion()=" + getDescripcion()
				+ ", getTiempoEstimado()=" + getTiempoEstimado() + ", getTiempoTrabajdo()=" + getTiempoTrabajdo()
				+ ", getTiempoTotal()=" + getTiempoTotal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}



}