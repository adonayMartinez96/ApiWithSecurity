package com.security.repoSecurity.Service.Interface;

import com.security.repoSecurity.Models.Users;

import java.util.List;

public interface IUsersService {
     void save(Users user);
     List<Users> getAll();
    // void editUsers(Users user);
     void deleteUsers(int id);

    interface IFabricaAlumnos {
    }
}
