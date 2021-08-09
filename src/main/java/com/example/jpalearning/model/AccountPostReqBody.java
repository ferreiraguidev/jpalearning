package com.example.jpalearning.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
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
