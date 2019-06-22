package com.chhabravarun.SpringBootBackendService.service;

import com.chhabravarun.SpringBootBackendService.model.User;
import com.chhabravarun.SpringBootBackendService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDaoService {

    @Autowired
    UserRepository userRepository;

    List<User> findAllUsers(){
        return userRepository.findAll();
    }

    User findUserById(Long id){
        return userRepository.findById(id).get(); //tobereviewed
    }

    User createUser(User user){
        userRepository.save(user);
        return user;
    }

    User updateUser(User user){
        userRepository.save(user);
        return user;
    }

    void deleteUser(Long id){
        userRepository.deleteById(id);
    }

}
