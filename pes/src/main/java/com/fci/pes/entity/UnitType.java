package com.fci.pes.entity;

import javax.persistence.*;

@Entity
public class UnitType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long unitTypeID;
    private String unitTypeDescription;


}
