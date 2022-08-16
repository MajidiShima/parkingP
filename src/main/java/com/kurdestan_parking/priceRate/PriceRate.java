package com.kurdestan_parking.priceRate;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Table(name="tbl_priceRate")
@Data


public class PriceRate {


    @Id
    private Long id;



    @NotNull
    @Column(name="rate")
    private Long rate;




}
