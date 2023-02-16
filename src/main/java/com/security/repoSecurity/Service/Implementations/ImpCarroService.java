package com.security.repoSecurity.Service.Implementations;

import com.security.repoSecurity.Models.AutoMotor;
import com.security.repoSecurity.Models.Carro;
import com.security.repoSecurity.Repository.CarroRepository;
import com.security.repoSecurity.Service.Interface.ICarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImpCarroService implements ICarroService {
    @Autowired
    private CarroRepository carroRepository;

    @Override
    public void saveCarro(AutoMotor auto) {
        Carro car = new Carro();

        car.setMarca(auto.getMarca());
        car.setModelo(auto.getModelo());
        car.setNumeroChazis(auto.getNumeroChazis());
        car.setTipoCombustible(auto.getTipoCombustible());
        car.setPrecio(auto.getPrecio());
        car.setColor(auto.getColor());
        car.setMillasRecorridas(auto.getMillasRecorridas());
        car.setNumeroPuertas(3);

        carroRepository.save(car);
    }

    @Override
    public String updateCarro(int id) {
        /*Boolean encontrado = carroRepository.existsById(id);
        if(encontrado == false){
            return "este carro no existe";
        }else {
            //carroRepository.save()
           carroRepository.findById(id);
        }*/
        return "hola";
    }

    @Override
    public List<Carro> getAllCarro() {
        return carroRepository.findAll();
    }

    @Override
    public void deleteCarro(int id) {
        carroRepository.deleteById(id);
    }
}
