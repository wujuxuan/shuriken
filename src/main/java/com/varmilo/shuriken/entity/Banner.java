package com.varmilo.shuriken.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Banner {
    private Long id;

    @NotNull
    private String image;
}
