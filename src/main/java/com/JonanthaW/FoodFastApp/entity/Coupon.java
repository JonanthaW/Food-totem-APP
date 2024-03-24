package com.JonanthaW.FoodFastApp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "cupons")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cupom_id")
    private Long cupom_id;

    @Column(name = "cupom")
    private String cupom;

    @Column(name = "qntd_usado")
    private Long qntd_usado;

    @Column(name = "validade")
    private Date validade;

    @Column(name = "desconto")
    private Long desconto;
}
