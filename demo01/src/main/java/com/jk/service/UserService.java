package com.jk.service;

import com.jk.pojo.Role;
import com.jk.pojo.User;

import java.util.List;

public interface UserService {
    List login(User user);

    List<Role> getRoles();

    void updateRole(Role role);

    void delRole(String id);

    void addRole(Role role);
}
