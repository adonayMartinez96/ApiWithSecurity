package com.security.repoSecurity.Controller;

import com.security.repoSecurity.DTO.RegisterDTO;
import com.security.repoSecurity.Models.Roles;
import com.security.repoSecurity.Models.Users;
import com.security.repoSecurity.Repository.RoleRepository;
import com.security.repoSecurity.Repository.UsersRepository;
import com.security.repoSecurity.Service.Implementations.ImpUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private ImpUsersService serviceUsers;

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @RequestMapping(value = "/saveUsers", method = RequestMethod.POST)
    public ResponseEntity<?> saveUsers(@RequestBody RegisterDTO registerDTO){
        if(usersRepository.existsByUsername(registerDTO.getUsername())){
            return  new ResponseEntity<>("Ese nombre ya existe", HttpStatus.BAD_REQUEST);
        }
        if(usersRepository.existsByEmail(registerDTO.getEmail())){
            return  new ResponseEntity<>("Ese correo ya existe", HttpStatus.BAD_REQUEST);
        }

        Users user = new Users();
        user.setUsername(registerDTO.getUsername());
        user.setPassword(passwordEncoder.encode(registerDTO.getPassword()));
        user.setEmail(registerDTO.getEmail());
        user.setFullName(registerDTO.getFullName());
        user.setEnabled(registerDTO.getEnabled());


        Roles role = new Roles();

        role.setAuthority("ROLE_USER");
        role = roleRepository.save(role);
        List<Roles> roles =new ArrayList<>();
        roles.add(role);

        user.setRoles(roles);


        usersRepository.save(user);

        return new ResponseEntity<>("Usuario registrado exitosamente", HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ROLE_USER')")
    @RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
    public List<Users> getAllUsers(){
        return  serviceUsers.getAll();
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
    public void deleteUserss(@PathVariable("id") int id){
        serviceUsers.deleteUsers(id);
    }


}
