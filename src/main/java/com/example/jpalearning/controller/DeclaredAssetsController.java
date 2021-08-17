package com.example.jpalearning.controller;

import com.example.jpalearning.model.DeclaredAssets;
import com.example.jpalearning.model.DeclaredAssetsPostReqBody;
import com.example.jpalearning.service.DeclaredAssetsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class DeclaredAssetsController {

    private final DeclaredAssetsService declaredAssetsService;

    public DeclaredAssetsController(DeclaredAssetsService declaredAssetsService) {
        this.declaredAssetsService = declaredAssetsService;
    }


    @PostMapping("assets")
    public ResponseEntity<DeclaredAssets> save(@RequestBody DeclaredAssetsPostReqBody declaredAssetsPostReqBody) {
        return new ResponseEntity<>(declaredAssetsService.save(declaredAssetsPostReqBody), HttpStatus.OK);

    }

    @GetMapping("assets")
    public List<DeclaredAssets> accountList() {
        return declaredAssetsService.listAll();

    }
}
