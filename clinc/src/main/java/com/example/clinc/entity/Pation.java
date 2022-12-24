package com.example.clinc.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "pation", schema = "clenic")
public class Pation {
    @Id
    @Column(name = "id", nullable = false)
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private String address;

    private Boolean active;
    private String phone;


    public Integer getId() {
        return id;
    }

    @Column(name = "name", nullable = false, length = 20)
    public String getName() {
        return name;
    }

    public Pation(String name, String address, Boolean active, String phone) {
        this.name = name;
        this.address = address;
        this.active = active;
        this.phone = phone;
    }

    @Column(name = "address", nullable = false, length = 20)
    public String getAddress() {
        return address;
    }

    public Boolean getActive() {
        return active;
    }
    @Column(name = "active")

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Column(name = "phone", nullable = false, length = 20)
    public String getPhone() {
        return phone;
    }

}