package com.proyecto.demo.repository;

import com.proyecto.demo.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



import java.util.Optional;

//@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//@Query(value = "SELECT u.id as id, u.username as username, u.password as password FROM tb_usuario u WHERE u.username = ?1",nativeQuery = true)
    Optional<User> findByUsername(String username);
}