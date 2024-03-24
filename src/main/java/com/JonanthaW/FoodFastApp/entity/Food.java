package com.JonanthaW.FoodFastApp.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "comidas")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comida_id")
    private Long comida_id;

    @Column(name="categoria_id")
    private Long categoria_id;

    @Column(name="nome")
    private String nome;

    @Column(name="preco")
    private Long preco;

    @Column(name = "descricao")
    private String descricao;
}
