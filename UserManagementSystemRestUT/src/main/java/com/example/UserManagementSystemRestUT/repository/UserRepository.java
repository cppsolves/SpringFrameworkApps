package com.example.UserManagementSystemRestUT.repository;

import com.example.UserManagementSystemRestUT.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,Integer> {
}
