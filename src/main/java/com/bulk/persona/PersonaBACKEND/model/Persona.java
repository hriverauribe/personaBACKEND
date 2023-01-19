package com.bulk.persona.PersonaBACKEND.model;

import javax.persistence.Column;
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
@Table (name="persona")
public class Persona {

	public Persona() {

	}
	
	public Persona(String nombre, String apellido, int edad, Pais pais, Estado estado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.pais = pais;
		this.estado = estado;
	}
	@Id
	//@GeneratedValue(strategy= GenerationType.AUTO)
	@Getter @Setter
    private int id;
	@Getter @Setter
    private String nombre;
	@Getter @Setter
    private String apellido;
	@Getter @Setter
    private int edad;
    @ManyToOne
    @JoinColumn (name="id_pais")
    @Getter @Setter
    private Pais pais;
    @ManyToOne
    @JoinColumn (name="id_estado")
    @Getter @Setter
    private Estado estado;
    
    
}
