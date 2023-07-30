package com.example.virtualAssistant.repository;

import com.example.virtualAssistant.model.UserInteractionsWithVirtualAssistant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInteractionsWithVirtualAssistantRepository
                extends JpaRepository<UserInteractionsWithVirtualAssistant, Integer> {

}
