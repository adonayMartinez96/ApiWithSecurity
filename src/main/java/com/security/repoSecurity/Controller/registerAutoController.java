package com.security.repoSecurity.Controller;

import com.security.repoSecurity.DTO.AutoDTO;
import com.security.repoSecurity.DTO.CarroDTO;
import com.security.repoSecurity.DTO.MotoDTO;
import com.security.repoSecurity.DTO.RegisterDTO;
import com.security.repoSecurity.Models.Carro;
import com.security.repoSecurity.Models.Roles;
import com.security.repoSecurity.Models.Users;
import com.security.repoSecurity.Service.Implementations.ImpCarroService;
import com.security.repoSecurity.Service.Implementations.ImpMotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class registerAutoController {

    @Autowired
    private ImpCarroService carroService;

    @Autowired
    private ImpMotoService MotoService;

    private AutoDTO autoDTO2 = new AutoDTO();
    private CarroDTO carroDTO = new CarroDTO();
    private MotoDTO motoDTO = new MotoDTO();
    
    @RequestMapping(value = "/saveAuto/{tipo}", method = RequestMethod.POST)
    public void saveAuto(@RequestBody AutoDTO autoDTO, @PathVariable int tipo){

    }

}
