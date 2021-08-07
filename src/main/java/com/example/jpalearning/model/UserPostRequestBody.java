package com.example.jpalearning.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class UserPostRequestBody {

    @NotBlank
    private String name;

    @NotBlank
    private String userEmail;

    @NotNull
    private Long cpf;

}
