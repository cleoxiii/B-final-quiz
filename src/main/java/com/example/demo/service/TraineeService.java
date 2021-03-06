package com.example.demo.service;

import com.example.demo.domain.Trainee;
import com.example.demo.dto.TraineeDto;
import com.example.demo.exception.TraineeNotExistedException;
import com.example.demo.repository.TraineeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TraineeService {
    private final TraineeRepository traineeRepository;

    public TraineeService(TraineeRepository traineeRepository) {
        this.traineeRepository = traineeRepository;
    }

    public TraineeDto addTrainee(Trainee trainee) {
        TraineeDto traineeDto = TraineeDto.builder()
                .name(trainee.getName())
                .office(trainee.getOffice())
                .email(trainee.getEmail())
                .zoomId(trainee.getZoomId())
                .github(trainee.getGithub()).build();
        traineeRepository.save(traineeDto);
        return traineeDto;
    }

    public List<TraineeDto> getTrainees() {
        return traineeRepository.findAll();
    }

    public void deleteTraineeById(Long id) {
        if (!traineeRepository.existsById(id)) {
            throw new TraineeNotExistedException("学员不存在");
        }
        traineeRepository.deleteById(id);
    }
}
