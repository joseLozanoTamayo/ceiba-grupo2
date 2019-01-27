package com.lemonade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lemonade.model.SeguroModel;

@Repository
public interface SeguroRepository extends JpaRepository<SeguroModel, Integer>{

}
