package com.fci.pes.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
public class LineMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String productionLineBusinessUnit;
    private String productionLineSite;
    private String productionLineLine;
    private String productionLineDescription;
    private String productionLineItem;
    private String productionLineItemFamily;
    private Date productionLineStartDate;
    private Date productionLineEndDate;
    private long productionLineUnitsPerHour;
    private long productionLineSetupTime;
    private long productionLineSetupCrew;
    private long productionLineRunCrew;
    private long productionLineSetupSize;
    private long productionLineRunSize;
    private String productionLineBOMID;
    private String productionLineRoutingID;
    private String productionLineToolID;
    private Date productionLineModifiedDate;
    private String productionLineModifiedBy;
    private Date productionLineCreatedDate;
    private String productionLineCreatedBy;
    private String productionLinechar01;
    private String productionLinechar02;
    private String productionLinechar03;
    private long productionLineInt01;
    private long productionLineInt02;
    private long productionLineInt03;
    private Date productionLineDate01;
    private Date productionLineDate02;
    private Date productionLineDate03;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
