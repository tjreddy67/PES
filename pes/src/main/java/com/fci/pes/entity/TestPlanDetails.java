package com.fci.pes.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
public class TestPlanDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "test_plan_attribute_plan_id", nullable = false)
    private long testPlanAttributePlanId;

    private long testPlanAttributeAttributeID;
    private long testPlanAttributeReferenceValue;
    private long testPlanAttributeVarianceLowerLimit;
    private long testPlanAttributeVarianceUpperLimit;
    private Date testPlanAttributeModifiedDate;
    private String testPlanAttributeModifiedBy;
    private Date testPlanAttributeCreatedDate;
    private String testPlanAttributeCreatedBy;

    public Long getTestPlanAttributePlanId() {
        return testPlanAttributePlanId;
    }

    public void setTestPlanAttributePlanId(Long testPlanAttributePlanId) {
        this.testPlanAttributePlanId = testPlanAttributePlanId;
    }

}
