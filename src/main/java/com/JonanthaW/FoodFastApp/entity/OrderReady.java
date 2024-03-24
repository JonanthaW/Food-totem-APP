package com.JonanthaW.FoodFastApp.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "balcao")
public class OrderReady {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prontos_id")
    private Long prontosId;

    @Column(name = "codigo")
    private Long codigo;

    @Column(name = "nome")
    private String nome;

    @Column(name = "status")
    private String status;
}
