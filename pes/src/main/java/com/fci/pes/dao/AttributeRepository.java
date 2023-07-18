package com.fci.pes.dao;

import com.fci.pes.entity.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface AttributeRepository extends JpaRepository<Attribute,Long > {
ArrayList<Attribute> findAll();
    ArrayList<Attribute> findByAttributeId(long attributeId);
}
