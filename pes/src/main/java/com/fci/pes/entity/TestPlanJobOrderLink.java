package com.fci.pes.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
public class TestPlanJobOrderLink {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "test_plan_job_order_test_plan_id", nullable = false)
    private Long testPlanJobOrderTestPlanId;
    private  String testPlanJobOrderBusinessUnit;
    private long testPlanJobOrderJobOrderId;
    private long testPlanJobOrderAttributeId;
    private  String testPlanJobOrderOperation;
    private  String   testPlanJobOrderSequence;
    private  String  testPlanJobOrderOperationDescription;
    private  String  testPlanJobOrderRoutingId;
    private long testPlanJobOrderWorkOrderId;
    private long testPlanJobOrderItemId;
    private Date testPlanJobOrderModifiedDate;
    private String testPlanJobOrderModifiedBy;
    private Date testPlanJobOrderCreatedDate;
    private String testPlanJobOrderCreatedBy;

    public Long getTestPlanJobOrderTestPlanId() {
        return testPlanJobOrderTestPlanId;
    }

    public void setTestPlanJobOrderTestPlanId(Long testPlanJobOrderTestPlanId) {
        this.testPlanJobOrderTestPlanId = testPlanJobOrderTestPlanId;
    }

}
