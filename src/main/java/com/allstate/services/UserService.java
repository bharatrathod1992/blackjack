package com.allstate.services;

import com.allstate.entities.User;
import com.allstate.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private IUserRepository userRepository;

    @Autowired
    public void setUserRepository(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User create(User user) {
        System.out.println("HERE IS THE RES :"+user);
        return this.userRepository.save(user);
    }

    public List<User> findAll() {
        return (List<User>) this.userRepository.findAll();
    }

    public User findById(int id) {
        return this.userRepository.findOne(id);
    }
}
