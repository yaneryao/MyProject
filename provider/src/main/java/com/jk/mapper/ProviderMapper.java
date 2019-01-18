package com.jk.mapper;

import com.jk.pojo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProviderMapper {
  List<Role> getRoles();

  void updateRole(Role role);

  void delRole(@Param("id")String id);

  void addRole(Role role);
}
