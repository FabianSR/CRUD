package com.prueba.persistence.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "PRUEBA")
@Data
public class PruebaEntidad {

    @Id
    @Column(name = "id_prueba")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String campo;
}
