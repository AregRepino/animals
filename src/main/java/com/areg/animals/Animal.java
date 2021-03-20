package com.areg.animals;
// повторить Date

import lombok.Data;

import java.time.LocalDate;

@Data
public abstract class Animal {


    private String name;
    private Color color;
    private double weight;
    private LocalDate birthDate;


}
