package com.example.casemd4_canhan.service.account;



import com.example.casemd4_canhan.model.account.User;

import java.util.Optional;

public interface IUserService {
    Optional<User> findByUsername(String username);

    Boolean existsByEmail(String email);
    Boolean existsByUsername(String username);

    Optional<User> findById(Long id);

    void save(User user);

    Iterable<User> findAll();

    void deleteById(Long id);

    Iterable<User> findUsersByNameContaining(String user_name);
}
