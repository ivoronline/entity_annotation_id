package com.ivoronline.springboot.entity_annotation_id.repositories;

import com.ivoronline.springboot.entity_annotation_id.entities.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, Integer> { }
