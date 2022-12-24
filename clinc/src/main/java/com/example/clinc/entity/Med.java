package com.example.clinc.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "med", schema = "clenic")
public class Med {
    private Integer id;

    private String name;

    private TypeMed idType;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    @Column(name = "name", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_type", nullable = false)
    public TypeMed getIdType() {
        return idType;
    }

}