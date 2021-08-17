package com.example.jpalearning.service;

import com.example.jpalearning.model.User;
import com.example.jpalearning.model.UserPostRequestBody;
import com.example.jpalearning.repository.AccountRepository;
import com.example.jpalearning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    AccountRepository accountRepository;


    public User save(UserPostRequestBody userPostRequestBody) {

        User users = User.builder()
                .name(userPostRequestBody.getName())
                .userEmail(userPostRequestBody.getUserEmail())
                .cpf(userPostRequestBody.getCpf())
                .build();

        return userRepository.save(users);

    }

    public List<User> ListAllUsers() {
        return userRepository.findAll();
    }
}
