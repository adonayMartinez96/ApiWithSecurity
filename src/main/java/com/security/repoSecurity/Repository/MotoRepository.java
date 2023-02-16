package com.security.repoSecurity.Repository;

import com.security.repoSecurity.Models.Carro;
import com.security.repoSecurity.Models.Motocicleta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoRepository extends JpaRepository<Motocicleta,Integer> {
}
