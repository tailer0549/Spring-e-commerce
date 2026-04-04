package com.curso.udemy.Repositories;

import com.curso.udemy.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
