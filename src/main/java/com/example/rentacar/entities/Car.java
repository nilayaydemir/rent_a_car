package com.example.rentacar.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int modelYear;
    private String plate;
    @Enumerated(EnumType.STRING)

    private State state;
    private double dailyPrice;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    @OneToMany(mappedBy = "car")
    private List<Maintenance> maintanences;
}
