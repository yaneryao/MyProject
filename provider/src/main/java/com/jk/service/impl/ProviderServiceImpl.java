package com.jk.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.mapper.ProviderMapper;
import com.jk.pojo.Role;
import com.jk.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ProviderServiceImpl implements ProviderService {

    @Autowired
    private ProviderMapper providerMapper;


    @Override
    public List<Role> getRoles() {

        return providerMapper.getRoles();

    }

    @Override
    public void updateRole(Role role) {
        providerMapper.updateRole(role);
    }

    @Override
    public void delRole(String id) {
        providerMapper.delRole(id);
    }

    @Override
    public void addRole(Role role) {
        providerMapper.addRole(role);
    }
}
