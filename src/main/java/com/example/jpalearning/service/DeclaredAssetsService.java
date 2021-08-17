package com.example.jpalearning.service;

import com.example.jpalearning.model.DeclaredAssets;
import com.example.jpalearning.model.DeclaredAssetsPostReqBody;
import com.example.jpalearning.repository.DeclaredAssetsRepository;
import com.example.jpalearning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeclaredAssetsService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    DeclaredAssetsRepository declaredAssetsRepository;

    public DeclaredAssets save(DeclaredAssetsPostReqBody declaredAssetsPostReqBody) {

        DeclaredAssets declaredAssets = DeclaredAssets.builder()
                .asset(declaredAssetsPostReqBody.getAsset())
                .tax(declaredAssetsPostReqBody.getTax())
                .users(userRepository.findById(declaredAssetsPostReqBody.getUserId())
                        .orElseThrow(() -> new RuntimeException("not found")))
                .build();

        return declaredAssetsRepository.save(declaredAssets);


    }

    public List<DeclaredAssets> listAll(){
        return declaredAssetsRepository.findAll();
    }


}
