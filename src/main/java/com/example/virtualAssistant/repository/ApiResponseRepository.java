package com.example.virtualAssistant.repository;

import java.util.List;

import com.example.virtualAssistant.model.ApiResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository

public interface ApiResponseRepository extends JpaRepository<ApiResponse, Integer> {
   // List<ApiResponse> findByUser_Name(String userName);
}
