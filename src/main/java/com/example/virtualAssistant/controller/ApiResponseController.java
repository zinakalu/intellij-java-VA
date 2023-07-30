package com.example.virtualAssistant.controller;

import java.util.Optional;

import com.example.virtualAssistant.model.ApiResponse;
import com.example.virtualAssistant.repository.ApiResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/response")
public class ApiResponseController {

    @Autowired
    private ApiResponseRepository apiResponseRepository;

    @GetMapping(path = "/{responseId}")
    public Optional<ApiResponse> getApiResponsesById(@PathVariable int responseId) {
        return apiResponseRepository.findById(responseId);
    }

}
