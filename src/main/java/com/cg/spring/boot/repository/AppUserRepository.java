package com.cg.spring.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.boot.model.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, String> {

}