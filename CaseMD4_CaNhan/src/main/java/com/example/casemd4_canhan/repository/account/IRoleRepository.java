package com.example.casemd4_canhan.repository.account;


import com.example.casemd4_canhan.model.account.Role;
import com.example.casemd4_canhan.model.account.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(RoleName roleName);
}
