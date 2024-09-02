package com.example.aquarium.servicios;

import com.example.aquarium.modelo.Fish;
import com.example.aquarium.repositorios.FishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FishService {

    @Autowired
    private FishRepository fishRepository;

    public List<Fish> getAllFish(){
        return fishRepository.findAll();
    }

    public Optional<Fish> getFishById(Long id){
       return fishRepository.findById(id);
    }

    public Fish saveFish(Fish fish){
        return fishRepository.save(fish);
    }

    public void deleteFish(Long id){
        fishRepository.deleteById(id);
    }
}
