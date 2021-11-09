package com.israelmessias.bancahq.model.entity;

import com.israelmessias.bancahq.model.enums.Editora;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "hq", schema = "banca_hq")
@Entity
public class Hq {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "genero")
    private String genero;

    @Column(name = "editora")
    @Enumerated(value = EnumType.STRING)
    private Editora editora;

    @Column(name = "preco")
    private Double preco;
}
