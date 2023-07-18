package com.fci.pes.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
public class ShiftCalender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String shiftBusinessUnit;
    private String shiftSite;
    private String shiftID;
    private String shiftwkctr;
    private String shiftMch;
    private String shiftProductivity;
    private long shiftDay;
    private long shiftHours;
    private String shiftStartTime;
    private String shiftEndTime;
    private Date shiftModifiedDate;
    private String shiftModifiedBy;
    private Date shiftCreatedDate;
    private String shiftCreatedBy;
    private String shiftchar01;
    private String shiftchar02;
    private String shiftchar03;
    private long shiftInt01;
    private long shiftInt02;
    private long shiftInt03;
    private Date shiftDate01;
    private Date shiftDate02;
    private Date shiftDate03;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
