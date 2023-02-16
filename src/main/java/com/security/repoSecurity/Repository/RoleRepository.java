package com.security.repoSecurity.Repository;

import com.security.repoSecurity.Models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RoleRepository extends JpaRepository< Roles,Integer> {

    /*public Optional<Roles> findByNombre(String nombre);*/
}
