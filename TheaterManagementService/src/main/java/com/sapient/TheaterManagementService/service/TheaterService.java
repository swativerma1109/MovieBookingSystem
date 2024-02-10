package com.sapient.TheaterManagementService.service;

import com.sapient.TheaterManagementService.model.Theater;
import com.sapient.TheaterManagementService.repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheaterService {

//    @Autowired
//    private TheaterRepository theaterRepository;
static List<Theater> theaterList = new ArrayList<>();
    static{
        theaterList.add(new Theater(1L,"Theater1","location1",100));
        theaterList.add(new Theater(2L,"Theater2","location2",200));
        theaterList.add(new Theater(3L,"Theater3","location3",300));
        theaterList.add(new Theater(4L,"Theater4","location4",400));
        theaterList.add(new Theater(5L,"Theater5","location5",500));
    }
    public List<Theater> getAllTheatres() {
       // return theaterRepository.findAll();
        return theaterList;
    }

    public Theater addTheater(Theater theater) {
        theaterList.add(theater);
        //return theaterRepository.save(theater);
        return theater;
    }

    // Other CRUD operations

}
