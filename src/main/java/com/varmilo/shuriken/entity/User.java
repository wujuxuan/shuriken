package com.varmilo.shuriken.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class User {
    private Long id;
    @NotNull
    private String username;
    @NotNull
    private String password;
    private Integer level;
}
