package com.example.casemd4_canhan.service.account.impl;


import com.example.casemd4_canhan.model.account.Role;
import com.example.casemd4_canhan.model.account.RoleName;
import com.example.casemd4_canhan.repository.account.IRoleRepository;
import com.example.casemd4_canhan.service.account.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private IRoleRepository repository;

    @Override
    public Optional<Role> findByName(RoleName roleName) {
        return repository.findByName(roleName);
    }
}
