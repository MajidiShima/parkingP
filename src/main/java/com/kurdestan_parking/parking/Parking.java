package com.kurdestan_parking;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Table(name="tbl_parking")
@Data
public class Parking {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;


        @NotNull
        @Column(name = "time")
        @Temporal(TemporalType.TIMESTAMP)
        private Date time;


        @NotNull
        @Column(name="Vehicle")
        private String vehicle;


    }

