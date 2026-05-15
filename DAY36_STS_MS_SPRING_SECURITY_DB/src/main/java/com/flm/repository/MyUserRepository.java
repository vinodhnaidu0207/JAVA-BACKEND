package com.flm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flm.entity.MyUser;

public interface MyUserRepository extends JpaRepository<MyUser, Long>{

	Optional<MyUser> findByUsername(String username);
}
