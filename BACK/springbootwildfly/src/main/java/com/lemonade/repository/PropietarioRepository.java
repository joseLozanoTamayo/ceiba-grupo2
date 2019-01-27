package com.lemonade.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lemonade.model.PropietarioModel;

@Repository
public interface PropietarioRepository extends JpaRepository<PropietarioModel, String>{

}
