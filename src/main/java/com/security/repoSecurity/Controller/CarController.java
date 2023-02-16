package com.security.repoSecurity.Controller;

import com.security.repoSecurity.Models.Carro;
import com.security.repoSecurity.Service.Implementations.ImpCarroService;
import com.security.repoSecurity.Service.Interface.ICarroService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {

    @Autowired
    private ImpCarroService impCarroService;

    @PreAuthorize("hasRole('ROLE_USER')")
    @RequestMapping(value = "/saveCar", method = RequestMethod.POST)
    public void saveCar(@RequestBody Carro carro){
        impCarroService.saveCarro(carro);
    }

    @RequestMapping(value = "/getAllCar", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ROLE_USER')")
    public List<Carro> getAllCar(){
        return impCarroService.getAllCarro();
    }

    @RequestMapping(value = "/deleteCar", method = RequestMethod.DELETE)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void deleteCar(int id){
        impCarroService.deleteCarro(id);
    }
}
