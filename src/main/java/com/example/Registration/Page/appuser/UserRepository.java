package com.example.Registration.Page.appuser;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional(readOnly = true)
public interface UserRepository {

    Optional <AppUser> findByEmail(String email);
}
