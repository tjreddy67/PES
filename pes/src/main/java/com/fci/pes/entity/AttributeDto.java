package com.fci.pes.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AttributeDto {

private long attributeId;
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

}
