package com.fci.pes.controller;

import com.fci.pes.dao.AttributeRepository;
import com.fci.pes.entity.Attribute;
import com.fci.pes.entity.AttributeDto;
import com.fci.pes.service.AttributeServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.transaction.Transactional;
import java.util.ArrayList;

@RestController
@CrossOrigin
public class AppController {
    @Autowired
    AttributeServiceImplementation attributeServiceImplementation;
@Autowired
    AttributeRepository attributeRepository;
    @GetMapping("/addAttribute")
    public void addAttribute() {attributeServiceImplementation.addAttributes();}

    @GetMapping("/getAllAttributes")
    public ArrayList<Attribute> getAttributes(){
        return attributeServiceImplementation.getAllAttributes();
    }
    @GetMapping("/welcome")
    public String testMethod(){
        return "test-call for pes ";
    }
    @GetMapping("findByAttributeId/{attributeId}")
    public Attribute getAttributeById(@PathVariable long attributeId){
       return attributeServiceImplementation.findByAttributeId(attributeId);
    }
    @PostMapping("/attribute/addAttribute")
    public long addAttribute(@RequestBody AttributeDto attributeDto){
        long newAttributeId = attributeServiceImplementation.addAttribute(attributeDto);
        return newAttributeId;
    }
    @PostMapping("/attribute/editAttribute")
    public String editAttribute(@RequestBody AttributeDto attributeDto){
        return attributeServiceImplementation.updateAttribute(attributeDto);
    }
    @DeleteMapping("/attribute/deleteAttribute/{attributeId}")
    @Transactional
    public String deleteAttribute (@PathVariable long attributeId){
         attributeRepository.deleteById(attributeId);
         return "Deleted Attribute ID " + attributeId;
    }
}
