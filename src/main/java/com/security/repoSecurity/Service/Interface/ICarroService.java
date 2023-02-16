package com.security.repoSecurity.Service.Interface;

import com.security.repoSecurity.Models.AutoMotor;
import com.security.repoSecurity.Models.Carro;

import java.util.List;

public interface ICarroService {
    void saveCarro(AutoMotor auto);
    String updateCarro(int id);
    List<Carro> getAllCarro();
    void deleteCarro(int id);

}
