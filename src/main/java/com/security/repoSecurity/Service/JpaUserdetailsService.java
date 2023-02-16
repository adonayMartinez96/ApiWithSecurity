package com.security.repoSecurity.Service;

import com.security.repoSecurity.Models.Roles;
import com.security.repoSecurity.Models.Users;
import com.security.repoSecurity.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;


@Service
public class JpaUserdetailsService implements UserDetailsService {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
        Users user = usersRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail).
                orElseThrow(()-> new UsernameNotFoundException("Esuario con email o username: "+ usernameOrEmail+" no encontrado"));
        List<GrantedAuthority> authorities= new ArrayList<GrantedAuthority>();

        for(Roles role: user.getRoles()){
            authorities.add(new SimpleGrantedAuthority(role.getAuthority()));
        }

        return new User(user.getEmail(), user.getPassword(),authorities);
    }

   /* private Collection<? extends GrantedAuthority> mapearRoles(Set<Roles> roles){
        return roles.stream().map(rol -> new SimpleGrantedAuthority(rol.getAuthority())).collect(Collectors.toList());
    }*/
}
