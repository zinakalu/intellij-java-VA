package com.example.virtualAssistant.repository;

import com.example.virtualAssistant.model.User12;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<User12, Integer> {

}
