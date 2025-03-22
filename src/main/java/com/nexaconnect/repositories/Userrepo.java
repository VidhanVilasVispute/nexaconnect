
package com.nexaconnect.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nexaconnect.entities.User;

@Repository
public interface Userrepo extends JpaRepository<User, String> {
   

    Optional<User> findByEmail(String email);

    Optional<User> findByEmailAndPassword(String email, String password);

    Optional<User> findByEmailToken(String id);

}
