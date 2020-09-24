package com.example.demo.api;

import com.example.demo.domain.Trainee;
import com.example.demo.dto.TraineeDto;
import com.example.demo.service.TraineeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainees")
public class TraineeController {
    private final TraineeService traineeService;

    public TraineeController(TraineeService traineeService) {
        this.traineeService = traineeService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addTrainee(@RequestBody Trainee trainee) {
        traineeService.addTrainee(trainee);
    }

    @GetMapping
    public List<TraineeDto> getTrainees() {
        return traineeService.getTrainees();
    }
}
