package com.example.jpalearning.model;


import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class AccountPostReqBody {

    @NotNull
    private Long sold;

    @NotBlank
    private String userEmail;

    private LocalDate lastchecked;

    private String name;

    @NotNull
    private Long userId;


}
