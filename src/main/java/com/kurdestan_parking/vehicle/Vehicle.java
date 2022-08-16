package com.kurdestan_parking.vehicle;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="tbl_vehicle")
@Data

public class Vehicle {

    @Id
    private Long id;

    @NotNull
    @Column(name = "TejaSavari")
    @Enumerated(value = EnumType.STRING)
    private TejaSavari TejaSavari;

    @NotNull
    @Column(name ="pelak",unique = true )
    private String pelak;


}
