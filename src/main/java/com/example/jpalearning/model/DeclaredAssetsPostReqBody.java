package com.example.jpalearning.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class DeclaredAssetsPostReqBody {

    @NotBlank
    private String asset;

    @NotBlank
    private String name;

    @NotNull
    private Long userId;

    @NotNull
    private Long tax;

}
