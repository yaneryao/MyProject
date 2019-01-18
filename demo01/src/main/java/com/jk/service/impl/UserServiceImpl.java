package com.jk.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.mapper.UserMapper;
import com.jk.pojo.Role;
import com.jk.pojo.User;
import com.jk.service.ProviderService;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Reference
    private ProviderService providerService;



    @Override
    public List login(User user) {

        return userMapper.login(user);
    }

    @Override
    public List<Role> getRoles() {
        return providerService.getRoles();
    }
    @Override
    public void updateRole(Role role) {
        providerService.updateRole(role);
    }

    @Override
    public void delRole(String id) {
        providerService.delRole(id);
    }

    @Override
    public void addRole(Role role) {
        providerService.addRole(role);
    }
}
