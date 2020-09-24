package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "trainees")
@SequenceGenerator(name="TraineeSEQ",sequenceName="TraineeSEQ_DB")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TraineeDto {
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TraineeSEQ")
    @Id
    private Long id;
    private String name;
    private String office;
    private String email;
    private String zoomId;
    private String github;
}
