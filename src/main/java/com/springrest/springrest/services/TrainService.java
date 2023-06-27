package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import com.springrest.springrest.entities.train;

public interface TrainService {
	
    public List<train> getTrains();
    
    public Optional<train> getTrains(long Tno);
    
    public train addTrain(train Train);

	public train updateTrain(train Train);

	public void deleteTrain(long parseLong);
    
}
