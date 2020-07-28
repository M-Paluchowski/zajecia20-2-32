package com.example.demo.repository;

import com.example.demo.domain.User;
import com.example.demo.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}
