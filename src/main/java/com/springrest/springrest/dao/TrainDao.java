package com.springrest.springrest.dao;
import com.springrest.springrest.entities.train;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainDao extends JpaRepository<train,Long> {

	

}
