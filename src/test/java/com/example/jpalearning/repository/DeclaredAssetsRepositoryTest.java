package com.example.jpalearning.repository;

import com.example.jpalearning.model.DeclaredAssets;
import com.example.jpalearning.model.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class DeclaredAssetsRepositoryTest {
    @Autowired
    DeclaredAssetsRepository declaredAssetsRepository;

    User user;

    @Test
    void save_Persist_When_Successfull(){

        DeclaredAssets assetsTobSaved = createAssets();
        DeclaredAssets declaredAssets = this.declaredAssetsRepository.save(assetsTobSaved);

        Assertions.assertThat(declaredAssets).isNotNull();
        Assertions.assertThat(declaredAssets.getId()).isNotNull();
        Assertions.assertThat(declaredAssets.getAsset()).isEqualTo(assetsTobSaved.getAsset());


    }

    private DeclaredAssets createAssets(){
        return DeclaredAssets.builder()
                .tax(188L)
                .users(user)
                .asset("String asset")
                .build();

    }
}