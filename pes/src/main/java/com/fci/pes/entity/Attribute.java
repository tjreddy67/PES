package com.fci.pes.entity;

import javax.persistence.*;

import java.util.Date;

@Entity
public class Attribute {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long attributeId;

    public Attribute() {

    }

    public Attribute(String attrName, String attrDescription, String attrMeasurement, String attrUOM, String attrUnitType, int attrDecimalFormat, String attrCharacterFormat, String createdBy, String modifiedBy, Date createdDate, Date modifiedDate) {
        this.attrName = attrName;
        this.attrDescription = attrDescription;
        this.attrMeasurement = attrMeasurement;
        this.attrUOM = attrUOM;
        this.attrUnitType = attrUnitType;
        this.attrDecimalFormat = attrDecimalFormat;
        this.attrCharacterFormat = attrCharacterFormat;
        this.createdBy = createdBy;
        this.modifiedBy = modifiedBy;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
    public long getAttributeId() {return attributeId;
    }
    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrDescription() {
        return attrDescription;
    }

    public void setAttrDescription(String attrDescription) {
        this.attrDescription = attrDescription;
    }

    public String getAttrMeasurement() {
        return attrMeasurement;
    }

    public void setAttrMeasurement(String attrMeasurement) {
        this.attrMeasurement = attrMeasurement;
    }

    public String getAttrUOM() {
        return attrUOM;
    }

    public void setAttrUOM(String attrUOM) {
        this.attrUOM = attrUOM;
    }

    public String getAttrUnitType() {
        return attrUnitType;
    }

    public void setAttrUnitType(String attrUnitType) {
        this.attrUnitType = attrUnitType;
    }

    public long getAttrDecimalFormat() {
        return attrDecimalFormat;
    }

    public void setAttrDecimalFormat(long attrDecimalFormat) {
        this.attrDecimalFormat = attrDecimalFormat;
    }

    public String getAttrCharacterFormat() {
        return attrCharacterFormat;
    }

    public void setAttrCharacterFormat(String AttributeCharacter) {
        this.attrCharacterFormat = AttributeCharacter;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Attribute(String attrName, String attrDescription, String attrMeasurement, String attrUOM, String attrUnitType, long attrDecimalFormat, String attrCharacterFormat, String createdBy, Date createdDate, String modifiedBy, Date modifiedDate) {
        this.attrName = attrName;
        this.attrDescription = attrDescription;
        this.attrMeasurement = attrMeasurement;
        this.attrUOM = attrUOM;
        this.attrUnitType = attrUnitType;
        this.attrDecimalFormat = attrDecimalFormat;
        this.attrCharacterFormat = attrCharacterFormat;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
    }

    private String attrName;
    private String attrDescription;
    private String attrMeasurement;
    private String attrUOM;
    private String attrUnitType;
    @Column(nullable = true)
    private long attrDecimalFormat;
    private String attrCharacterFormat;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;
    private String attrChar01;
    private String attrChar02;
    private String attrChar03;
    private long attrInt01;
    private long attrInt02;
    private long attrInt03;
    private Date attrDate01;
    private Date attrDate02;
    private Date attrDate03;
}
