package com.akademi.akademi.repository;

import com.akademi.akademi.entiny.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User ,String> {

}
