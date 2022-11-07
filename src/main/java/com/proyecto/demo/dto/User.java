package com.proyecto.demo.dto;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Entity
@Table(name = "tb_usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name="username",length = 100000,nullable = false)
    private String username;

    @NotBlank
    @Column(name="password",length = 100000,nullable = false)
    private String password;
}