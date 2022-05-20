package com.example;

import org.jpmml.evaluator.Evaluator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.repository.EmployeeRepository;

@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
class EmployeeJpaTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private Evaluator evaluator; // If works properly, JPMMLConfiguration.defaultEvaluator will be injected

    @Test
    void test() {

    }
}
