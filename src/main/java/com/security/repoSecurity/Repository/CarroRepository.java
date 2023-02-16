package com.security.repoSecurity.Repository;

import com.security.repoSecurity.Models.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro,Integer> {
}
