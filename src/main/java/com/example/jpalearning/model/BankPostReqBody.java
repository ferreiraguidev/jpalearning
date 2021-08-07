package com.example.jpalearning.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class BankPostReqBody {

    // ID to be related to One User that can have multiples accounts

    @NotBlank
    private String name;

    @NotNull
    private Long sold;






}
