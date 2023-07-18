package com.fci.pes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class Routing {
    @Id
    @Column(name = "routing_routing_id", nullable = false)
    private String routingRoutingID;

    private long routingOperation_ID;
    private long routingStandardOperation;
    private String routingWorkCenter;
    private String routingMachine;
    private long routingMachinePerOperation;
    private boolean routingMilestoneOperation;
    private long routingOverlapUnits;
    private long routingSubContractLeadTime;
    private long routingQueueTime;
    private long routingWaitTime;
    private long routingSetupCrew;
    private long routingRunCrew;
    private long routingSetupTime;
    private long routingRunTime;
    private long routingMoveTime;
    private Date routingStartDate;
    private Date routingEndDate;
    private long routingYieldPercentage;
    private String routingSupplierID;
    private String routingToolID;
    private String routingBomID;
    private String routingBatch;
    private long routingCycle_Unit;
    private long routingCycle_Rate;
    private String routingPurchaseOrder;
    private long routingPurchaseOrderLine;
    private String routingWIP_Item;
    private long routingActualRun;
    private long routingActualSetup;
    private String routingBusinessUnit;
    private String routingEngineerID;
    private long routingMchBurdenRate;
    private Date routingModified_Date;
    private String routingModified_By;
    private Date routingCreated_Date;
    private String routingCreated_By;
    private String routingchar01;
    private String routingchar02;
    private String routingchar03;
    private long routingInt01;
    private long routingInt02;
    private long routingInt03;
    private Date routingDate01;
    private Date routingDate02;

    public String getRoutingRoutingID() {
        return routingRoutingID;
    }

    public void setRoutingRoutingID(String routingRoutingID) {
        this.routingRoutingID = routingRoutingID;
    }

}
