package org.example.cadastrousers.service;

import org.example.cadastrousers.model.User;
import org.example.cadastrousers.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public List<User> create(User user) {
        userRepository.save(user);
        return list();
    }


    public List<User> list() {
        return userRepository.findAll();
    }

    @Transactional
    public List<User> update(User user) {
        userRepository.save(user);
        return list();
    }

    @Transactional
    public List<User> delete(Long id) {
        userRepository.deleteById(id);
        return list();
    }
}
