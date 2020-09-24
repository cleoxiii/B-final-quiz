package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "trainers")
@SequenceGenerator(name="TrainerSEQ",sequenceName="TrainerSEQ_DB")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrainerDto {
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TrainerSEQ")
    @Id
    private Long id;
    private String name;
}
