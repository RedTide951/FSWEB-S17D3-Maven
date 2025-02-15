package com.workintech.zoo.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Kangaroo {
    private int id;
    private String name;
    private Double height;
    private Double weight;
    private String gender;
    // Getter and Setter for isAggressive
    @Setter
    @Getter
    private Boolean isAggressive;

}