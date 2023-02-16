package com.security.repoSecurity.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "usuarios", uniqueConstraints = { @UniqueConstraint(columnNames = { "username" }),
        @UniqueConstraint(columnNames = { "email" }) })
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private int id;

    @Getter @Setter
    private String username;

    @Getter @Setter
    private String password;

    @Getter @Setter
    private String fullName;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private Boolean enabled;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Roles> roles;




   /* public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }*/

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }

    public Users(String username, String password, String fullName ,String email , Boolean enabled) {

        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.enabled = enabled;
    }

    /*public Users(String username, String password, String fullName) {
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }*/
    public Users() {
        super();
        roles = new ArrayList<Roles>();
        enabled = true;
    }

}
