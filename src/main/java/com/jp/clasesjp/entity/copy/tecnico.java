package com.jp.clasesjp.entity.copy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tecnicos")
public class tecnico {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idtecnicos")
	private int Id_alumno;
	
	private String Nombre;

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String Nombre) {
		Nombre = Nombre;
	}
}


