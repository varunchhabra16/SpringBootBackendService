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

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User findUserById(Long id){
        return userRepository.findById(id).get(); //tobereviewed
    }

    public User createUser(User user){
        userRepository.save(user);
        return user;
    }

    public User updateUser(User user){
        userRepository.save(user);
        return user;
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

}
