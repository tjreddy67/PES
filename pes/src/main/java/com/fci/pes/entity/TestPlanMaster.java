package com.fci.pes.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
public class TestPlanMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "test_plan_id", nullable = false)
    private long testPlanId;
    private String testPlanName;
    private Date modifiedDate;
    private Date createdDate;
    private String modifiedBy;

    private String createdBy;

    private String testPlanChar01;
    private String testPlanChar02;
    private String testPlanChar03;
    private long testPlanInt01;
    private long testPlanInt02;
    private long testPlanInt03;
    private Date testPlanDate01;
    private Date testPlanDate02;
    private Date testPlanDate03;

    public Long getTestPlanId() {
        return testPlanId;
    }

    public void setTestPlanId(Long testPlanId) {
        this.testPlanId = testPlanId;
    }
}
