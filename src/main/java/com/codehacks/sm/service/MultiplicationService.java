package com.codehacks.sm.service;

import com.codehacks.sm.domain.Multiplication;
import org.springframework.stereotype.Service;

@Service
public interface MultiplicationService {

    /**
     * Create a Multiplication object with two randomly-generated
     * factors between 11 and 99.
     *
     * @return a Multiplication object with random objects.
     */
    Multiplication createRandomMultiplication();

}
