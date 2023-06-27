package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.train;
import com.springrest.springrest.dao.TrainDao;
@Service
public class TrainServiceImpl implements TrainService {
@Autowired
private TrainDao trainDao;
//	List<train>list;
//	
public TrainServiceImpl() {
//	    list = new ArrayList<>();
//		list.add(new train(1234,"Narmada Express","Indore to Itarsi"));
//		list.add(new train(1235,"Jabalpur Superfast Express","Jabalpur to Indore"));
//		
	}
	@Override
	public List<train> getTrains() {
		
		return trainDao.findAll();
	}
	
	@Override
	public Optional<train> getTrains(long Tno) {
//		train c=null;
//		for(train Train:list) {
//			if(Train.getTno()==Tno) {
//				c=Train;
//				break;
//			}
//		}
//		return c;
		
		return trainDao.findById(Tno);
	}
	@Override
	public train addTrain(train Train) {    
		trainDao.save(Train);
		return Train;
	}
	
	@Override
	public train updateTrain(train Train) {
//        list.forEach(e ->{
//        	if(e.getId() == course.getId()) {
//        		e.setTitle(course.getTitle());
//        		e.setDescription(course.getDescription());
//        	}
//        });
		trainDao.save(Train);
        return Train;
	}
	@Override
	public void deleteTrain(long parseLong) {
//		list=this.list.stream().filter(e ->e.getId()!=parseLong).collect(Collectors.toList());
	
	train entity = trainDao.getOne(parseLong);
	trainDao.delete(entity);
	}


}
