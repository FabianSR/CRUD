package com.prueba.persistence.model;

import javax.persistence.*;

@Entity
@Table(name = "OTRA")
public class OtraEntidad {

    @Id
    private String id;
    @ManyToOne
    @JoinColumn(name = "prueba_id")
    private PruebaEntidad prueba;

}
