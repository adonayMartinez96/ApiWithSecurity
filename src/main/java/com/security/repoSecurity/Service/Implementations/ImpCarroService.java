package com.security.repoSecurity.Service.Implementations;

import com.security.repoSecurity.DTO.CarroDTO;
import com.security.repoSecurity.Models.Carro;
import com.security.repoSecurity.Repository.CarroRepository;
import com.security.repoSecurity.Service.Interface.ICarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImpCarroService implements ICarroService {
    @Autowired
    private CarroRepository carroRepository;

    @Override
    public void saveCarro(CarroDTO carroDTO) {
      Carro carro = new Carro();
      carro.setMarca(carroDTO.getMarca());
      carro.setModelo(carroDTO.getModelo());
      carro.setNumeroChazis(carroDTO.getNumeroChazis());
      carro.setTipoCombustible(carroDTO.getTipoCombustible());
      carro.setPrecio(carroDTO.getPrecio());
      carro.setColor(carroDTO.getColor());
      carro.setMillasRecorridas(carroDTO.getMillasRecorridas());
      carro.setNumeroPuertas(carroDTO.getNumeroPuertas());

      carroRepository.save(carro);
    }

    @Override
    public ResponseEntity<Carro> updateCarro(int id, CarroDTO carroDTO) {
        Optional<Carro> CrudData = carroRepository.findById(id);
        if (CrudData.isPresent()) {
            Carro carro = CrudData.get();

            carro.setMarca(carroDTO.getMarca());
            carro.setModelo(carroDTO.getModelo());
            carro.setNumeroChazis(carroDTO.getNumeroChazis());
            carro.setTipoCombustible(carroDTO.getTipoCombustible());
            carro.setPrecio(carroDTO.getPrecio());
            carro.setColor(carroDTO.getColor());
            carro.setMillasRecorridas(carroDTO.getMillasRecorridas());
            carro.setNumeroPuertas(carroDTO.getNumeroPuertas());
            return new ResponseEntity<>(carroRepository.save(carro), HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public List<Carro> getAllCarro() {
        return carroRepository.findAll();
    }

    @Override
    public ResponseEntity<?> deleteCarro(int id) {
        Optional<Carro> CrudData = carroRepository.findById(id);

        if(CrudData.isPresent()){
            carroRepository.deleteById(id);
            return new ResponseEntity<>("Carro con Id: " +id+ " eliminado", HttpStatus.OK);
        }else {
            return new ResponseEntity<>("no se encontro el carro carro con Id: " +id+ " eliminado", HttpStatus.NOT_FOUND);
        }
    }
}
