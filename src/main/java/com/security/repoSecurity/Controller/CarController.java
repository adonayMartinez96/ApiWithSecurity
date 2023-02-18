package com.security.repoSecurity.Controller;

import com.security.repoSecurity.DTO.CarroDTO;
import com.security.repoSecurity.Models.Carro;
import com.security.repoSecurity.Service.Implementations.ImpCarroService;
import com.security.repoSecurity.Service.Interface.ICarroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@RestController
public class CarController {

    @Autowired
    private ImpCarroService impCarroService;

    @PreAuthorize("hasRole('ROLE_USER')")
    @RequestMapping(value = "/getAllCar", method = RequestMethod.GET)
    public List<Carro> getAllCar(){
        return impCarroService.getAllCarro();
    }

    @PreAuthorize("hasRole('ROLE_USER')")
    @RequestMapping(value = "/saveCar", method = RequestMethod.POST)
    public ResponseEntity<?> saveCar(@RequestBody CarroDTO carro){
        impCarroService.saveCarro(carro);
        return new ResponseEntity<>("Usuario registrado exitosamente", HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "api/updateCar/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Carro> updateUser(@PathVariable int id, @RequestBody CarroDTO carroDTO) {
       return impCarroService.updateCarro(id, carroDTO);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "/deleteCar/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCar(@PathVariable int id){
        return impCarroService.deleteCarro(id);
    }
}
