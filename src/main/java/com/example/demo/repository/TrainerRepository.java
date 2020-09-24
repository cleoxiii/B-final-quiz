package com.example.demo.repository;

import com.example.demo.dto.TrainerDto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TrainerRepository extends CrudRepository<TrainerDto, Long> {
    @Override
    List<TrainerDto> findAll();
}
