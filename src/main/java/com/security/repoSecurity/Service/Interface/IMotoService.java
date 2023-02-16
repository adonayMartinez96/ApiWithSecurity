package com.security.repoSecurity.Service.Interface;

import com.security.repoSecurity.Models.Carro;
import com.security.repoSecurity.Models.Motocicleta;

import java.util.List;

public interface IMotoService {
    void saveMot(Motocicleta moto);
    String updateMoto(int id);
    List<Carro> getAllMOtos();
    void deleteCarro(int id);

}
