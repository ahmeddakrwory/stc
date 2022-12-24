package com.example.clinc.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "pathologic_diagnosis", schema = "clenic")
public class PathologicDiagnosis {
    private Integer id;

    private String name;

    public PathologicDiagnosis(String name) {
        this.name = name;
    }

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    @Column(name = "name", nullable = false, length = 20)
    public String getName() {
        return name;
    }

}