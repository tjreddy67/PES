package com.fci.pes.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
public class WorkOrderRouting {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "wo_routing_id", nullable = false)
    private Long woRoutingId;
    private String woFieldName;
    private String woRoutingBusinessUnit;
    private String woRoutingNumber;
    private String woRoutingLot;
    private String woRoutingSite;
    private String woRoutingItem;
    private String woRoutingItemDescription;
    private String woRoutingItem_Family;
    private String woRoutingMachine;
    private long woRoutingMch_Per_Operation;
    private String woRoutingMileStone_Operation;
    private long woRoutingStandard_Move_Time;
    private long woRoutingOperation;
    private String woRoutingPO_Number;
    private long woRoutingPO_Line;
    private Date woRoutingProduct_Line;
    private String woRoutingQty_InQueue;
    private String woRoutingQty_Moved;
    private String woRoutingQueue_Time;
    private String woRoutingStandard_Run_Time;
    private String woRoutingSequence;
    private String woRoutingStandard_Setup_Time;
    private long woRoutingShift;
    private long woRoutingStandard_Operation;
    private long woRoutingYield_Percentage;
    private String woRoutingWorkCenter;
    private long woRoutingWait_Time;
    private String woRoutingStatus;
    private Date woRoutingModified_Date;
    private String woRoutingModified_By;
    private Date woRoutingCreated_Date;
    private String woRoutingCreated_By;

    public Long getWoRoutingId() {
        return woRoutingId;
    }

    public void setWoRoutingId(Long woRoutingId) {
        this.woRoutingId = woRoutingId;
    }

}
