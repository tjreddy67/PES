package com.fci.pes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;
@Entity
public class WorkOrder {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_order_number", nullable = false)
    private long workOrderNumber;

    private String workOrderBusinessUnit;
    private String workOrderSite;
    private String workOrderLot;
    private String workOrderItem;
    private String workOrderItemDescription;
    private String workOrderItem_Family;
    private String workOrderProdLine;
    private long workOrderQty_Ordered;
    private long workOrderQty_Completed;
    private long workOrderQty_Rejected;
    private Date workOrderOrder_Date;
    private Date workOrderRelease_Date;
    private Date workOrderDue_Date;
    private String workOrderShift;
    private String workOrderStatus;
    private String workOrderJob;
    private String workOrderSupplier;
    private String workOrderRoutingID;
    private String workOrderBOMID;
    private long workOrderYield;
    private String workOrderType;
    private long workOrderOperation;
    private String workOrderEngineerID;
    private String workOrderSalesOrderNumber;
    private String workOrderCustomerName;
    private String workOrderSetup_Required;
    private Date workOrderModified_Date;
    private String workOrderModified_By;
    private Date workOrderCreated_Date;
    private String workOrderCreated_By;
    private String workOrderchar01;
    private String workOrderchar02;
    private String workOrderchar03;
    private long workOrderInt01;
    private long workOrderInt02;
    private long workOrderInt03;
    private Date workOrderDate01;
    private Date workOrderDate02;
    private Date workOrderDate03;

    public long getWorkOrderNumber() {
        return workOrderNumber;
    }

    public void setWorkOrderNumber(long workOrderNumber) {
        this.workOrderNumber = workOrderNumber;
    }

}
