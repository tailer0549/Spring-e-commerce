package com.curso.udemy.Repository;

import com.curso.udemy.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
