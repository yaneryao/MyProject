package com.jk.service;

import com.jk.pojo.Role;

import java.util.List;

public interface ProviderService {
    List<Role> getRoles();

    void updateRole(Role role);

    void delRole(String id);

    void addRole(Role role);
}
