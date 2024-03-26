package com.JonanthaW.FoodFastApp.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "comidas")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comida_id")
    private Long comidaId;

    @Column(name="categoria_id")
    private Long categoriaId;

    @Column(name="nome")
    private String nome;

    @Column(name="preco")
    private Long preco;

    @Column(name = "descricao")
    private String descricao;
}
