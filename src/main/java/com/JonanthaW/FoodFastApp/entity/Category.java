package com.JonanthaW.FoodFastApp.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "categorias")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_id")
    private Long categoriaId;

    @Column(name="nome")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "comida_id", referencedColumnName = "comida_id")
    private Food comidaId;
}
