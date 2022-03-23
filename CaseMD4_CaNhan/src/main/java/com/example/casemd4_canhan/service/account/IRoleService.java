package com.example.casemd4_canhan.service.account;



import com.example.casemd4_canhan.model.account.Role;
import com.example.casemd4_canhan.model.account.RoleName;

import java.util.Optional;

public interface IRoleService {
    Optional<Role> findByName(RoleName roleName);
}
