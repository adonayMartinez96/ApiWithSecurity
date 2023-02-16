package com.security.repoSecurity.Service.Implementations;

import com.security.repoSecurity.Models.Roles;
import com.security.repoSecurity.Models.Users;
import com.security.repoSecurity.Repository.RoleRepository;
import com.security.repoSecurity.Repository.UsersRepository;
import com.security.repoSecurity.Service.Interface.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImpUsersService implements IUsersService {
    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void save(Users user) {
        String contraseña = user.getPassword();
        String  contraseñaEncode= passwordEncoder.encode(contraseña);
        user.setPassword(contraseñaEncode);

        Roles role = new Roles();

        role.setAuthority("ROLE_USER");
        role = roleRepository.save(role);
        List<Roles> roles =new ArrayList<>();
        roles.add(role);

        user.setRoles(roles);

        usersRepository.save(user);
    }

    @Override
    public List<Users> getAll() {
        return usersRepository.findAll();
    }

  /*  @Override
    public void editUsers(Users user) {
        usersRepository.save(user);
    }
*/
    @Override
    public void deleteUsers(int id) {
        usersRepository.deleteById(id);
    }


}
