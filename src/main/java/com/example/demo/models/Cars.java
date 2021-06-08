package com.example.demo.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Cars")
@NoArgsConstructor
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private int id;
    @Getter
    @Setter
    private String category;
    @Getter
    @Setter
    private String brand;
    @Getter
    @Setter
    private String date_of_production;
    @Getter
    @Setter
    private String fuel_consumption;



}
