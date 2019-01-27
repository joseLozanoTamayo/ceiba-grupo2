package com.lemonade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lemonade.model.InmuebleModel;

@Repository
public interface InmuebleRepository extends JpaRepository<InmuebleModel, Integer>{

}
