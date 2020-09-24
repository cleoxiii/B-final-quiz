package com.example.demo.api;

import com.example.demo.domain.Trainer;
import com.example.demo.dto.TrainerDto;
import com.example.demo.service.TrainerService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/trainers")
@Validated
public class TrainerController {
    private final TrainerService trainerService;

    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TrainerDto addTrainer(@RequestBody @Valid Trainer trainer) {
        return trainerService.addTrainee(trainer);
    }

    @GetMapping
    public List<TrainerDto> getTrainees() {
        return trainerService.getTrainers();
    }

    @DeleteMapping("/{trainer_id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTrainee(@PathVariable Long trainer_id) {
        trainerService.deleteTraineeById(trainer_id);
    }
}
