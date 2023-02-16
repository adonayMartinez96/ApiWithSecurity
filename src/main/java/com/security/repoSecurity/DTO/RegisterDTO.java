package com.security.repoSecurity.DTO;

import com.security.repoSecurity.Models.Roles;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class RegisterDTO {

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

    private List<Roles> roles;

    public List<Roles> getRoles() {
        return roles;
    }

    public void setRoles(List<Roles> roles) {
        this.roles = roles;
    }

    public RegisterDTO() {
        super();
        roles = new ArrayList<Roles>();
        enabled = true;
    }
}
