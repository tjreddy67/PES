package com.fci.pes.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Holiday {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String holidayBusinessUnit;
    private String holidaySite;
    private Date holidayDate;
    private String holidayDescription;
    private Date holidayModifiedDate;
    private String holidayModifiedBy;
    private Date holidayCreatedDate;
    private String holidayCreatedBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
