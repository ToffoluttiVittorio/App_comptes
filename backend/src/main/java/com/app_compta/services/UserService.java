package com.app_compta.services;

import com.app_compta.models.User;
import com.app_compta.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public ResponseEntity<String> getNomUser(Long id) {
        return userRepository.findById(id)
                .map(user -> ResponseEntity.ok(user.getNom()))
                .orElse(ResponseEntity.notFound().build());
    }
}

