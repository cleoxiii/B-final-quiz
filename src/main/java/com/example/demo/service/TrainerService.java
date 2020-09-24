package com.example.demo.service;

import com.example.demo.domain.Trainer;
import com.example.demo.dto.TrainerDto;
import com.example.demo.exception.TrainerNotExistedException;
import com.example.demo.repository.TrainerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerService {
    private final TrainerRepository trainerRepository;

    public TrainerService(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    public TrainerDto addTrainee(Trainer trainer) {
        TrainerDto trainerDto = TrainerDto.builder().name(trainer.getName()).build();
        trainerRepository.save(trainerDto);
        return trainerDto;
    }

    public List<TrainerDto> getTrainers() {
        return trainerRepository.findAll();
    }

    public void deleteTraineeById(Long id) {
        if (!trainerRepository.existsById(id)) {
            throw new TrainerNotExistedException("讲师不存在");
        }
        trainerRepository.deleteById(id);
    }
}
