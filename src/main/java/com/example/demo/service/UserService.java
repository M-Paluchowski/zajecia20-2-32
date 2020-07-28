package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.domain.UserRole;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final String ROLE_USER = "ROLE_USER";

    private UserRepository userRepository;
    private UserRoleRepository userRoleRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, UserRoleRepository userRoleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void save(String username, String password) {
        User user = new User();
        user.setEnabled(true);
        user.setPassword(passwordEncoder.encode(password));
        user.setUsername(username);
        userRepository.save(user);

        UserRole userRole = new UserRole();
        userRole.setUsername(username);
        userRole.setRole(ROLE_USER);
        userRoleRepository.save(userRole);
    }
}
