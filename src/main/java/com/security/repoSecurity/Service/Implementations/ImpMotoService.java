package com.security.repoSecurity.Service.Implementations;

import com.security.repoSecurity.Models.Carro;
import com.security.repoSecurity.Models.Motocicleta;
import com.security.repoSecurity.Repository.CarroRepository;
import com.security.repoSecurity.Service.Interface.ICarroService;
import com.security.repoSecurity.Service.Interface.IMotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImpMotoService implements IMotoService {

    @Override
    public void saveMot(Motocicleta moto) {

    }

    @Override
    public String updateMoto(int id) {
        return null;
    }

    @Override
    public List<Carro> getAllMOtos() {
        return null;
    }

    @Override
    public void deleteCarro(int id) {

    }
}
