package com.fci.pes.service;

import com.fci.pes.dao.AttributeRepository;
import com.fci.pes.entity.Attribute;
import com.fci.pes.entity.AttributeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;

@Service
public class AttributeServiceImplementation implements AttributeService {

    @Autowired
    AttributeRepository attributeRepository;

    @Override
    public void addAttributes() {
        Date createdDate = new Date(System.currentTimeMillis());
        ArrayList<Attribute> attributeArrayList = new ArrayList<>();
        attributeArrayList.add(new Attribute("length","length of the cable","12.78","metre","numerical",128,"yes","admin","admin",createdDate,createdDate));
        attributeArrayList.add(new Attribute("breath","breath of the cable","9.78","metre","numerical",9,"no","admin","admin",createdDate,createdDate));
        for (Attribute attri : attributeArrayList){
            attributeRepository.save(attri);
        }

    }

    @Override
    public ArrayList<Attribute> getAllAttributes() {
        return attributeRepository.findAll();
    }
    @Override
    public Attribute findByAttributeId(long attributeId){
    ArrayList<Attribute> attributeArrayList = attributeRepository.findByAttributeId(attributeId);
    if(attributeArrayList.size() > 0){
        return attributeArrayList.get(0);
    }
        return null;
    }

    @Override
    public long addAttribute(AttributeDto attributeDto) {
        Attribute attribute = new Attribute();
        Date createdDate = new Date(System.currentTimeMillis());
        attribute.setAttrName(attributeDto.getAttrName());
        attribute.setAttrDescription(attributeDto.getAttrDescription());
        attribute.setAttrCharacterFormat(attributeDto.getAttrCharacterFormat());
        attribute.setAttrDecimalFormat(attributeDto.getAttrDecimalFormat());
        attribute.setAttrCharacterFormat(attributeDto.getAttrCharacterFormat());
        attribute.setAttrMeasurement(attributeDto.getAttrMeasurement());
        attribute.setAttrUnitType(attributeDto.getAttrUnitType());
        attribute.setAttrUOM(attributeDto.getAttrUOM());
        attribute.setCreatedBy("admin");
        attribute.setModifiedBy("admin");
        attribute.setCreatedDate(createdDate);
        attribute.setModifiedDate(createdDate);
        attributeRepository.save(attribute);
        if(attribute.getAttributeId() > 0) {
            return attribute.getAttributeId();
        }
        else
            return -1;
    }

    @Override
    public String updateAttribute(AttributeDto attributeDto) {
        Attribute modifyAttribute = findByAttributeId(attributeDto.getAttributeId());
        if (modifyAttribute != null){
            Date modifiedDate = new Date(System.currentTimeMillis());
            modifyAttribute.setAttrName(attributeDto.getAttrName());
            modifyAttribute.setAttrDescription(attributeDto.getAttrDescription());
            modifyAttribute.setAttrCharacterFormat(attributeDto.getAttrCharacterFormat());
            modifyAttribute.setAttrDecimalFormat(attributeDto.getAttrDecimalFormat());
            modifyAttribute.setAttrCharacterFormat(attributeDto.getAttrCharacterFormat());
            modifyAttribute.setAttrMeasurement(attributeDto.getAttrMeasurement());
            modifyAttribute.setAttrUnitType(attributeDto.getAttrUnitType());
            modifyAttribute.setAttrUOM(attributeDto.getAttrUOM());
            modifyAttribute.setModifiedBy("admin");
            modifyAttribute.setModifiedDate(modifiedDate);
            attributeRepository.save(modifyAttribute);
            return "attribute updated";
        }
        else
        return "no attribute updated";
    }

}
