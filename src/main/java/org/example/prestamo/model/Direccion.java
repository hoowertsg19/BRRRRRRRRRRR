package org.example.prestamo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Embeddable
@Getter
@Setter
public class Direccion {
    private String nombreBarrio;
    private String direccion;
    @ManyToOne
    private Municipio municipio;


}
