package com.fci.pes.entity;

import javax.persistence.*;

@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long uomID;
    private String uomDescription;
    private long uomMeasurementID;

}
