package com.bulk.persona.PersonaBACKEND.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name="pais")
public class Pais {

	public Pais() {

	}

	public Pais(String nombre) {
		this.nombre = nombre;

	}

	@Id
	//@GeneratedValue(strategy= GenerationType.AUTO)
	@Getter @Setter
    private int id;
	@Getter @Setter
    private String nombre;

}
