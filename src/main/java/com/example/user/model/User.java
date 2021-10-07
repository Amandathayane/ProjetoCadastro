package com.example.user.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author amanda
 *
 */

@Entity
@Data
@Table(name = "USER")
public class User {

    private String nome;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matricula;
    private Integer cpf;
    private Integer rg;
    private String endereco;
    private String curso;
}
