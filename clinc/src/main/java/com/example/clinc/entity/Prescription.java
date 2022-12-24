package com.example.clinc.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "prescription", schema = "clenic")
//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Prescription {
    private Integer id;

    private LocalDate mydate;

    private Pation idPation;

    private PathologicDiagnosis idPathologicDiagnosis;

    public Prescription(LocalDate mydate, Pation idPation, PathologicDiagnosis idPathologicDiagnosis) {
        this.mydate = mydate;
        this.idPation = idPation;
        this.idPathologicDiagnosis = idPathologicDiagnosis;
    }

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    @Column(name = "mydate", nullable = false)
    public LocalDate getMydate() {
        return mydate;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_pation", nullable = false)
    public Pation getIdPation() {
        return idPation;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_Pathologic_diagnosis", nullable = false)
    public PathologicDiagnosis getIdPathologicDiagnosis() {
        return idPathologicDiagnosis;
    }

}