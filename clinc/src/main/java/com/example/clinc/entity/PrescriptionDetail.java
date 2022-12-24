package com.example.clinc.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "prescription_details", schema = "clenic")
public class PrescriptionDetail {
    private Integer id;

    private Prescription idPrescription;

    private Med idMed;

    public PrescriptionDetail(Prescription idPrescription, Med idMed) {
        this.idPrescription = idPrescription;
        this.idMed = idMed;
    }

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_prescription", nullable = false)
    public Prescription getIdPrescription() {
        return idPrescription;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_med", nullable = false)
    public Med getIdMed() {
        return idMed;
    }

}