package com.security.repoSecurity.Repository;

import com.security.repoSecurity.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface UsersRepository extends JpaRepository<Users, Integer> {
    Users findByEmail(String email);
    Users findByUsername(String username);
    Optional<Users> findByUsernameOrEmail(String username, String email);
    public Boolean existsByUsername(String username);
    public Boolean existsByEmail(String email);
}
