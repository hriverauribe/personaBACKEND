package com.bulk.persona.PersonaBACKEND.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name="estado")
public class Estado {

	public Estado() {

	}
	public Estado(Pais pais, String nombre) {
		super();
		this.pais = pais;
		this.nombre = nombre;
	}

	@Id
	//@GeneratedValue(strategy= GenerationType.AUTO)
	@Getter @Setter
    private int id;
	
	@ManyToOne
	@JoinColumn (name="id_pais")
	@Getter @Setter
    private Pais pais;
	
	@Getter @Setter
    private String nombre;
}
