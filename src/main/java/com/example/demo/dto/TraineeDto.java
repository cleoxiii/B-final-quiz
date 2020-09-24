package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainees")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TraineeDto {
    @GeneratedValue
    @Id
    private Long id;
    private String name;
    private String office;
    private String email;
    private String zoomId;
    private String github;
}
