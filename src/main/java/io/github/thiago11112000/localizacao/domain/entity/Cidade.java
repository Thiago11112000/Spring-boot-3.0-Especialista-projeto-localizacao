package io.github.thiago11112000.localizacao.domain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "tb_cidade")
public class Cidade {
    @Id
    @Column(name = "id_cidade")
    private Long id;
    @Column(name = "nome" , length = 50)
    private String nome;
    @Column(name = "qtd_habitantes")
    private Long habitantes;
}
