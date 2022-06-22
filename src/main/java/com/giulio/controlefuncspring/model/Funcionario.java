package com.giulio.controlefuncspring.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "tb_funcionario")
@SequenceGenerator(name = "funcionario" ,sequenceName = "sq_tb_funcionario" ,allocationSize = 1)
public class Funcionario {

    @Id
    @GeneratedValue(generator = "funcionario", strategy = GenerationType.SEQUENCE)
    //TODO mudar nome da coluna do id
    @Column(name = "MUDAR DEPOIS")
    private Long id;

    @Column(name = "nm_funcionario", length = 55, nullable = false)
    private String nome;

    @Column(name = "nr_idade_funcionario", length = 2)
    private int idade;

}
