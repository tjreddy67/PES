package com.fci.pes.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class TestResults {

    private String testResultsBusinessUnit;
    @Id
    private String testResultsTest_ID;
    private String testResultsAttribute_ID;
    private long testResultsOperation_ID;
    private String testResultsSite;
    private String testResultsJobOrder_ID;
    private String testResultsProductionLine;
    private String testResultsWorkOrder;
    private String testResultsDatePerformed;
    private String testResultsShift;
    private String testResultsReferenceValue;
    private String testResultsActualValue;
    private long testResultsVariance_LowerLimit;
    private long testResultsVariance_UpperLimit;
    private String testResultsQA_Results;
    private long testResultsSampleSize;
    private String testResultsItemID;
    private String testResultsItemDescription;
    private Date testResultsModified_Date;
    private String testResultsModified_By;
    private Date testResultsCreated_Date;
    private String testResultsCreated_By;

}
