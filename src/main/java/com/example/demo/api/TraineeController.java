package com.example.demo.api;

import com.example.demo.domain.Trainee;
import com.example.demo.dto.TraineeDto;
import com.example.demo.service.TraineeService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/trainees")
@Validated
public class TraineeController {
    private final TraineeService traineeService;

    public TraineeController(TraineeService traineeService) {
        this.traineeService = traineeService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TraineeDto addTrainee(@RequestBody @Valid Trainee trainee) {
        return traineeService.addTrainee(trainee);
    }

    @GetMapping
    public List<TraineeDto> getTrainees() {
        return traineeService.getTrainees();
    }

    @DeleteMapping("/{trainee_id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTrainee(@PathVariable Long trainee_id) {
        traineeService.deleteTraineeById(trainee_id);
    }

}
