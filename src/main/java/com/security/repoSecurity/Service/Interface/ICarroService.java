package com.security.repoSecurity.Service.Interface;

import com.security.repoSecurity.DTO.CarroDTO;
import com.security.repoSecurity.Models.AutoMotor;
import com.security.repoSecurity.Models.Carro;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ICarroService {
    void saveCarro(CarroDTO carroDTO);
    ResponseEntity<Carro> updateCarro(int id, CarroDTO carroDTO);
    List<Carro> getAllCarro();
    ResponseEntity<?> deleteCarro(int id);

}
