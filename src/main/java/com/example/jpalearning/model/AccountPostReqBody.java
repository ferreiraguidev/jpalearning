package com.example.jpalearning.model;


import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class AccountPostReqBody {

    @NotNull
    private Long sold;

    @NotBlank
    private String userEmail;

    @NotNull
    private Long userId;

    @NotNull
    private Long bankId;



}
