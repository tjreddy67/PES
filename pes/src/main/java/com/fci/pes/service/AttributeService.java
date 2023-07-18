package com.fci.pes.service;

import com.fci.pes.entity.Attribute;
import com.fci.pes.entity.AttributeDto;

import java.util.ArrayList;

public interface AttributeService {

    void addAttributes();

    ArrayList<Attribute> getAllAttributes();
    Attribute findByAttributeId(long attributeId);

    long addAttribute(AttributeDto attributeDto);

    String updateAttribute(AttributeDto attributeDto);

}
